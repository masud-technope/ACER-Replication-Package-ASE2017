/****************************************************************************
 * Copyright (c) 2008, 2011 Composent, Inc., IBM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Composent, Inc. - initial API and implementation
 *    Henrich Kraemer - bug 263869, testHttpsReceiveFile fails using HTTP proxy
 *    Henrich Kraemer - Bug 297742 - [transport] Investigate how to maintain HTTP session     
 *****************************************************************************/
package org.eclipse.ecf.provider.filetransfer.httpclient;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.auth.CredentialsProvider;
import org.apache.commons.httpclient.methods.HeadMethod;
import org.apache.commons.httpclient.util.DateUtil;
import org.eclipse.core.runtime.Assert;
import org.eclipse.ecf.core.security.Callback;
import org.eclipse.ecf.core.security.CallbackHandler;
import org.eclipse.ecf.core.security.IConnectContext;
import org.eclipse.ecf.core.security.NameCallback;
import org.eclipse.ecf.core.security.ObjectCallback;
import org.eclipse.ecf.core.security.UnsupportedCallbackException;
import org.eclipse.ecf.core.util.Proxy;
import org.eclipse.ecf.core.util.ProxyAddress;
import org.eclipse.ecf.core.util.Trace;
import org.eclipse.ecf.filetransfer.BrowseFileTransferException;
import org.eclipse.ecf.filetransfer.IRemoteFile;
import org.eclipse.ecf.filetransfer.IRemoteFileSystemListener;
import org.eclipse.ecf.filetransfer.IRemoteFileSystemRequest;
import org.eclipse.ecf.filetransfer.events.socket.ISocketEventSource;
import org.eclipse.ecf.filetransfer.identity.IFileID;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.Activator;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.ConnectingSocketMonitor;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.DebugOptions;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.HttpClientProxyCredentialProvider;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.Messages;
import org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser;
import org.eclipse.ecf.provider.filetransfer.browse.URLRemoteFile;
import org.eclipse.ecf.provider.filetransfer.events.socket.SocketEventSource;
import org.eclipse.ecf.provider.filetransfer.httpclient.HttpClientRetrieveFileTransfer.HostConfigHelper;
import org.eclipse.ecf.provider.filetransfer.util.JREProxyHelper;
import org.eclipse.ecf.provider.filetransfer.util.ProxySetupHelper;
import org.eclipse.osgi.util.NLS;

/**
 *
 */
public class HttpClientFileSystemBrowser extends AbstractFileSystemBrowser {

    // changing to 2 minutes (120000) as per bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=266246
    // 10/26/2009:  Added being able to set with system property with name org.eclipse.ecf.provider.filetransfer.httpclient.browse.connectTimeout
    // for https://bugs.eclipse.org/bugs/show_bug.cgi?id=292995
    protected static final int DEFAULT_CONNECTION_TIMEOUT = HttpClientOptions.BROWSE_DEFAULT_CONNECTION_TIMEOUT;

    //$NON-NLS-1$
    private static final String USERNAME_PREFIX = "Username:";

    private JREProxyHelper proxyHelper = null;

    private ConnectingSocketMonitor connectingSockets;

    protected String username = null;

    protected String password = null;

    protected HttpClient httpClient = null;

    protected volatile HeadMethod headMethod;

    protected HostConfigHelper hostConfigHelper;

    /**
	 * @param directoryOrFileID
	 * @param listener
	 */
    public  HttpClientFileSystemBrowser(HttpClient httpClient, IFileID directoryOrFileID, IRemoteFileSystemListener listener, URL directoryOrFileURL, IConnectContext connectContext, Proxy proxy) {
        super(directoryOrFileID, listener, directoryOrFileURL, connectContext, proxy);
        Assert.isNotNull(httpClient);
        this.httpClient = httpClient;
        this.proxyHelper = new JREProxyHelper();
        this.connectingSockets = new ConnectingSocketMonitor(1);
    }

    class HttpClientRemoteFileSystemRequest extends RemoteFileSystemRequest {

        protected SocketEventSource socketEventSource;

         HttpClientRemoteFileSystemRequest() {
            this.socketEventSource = new SocketEventSource() {

                public Object getAdapter(Class adapter) {
                    if (adapter == null) {
                        return null;
                    }
                    if (adapter.isInstance(this)) {
                        return this;
                    }
                    if (adapter.isInstance(HttpClientRemoteFileSystemRequest.this)) {
                        return HttpClientRemoteFileSystemRequest.this;
                    }
                    return null;
                }
            };
        }

        public Object getAdapter(Class adapter) {
            if (adapter == null) {
                return null;
            }
            return socketEventSource.getAdapter(adapter);
        }

        public void cancel() {
            HttpClientFileSystemBrowser.this.cancel();
        }
    }

    protected IRemoteFileSystemRequest createRemoteFileSystemRequest() {
        return new HttpClientRemoteFileSystemRequest();
    }

    protected void cancel() {
        if (isCanceled()) {
            // break job cancel recursion
            return;
        }
        setCanceled(getException());
        super.cancel();
        if (headMethod != null) {
            if (!headMethod.isAborted()) {
                headMethod.abort();
            }
        }
        if (connectingSockets != null) {
            connectingSockets.closeSockets();
        }
    }

    protected boolean hasForceNTLMProxyOption() {
        return (System.getProperties().getProperty(HttpClientOptions.FORCE_NTLM_PROP) != null);
    }

    protected void setupProxies() {
        // If it's been set directly (via ECF API) then this overrides platform settings
        if (proxy == null) {
            try {
                // give SOCKS priority see https://bugs.eclipse.org/bugs/show_bug.cgi?id=295030#c61
                proxy = ProxySetupHelper.getSocksProxy(directoryOrFile);
                if (proxy == null) {
                    proxy = ProxySetupHelper.getProxy(directoryOrFile.toExternalForm());
                }
            } catch (NoClassDefFoundError e) {
                Activator.logNoProxyWarning(e);
            }
        }
        if (proxy != null)
            setupProxy(proxy);
    }

    private void initHttpClientConnectionManager() {
        //Currently there is no API to pass in options to browse request
        Map options = null;
        Activator.getDefault().getConnectionManagerHelper().initConnectionManager(httpClient, options);
    }

    /* (non-Javadoc)
	 * @see org.eclipse.ecf.provider.filetransfer.browse.AbstractFileSystemBrowser#runRequest()
	 */
    protected void runRequest() throws Exception {
        //$NON-NLS-1$
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "runRequest");
        setupProxies();
        // set timeout
        initHttpClientConnectionManager();
        String urlString = directoryOrFile.toString();
        CredentialsProvider credProvider = new HttpClientProxyCredentialProvider() {

            protected Proxy getECFProxy() {
                return getProxy();
            }

            protected Credentials getNTLMCredentials(Proxy lp) {
                if (hasForceNTLMProxyOption())
                    return HttpClientRetrieveFileTransfer.createNTLMCredentials(lp);
                return null;
            }
        };
        // setup authentication
        setupAuthentication(urlString);
        // setup https host and port
        setupHostAndPort(credProvider, urlString);
        headMethod = new HeadMethod(hostConfigHelper.getTargetRelativePath());
        headMethod.setFollowRedirects(true);
        // Define a CredentialsProvider - found that possibility while debugging in org.apache.commons.httpclient.HttpMethodDirector.processProxyAuthChallenge(HttpMethod)
        // Seems to be another way to select the credentials.
        headMethod.getParams().setParameter(CredentialsProvider.PROVIDER, credProvider);
        //$NON-NLS-1$
        int maxAge = Integer.getInteger("org.eclipse.ecf.http.cache.max-age", 0).intValue();
        // fix the fix for bug 249990 with bug 410813
        if (maxAge == 0) {
            //$NON-NLS-1$//$NON-NLS-2$
            headMethod.addRequestHeader("Cache-Control", "max-age=0");
        } else if (maxAge > 0) {
            //$NON-NLS-1$//$NON-NLS-2$
            headMethod.addRequestHeader("Cache-Control", "max-age=" + maxAge);
        }
        //$NON-NLS-1$ //$NON-NLS-2$
        headMethod.addRequestHeader("Connection", "Keep-Alive");
        long lastModified = 0;
        long fileLength = -1;
        connectingSockets.clear();
        int code = -1;
        try {
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "browse=" + urlString);
            code = httpClient.executeMethod(getHostConfiguration(), headMethod);
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "browse resp=" + code);
            // Check for NTLM proxy in response headers 
            // This check is to deal with bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=252002
            boolean ntlmProxyFound = NTLMProxyDetector.detectNTLMProxy(headMethod);
            if (ntlmProxyFound && !hasForceNTLMProxyOption())
                throw new //$NON-NLS-1$
                BrowseFileTransferException(//$NON-NLS-1$
                "HttpClient Provider is not configured to support NTLM proxy authentication.", //$NON-NLS-1$
                HttpClientOptions.NTLM_PROXY_RESPONSE_CODE);
            if (code == HttpURLConnection.HTTP_OK) {
                fileLength = headMethod.getResponseContentLength();
                lastModified = getLastModifiedTimeFromHeader();
            } else if (code == HttpURLConnection.HTTP_NOT_FOUND) {
                throw new //$NON-NLS-1$
                BrowseFileTransferException(//$NON-NLS-1$
                NLS.bind("File not found: {0}", urlString), //$NON-NLS-1$
                code);
            } else if (code == HttpURLConnection.HTTP_UNAUTHORIZED) {
                throw new BrowseFileTransferException(Messages.HttpClientRetrieveFileTransfer_Unauthorized, code);
            } else if (code == HttpURLConnection.HTTP_FORBIDDEN) {
                throw new //$NON-NLS-1$
                BrowseFileTransferException(//$NON-NLS-1$
                "Forbidden", //$NON-NLS-1$
                code);
            } else if (code == HttpURLConnection.HTTP_PROXY_AUTH) {
                throw new BrowseFileTransferException(Messages.HttpClientRetrieveFileTransfer_Proxy_Auth_Required, code);
            } else {
                throw new BrowseFileTransferException(NLS.bind(Messages.HttpClientRetrieveFileTransfer_ERROR_GENERAL_RESPONSE_CODE, new Integer(code)), code);
            }
            remoteFiles = new IRemoteFile[1];
            remoteFiles[0] = new URLRemoteFile(lastModified, fileLength, fileID);
        } catch (Exception e) {
            Trace.throwing(Activator.PLUGIN_ID, DebugOptions.EXCEPTIONS_THROWING, this.getClass(), "runRequest", e);
            BrowseFileTransferException ex = (BrowseFileTransferException) ((e instanceof BrowseFileTransferException) ? e : new BrowseFileTransferException(NLS.bind(Messages.HttpClientRetrieveFileTransfer_EXCEPTION_COULD_NOT_CONNECT, urlString), e, code));
            throw ex;
        } finally {
            headMethod.releaseConnection();
        }
    }

    private long getLastModifiedTimeFromHeader() throws IOException {
        //$NON-NLS-1$
        Header lastModifiedHeader = headMethod.getResponseHeader("Last-Modified");
        if (lastModifiedHeader == null)
            return 0L;
        String lastModifiedString = lastModifiedHeader.getValue();
        long lastModified = 0;
        if (lastModifiedString != null) {
            try {
                lastModified = DateUtil.parseDate(lastModifiedString).getTime();
            } catch (Exception e) {
                throw new IOException(Messages.HttpClientRetrieveFileTransfer_EXCEPITION_INVALID_LAST_MODIFIED_FROM_SERVER);
            }
        }
        return lastModified;
    }

    Proxy getProxy() {
        return proxy;
    }

    protected void setupHostAndPort(CredentialsProvider credProvider, String urlString) {
        // creates hostConfigHelper if needed
        getHostConfiguration();
        hostConfigHelper.setTargetHostByURL(credProvider, urlString);
    }

    protected Credentials getFileRequestCredentials() throws UnsupportedCallbackException, IOException {
        if (connectContext == null)
            return null;
        final CallbackHandler callbackHandler = connectContext.getCallbackHandler();
        if (callbackHandler == null)
            return null;
        final NameCallback usernameCallback = new NameCallback(USERNAME_PREFIX);
        final ObjectCallback passwordCallback = new ObjectCallback();
        callbackHandler.handle(new Callback[] { usernameCallback, passwordCallback });
        username = usernameCallback.getName();
        password = (String) passwordCallback.getObject();
        return new UsernamePasswordCredentials(username, password);
    }

    protected void setupAuthentication(String urlString) throws UnsupportedCallbackException, IOException {
        Credentials credentials = null;
        if (username == null) {
            credentials = getFileRequestCredentials();
        }
        if (credentials != null && username != null) {
            final AuthScope authScope = new AuthScope(HttpClientRetrieveFileTransfer.getHostFromURL(urlString), HttpClientRetrieveFileTransfer.getPortFromURL(urlString), AuthScope.ANY_REALM);
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "browse credentials=" + credentials);
            httpClient.getState().setCredentials(authScope, credentials);
        }
    }

    private HostConfiguration getHostConfiguration() {
        if (hostConfigHelper == null) {
            ISocketEventSource source = (ISocketEventSource) job.getRequest().getAdapter(ISocketEventSource.class);
            hostConfigHelper = new HostConfigHelper(source, connectingSockets);
        }
        return hostConfigHelper.getHostConfiguration();
    }

    protected void setupProxy(Proxy proxy) {
        if (proxy.getType().equals(Proxy.Type.HTTP)) {
            final ProxyAddress address = proxy.getAddress();
            getHostConfiguration().setProxy(address.getHostName(), address.getPort());
        } else if (proxy.getType().equals(Proxy.Type.SOCKS)) {
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "brows socksproxy=" + proxy.getAddress());
            proxyHelper.setupProxy(proxy);
        }
    }
}
