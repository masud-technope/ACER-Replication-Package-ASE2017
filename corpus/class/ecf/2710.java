/*******************************************************************************
 * Copyright (c) 2004, 2011 Composent, Inc., IBM All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: 
 *  Composent, Inc. - initial API and implementation
 *  Maarten Meijer - bug 237936, added gzip encoded transfer default
 *  Henrich Kraemer - bug 263869, testHttpsReceiveFile fails using HTTP proxy
 *  Henrich Kraemer - bug 263613, [transport] Update site contacting / downloading is not cancelable
 *  Henrich Kraemer - Bug 297742 - [transport] Investigate how to maintain HTTP session  
 ******************************************************************************/
package org.eclipse.ecf.provider.filetransfer.httpclient;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.SocketFactory;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpConnection;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.commons.httpclient.NTCredentials;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.auth.CredentialsProvider;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
import org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory;
import org.apache.commons.httpclient.util.DateUtil;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.security.Callback;
import org.eclipse.ecf.core.security.CallbackHandler;
import org.eclipse.ecf.core.security.IConnectContext;
import org.eclipse.ecf.core.security.NameCallback;
import org.eclipse.ecf.core.security.ObjectCallback;
import org.eclipse.ecf.core.security.UnsupportedCallbackException;
import org.eclipse.ecf.core.util.Proxy;
import org.eclipse.ecf.core.util.ProxyAddress;
import org.eclipse.ecf.core.util.Trace;
import org.eclipse.ecf.filetransfer.FileTransferJob;
import org.eclipse.ecf.filetransfer.IFileRangeSpecification;
import org.eclipse.ecf.filetransfer.IFileTransferPausable;
import org.eclipse.ecf.filetransfer.IFileTransferRunnable;
import org.eclipse.ecf.filetransfer.IRetrieveFileTransferOptions;
import org.eclipse.ecf.filetransfer.IncomingFileTransferException;
import org.eclipse.ecf.filetransfer.InvalidFileRangeSpecificationException;
import org.eclipse.ecf.filetransfer.events.IFileTransferConnectStartEvent;
import org.eclipse.ecf.filetransfer.events.socket.ISocketEventSource;
import org.eclipse.ecf.filetransfer.events.socket.ISocketListener;
import org.eclipse.ecf.filetransfer.identity.IFileID;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.Activator;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.ConnectingSocketMonitor;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.ConnectionManagerHelper;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.DebugOptions;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.ECFHttpClientProtocolSocketFactory;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.ECFHttpClientSecureProtocolSocketFactory;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.HttpClientProxyCredentialProvider;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.ISSLSocketFactoryModifier;
import org.eclipse.ecf.internal.provider.filetransfer.httpclient.Messages;
import org.eclipse.ecf.provider.filetransfer.events.socket.SocketEventSource;
import org.eclipse.ecf.provider.filetransfer.identity.FileTransferID;
import org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer;
import org.eclipse.ecf.provider.filetransfer.retrieve.HttpHelper;
import org.eclipse.ecf.provider.filetransfer.util.JREProxyHelper;
import org.eclipse.ecf.provider.filetransfer.util.ProxySetupHelper;
import org.eclipse.osgi.util.NLS;

public class HttpClientRetrieveFileTransfer extends AbstractRetrieveFileTransfer {

    /**
	 * gzip encoding wrapper for httpclient class. Copied from Mylyn project, bug 205708
	 *
	 */
    public class GzipGetMethod extends GetMethod {

        //$NON-NLS-1$
        private static final String CONTENT_ENCODING = "Content-Encoding";

        //$NON-NLS-1$
        private static final String ACCEPT_ENCODING = "Accept-encoding";

        //$NON-NLS-1$
        private static final String CONTENT_ENCODING_GZIP = "gzip";

        private static final String CONTENT_ENCODING_ACCEPTED = CONTENT_ENCODING_GZIP;

        private boolean gzipReceived = false;

        public  GzipGetMethod(String urlString) {
            super(urlString);
        }

        private boolean isZippedResponse() {
            // see bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=269018
            boolean contentEncodingGzip = (null != this.getResponseHeader(CONTENT_ENCODING) && this.getResponseHeader(CONTENT_ENCODING).getValue().equals(CONTENT_ENCODING_GZIP));
            //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            Trace.trace(Activator.PLUGIN_ID, "Content-Encoding: gzip header " + (contentEncodingGzip ? "PRESENT" : "ABSENT"));
            boolean hasGzSuffix = targetHasGzSuffix(remoteFileName);
            return contentEncodingGzip && !hasGzSuffix;
        }

        public int execute(HttpState state, HttpConnection conn) throws HttpException, IOException {
            //$NON-NLS-1$
            Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "GzipGetMethod.execute");
            // Insert accept-encoding header
            int result = super.execute(state, conn);
            // Code to deal with implications described on bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=261881
            switch(result) {
                case HttpStatus.SC_MOVED_TEMPORARILY:
                case HttpStatus.SC_MOVED_PERMANENTLY:
                case HttpStatus.SC_SEE_OTHER:
                case HttpStatus.SC_TEMPORARY_REDIRECT:
                    //$NON-NLS-1$ //$NON-NLS-2$
                    Trace.trace(Activator.PLUGIN_ID, "GzipGetMethod.execute.  Received redirect=" + result + ".  Removing gzip accept encoding");
                    gzipReceived = false;
                    removeRequestHeader(GzipGetMethod.ACCEPT_ENCODING);
                default:
            }
            // test what is sent back
            //$NON-NLS-1$
            Trace.exiting(Activator.PLUGIN_ID, DebugOptions.METHODS_EXITING, this.getClass(), "GzipGetMethod.execute", new Integer(result));
            return result;
        }

        public InputStream getResponseBodyAsUnzippedStream() throws IOException {
            gzipReceived = isZippedResponse();
            InputStream input = super.getResponseBodyAsStream();
            try {
                if (gzipReceived) {
                    Trace.trace(Activator.PLUGIN_ID, "Using gzip input stream to decode");
                    // extract on the fly
                    return new java.util.zip.GZIPInputStream(input);
                }
                //$NON-NLS-1$
                Trace.trace(//$NON-NLS-1$
                Activator.PLUGIN_ID, //$NON-NLS-1$
                "Not using gzip input stream");
            } catch (IOException e) {
                Activator.getDefault().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, IStatus.WARNING, "Exception creating gzip input stream", e));
                throw e;
            }
            return input;
        }

        private Object releaseLock = new Object();

        // This override is a workaround for 
        // https://bugs.eclipse.org/bugs/show_bug.cgi?id=279457
        // This makes GetMethod.releaseConnection non-reentrant,
        // as with reentrancy under some circumstances a NPE can be 
        // thrown with multithreaded access
        public void releaseConnection() {
            synchronized (releaseLock) {
                super.releaseConnection();
            }
        }
    }

    static final class HostConfigHelper {

        private ISocketEventSource source;

        private ISocketListener socketListener;

        private String targetURL;

        private String targetRelativePath;

        private HostConfiguration hostConfiguration;

        public  HostConfigHelper(ISocketEventSource source, ISocketListener socketListener) {
            Assert.isNotNull(source);
            this.source = source;
            this.socketListener = socketListener;
            hostConfiguration = new HostConfiguration();
        }

        public HostConfiguration getHostConfiguration() {
            return hostConfiguration;
        }

        // drops the scheme server and port (e.g http://server:8080/a/b.html -> /a/b.html
        private static String getTargetRelativePathFromURL(String url) {
            // RFC 3986
            /* 
			 *      
			 *     URI    = scheme ":" hier-part [ "?" query ] [ "#" fragment ]

			      hier-part =  "//" authority path-abempty
			                 / path-absolute
			                 / path-rootless
			                 / path-empty     
			 *      
			 *      path  = path-abempty    ; begins with "/" or is empty
			              / path-absolute   ; begins with "/" but not "//"
			              / path-noscheme   ; begins with a non-colon segment
			              / path-rootless   ; begins with a segment
			              / path-empty      ; zero characters

			 * 
			 */
            // This routine is supposed to remove authority information from the url
            // to make this a 'relative path' for
            // HttpClients method constructor (for example GetMethod(String uri)) as
            // ECF executes methods passing in a HostConfiguration which represents the
            // authority.
            //$NON-NLS-1$
            final int colonSlashSlash = url.indexOf("://");
            if (colonSlashSlash < 0)
                return url;
            // '://' indicates there must be an authority.
            // the authority must not contain a '/' character.
            final int nextSlash = url.indexOf('/', colonSlashSlash + 3);
            if (nextSlash == -1) {
                //$NON-NLS-1$ 
                return "";
            }
            // include the slash
            String relativeURL = url.substring(nextSlash);
            // for a full explanation
            if (//$NON-NLS-1$
            relativeURL.startsWith("//")) {
                final String //$NON-NLS-1$
                host = //$NON-NLS-1$
                "example.com";
                relativeURL = //$NON-NLS-1$
                "//" + host + //$NON-NLS-1$
                relativeURL;
            }
            return relativeURL;
        }

        public void setTargetHostByURL(CredentialsProvider credProvider, String url) {
            this.targetURL = url;
            this.targetRelativePath = getTargetRelativePathFromURL(targetURL);
            String host = getHostFromURL(targetURL);
            int port = getPortFromURL(targetURL);
            if (HttpClientRetrieveFileTransfer.urlUsesHttps(targetURL)) {
                ISSLSocketFactoryModifier sslSocketFactoryModifier = Activator.getDefault().getSSLSocketFactoryModifier();
                if (sslSocketFactoryModifier == null) {
                    sslSocketFactoryModifier = new HttpClientDefaultSSLSocketFactoryModifier();
                }
                SecureProtocolSocketFactory psf = new ECFHttpClientSecureProtocolSocketFactory(sslSocketFactoryModifier, source, socketListener);
                Protocol sslProtocol = new Protocol(HttpClientRetrieveFileTransfer.HTTPS, (ProtocolSocketFactory) psf, HTTPS_PORT);
                //$NON-NLS-1$ //$NON-NLS-2$
                Trace.trace(Activator.PLUGIN_ID, "retrieve host=" + host + ";port=" + port);
                hostConfiguration.setHost(host, port, sslProtocol);
                hostConfiguration.getParams().setParameter(CredentialsProvider.PROVIDER, credProvider);
            } else {
                ProtocolSocketFactory psf = new ECFHttpClientProtocolSocketFactory(SocketFactory.getDefault(), source, socketListener);
                Protocol protocol = new Protocol(HttpClientRetrieveFileTransfer.HTTP, psf, HTTP_PORT);
                //$NON-NLS-1$ //$NON-NLS-2$
                Trace.trace(Activator.PLUGIN_ID, "retrieve host=" + host + ";port=" + port);
                hostConfiguration.setHost(host, port, protocol);
                hostConfiguration.getParams().setParameter(CredentialsProvider.PROVIDER, credProvider);
            }
        }

        public String getTargetRelativePath() {
            return targetRelativePath;
        }
    }

    private static final String USERNAME_PREFIX = Messages.HttpClientRetrieveFileTransfer_Username_Prefix;

    // changing to 2 minutes (120000) as per bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=266246
    // 10/26/2009:  Added being able to set with system property with name org.eclipse.ecf.provider.filetransfer.httpclient.retrieve.connectTimeout
    // for https://bugs.eclipse.org/bugs/show_bug.cgi?id=292995
    protected static final int DEFAULT_CONNECTION_TIMEOUT = ConnectionManagerHelper.DEFAULT_CONNECTION_TIMEOUT;

    // changing to 2 minutes (120000) as per bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=266246
    // 10/26/2009:  Added being able to set with system property with name org.eclipse.ecf.provider.filetransfer.httpclient.retrieve.readTimeout
    // for https://bugs.eclipse.org/bugs/show_bug.cgi?id=292995
    protected static final int DEFAULT_READ_TIMEOUT = ConnectionManagerHelper.DEFAULT_READ_TIMEOUT;

    protected static final int HTTP_PORT = 80;

    protected static final int HTTPS_PORT = 443;

    protected static final int MAX_RETRY = 2;

    protected static final String HTTPS = Messages.FileTransferNamespace_Https_Protocol;

    protected static final String HTTP = Messages.FileTransferNamespace_Http_Protocol;

    protected static final String[] supportedProtocols = { HTTP, HTTPS };

    //$NON-NLS-1$
    private static final String LAST_MODIFIED_HEADER = "Last-Modified";

    private GzipGetMethod getMethod = null;

    private HttpClient httpClient = null;

    private String username;

    private String password;

    private int responseCode = -1;

    private volatile boolean doneFired = false;

    private String remoteFileName;

    protected int httpVersion = 1;

    protected IFileID fileid = null;

    protected JREProxyHelper proxyHelper = null;

    private HostConfigHelper hostConfigHelper;

    private SocketEventSource socketEventSource;

    private ConnectingSocketMonitor connectingSockets;

    private FileTransferJob connectJob;

    public  HttpClientRetrieveFileTransfer(HttpClient client) {
        this.httpClient = client;
        proxyHelper = new JREProxyHelper();
        connectingSockets = new ConnectingSocketMonitor(1);
        socketEventSource = new SocketEventSource() {

            public Object getAdapter(Class adapter) {
                if (adapter == null) {
                    return null;
                }
                if (adapter.isInstance(this)) {
                    return this;
                }
                return HttpClientRetrieveFileTransfer.this.getAdapter(adapter);
            }
        };
    }

    /* (non-Javadoc)
	 * @see org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer#getRemoteFileName()
	 */
    public String getRemoteFileName() {
        return remoteFileName;
    }

    public synchronized void cancel() {
        //$NON-NLS-1$
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "cancel");
        if (isCanceled()) {
            // break job cancel recursion
            return;
        }
        setDoneCanceled(exception);
        boolean fireDoneEvent = true;
        if (connectJob != null) {
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "calling connectJob.cancel()");
            connectJob.cancel();
        }
        synchronized (jobLock) {
            if (job != null) {
                // Its the transfer jobs responsibility to throw the event.
                fireDoneEvent = false;
                //$NON-NLS-1$
                Trace.trace(//$NON-NLS-1$
                Activator.PLUGIN_ID, //$NON-NLS-1$
                "calling transfer job.cancel()");
                job.cancel();
            }
        }
        if (getMethod != null) {
            if (!getMethod.isAborted()) {
                //$NON-NLS-1$
                Trace.trace(//$NON-NLS-1$
                Activator.PLUGIN_ID, //$NON-NLS-1$
                "calling getMethod.abort()");
                getMethod.abort();
            }
        }
        if (connectingSockets != null) {
            connectingSockets.closeSockets();
        }
        hardClose();
        if (fireDoneEvent) {
            fireTransferReceiveDoneEvent();
        }
        //$NON-NLS-1$
        Trace.exiting(Activator.PLUGIN_ID, DebugOptions.METHODS_EXITING, this.getClass(), "cancel");
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer#hardClose()
	 */
    protected void hardClose() {
        // changed for addressing bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=370801
        if (getMethod != null) {
            // First, if !isDone and paused
            if (!isDone() && isPaused())
                getMethod.abort();
            // release in any case
            getMethod.releaseConnection();
            // and set to null
            getMethod = null;
        }
        // Close output stream...if we're supposed to
        try {
            if (localFileContents != null && closeOutputStream)
                localFileContents.close();
        } catch (final IOException e) {
            Activator.getDefault().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR, "hardClose", e));
        }
        // clear input and output streams
        remoteFileContents = null;
        localFileContents = null;
        // reset response code
        responseCode = -1;
        // If we're done and proxy helper still exists, then dispose
        if (proxyHelper != null && isDone()) {
            proxyHelper.dispose();
            proxyHelper = null;
        }
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

    protected void setupProxies() {
        // If it's been set directly (via ECF API) then this overrides platform settings
        if (proxy == null) {
            try {
                // give SOCKS priority see https://bugs.eclipse.org/bugs/show_bug.cgi?id=295030#c61
                proxy = ProxySetupHelper.getSocksProxy(getRemoteFileURL());
                if (proxy == null) {
                    proxy = ProxySetupHelper.getProxy(getRemoteFileURL().toExternalForm());
                }
            } catch (NoClassDefFoundError e) {
                Activator.logNoProxyWarning(e);
            }
        }
        if (proxy != null)
            setupProxy(proxy);
    }

    protected void setupAuthentication(String urlString) throws UnsupportedCallbackException, IOException {
        Credentials credentials = null;
        if (username == null) {
            credentials = getFileRequestCredentials();
        }
        if (credentials != null && username != null) {
            final AuthScope authScope = new AuthScope(getHostFromURL(urlString), getPortFromURL(urlString), AuthScope.ANY_REALM);
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "retrieve credentials=" + credentials);
            httpClient.getState().setCredentials(authScope, credentials);
        }
    }

    protected void setupHostAndPort(CredentialsProvider credProvider, String urlString) {
        // creates hostConfigHelper if needed
        getHostConfiguration();
        hostConfigHelper.setTargetHostByURL(credProvider, urlString);
    }

    protected void setRequestHeaderValues() throws InvalidFileRangeSpecificationException {
        final IFileRangeSpecification rangeSpec = getFileRangeSpecification();
        if (rangeSpec != null) {
            final long startPosition = rangeSpec.getStartPosition();
            final long endPosition = rangeSpec.getEndPosition();
            if (startPosition < 0)
                throw new InvalidFileRangeSpecificationException(Messages.HttpClientRetrieveFileTransfer_RESUME_START_POSITION_LESS_THAN_ZERO, rangeSpec);
            if (endPosition != -1L && endPosition <= startPosition)
                throw new InvalidFileRangeSpecificationException(Messages.HttpClientRetrieveFileTransfer_RESUME_ERROR_END_POSITION_LESS_THAN_START, rangeSpec);
            //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            String rangeHeader = "bytes=" + startPosition + "-" + ((endPosition == -1L) ? "" : ("" + endPosition));
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "retrieve range header=" + rangeHeader);
            setRangeHeader(rangeHeader);
        }
        //$NON-NLS-1$
        int maxAge = Integer.getInteger("org.eclipse.ecf.http.cache.max-age", 0).intValue();
        // fix the fix for bug 249990 with bug 410813
        if (maxAge == 0) {
            //$NON-NLS-1$//$NON-NLS-2$
            getMethod.addRequestHeader("Cache-Control", "max-age=0");
        } else if (maxAge > 0) {
            //$NON-NLS-1$//$NON-NLS-2$
            getMethod.addRequestHeader("Cache-Control", "max-age=" + maxAge);
        }
        setRequestHeaderValuesFromOptions();
    }

    private void setRequestHeaderValuesFromOptions() {
        Map localOptions = getOptions();
        if (localOptions != null) {
            Object o = localOptions.get(IRetrieveFileTransferOptions.REQUEST_HEADERS);
            if (o != null && o instanceof Map) {
                Map requestHeaders = (Map) o;
                for (Iterator i = requestHeaders.keySet().iterator(); i.hasNext(); ) {
                    Object n = i.next();
                    Object v = requestHeaders.get(n);
                    if (n != null && n instanceof String && v != null && v instanceof String)
                        getMethod.addRequestHeader((String) n, (String) v);
                }
            }
        }
    }

    private void setRangeHeader(String value) {
        //$NON-NLS-1$
        getMethod.addRequestHeader("Range", value);
    }

    private boolean isHTTP11() {
        return (httpVersion >= 1);
    }

    public int getResponseCode() {
        if (responseCode != -1)
            return responseCode;
        HttpVersion version = getMethod.getEffectiveVersion();
        if (version == null) {
            responseCode = -1;
            httpVersion = 1;
            return responseCode;
        }
        httpVersion = version.getMinor();
        responseCode = getMethod.getStatusCode();
        return responseCode;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ecf.core.identity.IIdentifiable#getID()
	 */
    public ID getID() {
        return fileid;
    }

    private long getLastModifiedTimeFromHeader() throws IOException {
        Header lastModifiedHeader = getMethod.getResponseHeader(LAST_MODIFIED_HEADER);
        if (lastModifiedHeader == null)
            throw new IOException(Messages.HttpClientRetrieveFileTransfer_INVALID_LAST_MODIFIED_TIME);
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

    protected void getResponseHeaderValues() throws IOException {
        if (getResponseCode() == -1)
            throw new IOException(Messages.HttpClientRetrieveFileTransfer_INVALID_SERVER_RESPONSE_TO_PARTIAL_RANGE_REQUEST);
        Header lastModifiedHeader = getMethod.getResponseHeader(LAST_MODIFIED_HEADER);
        if (lastModifiedHeader != null) {
            setLastModifiedTime(getLastModifiedTimeFromHeader());
        }
        setFileLength(getMethod.getResponseContentLength());
        fileid = new FileTransferID(getRetrieveNamespace(), getRemoteFileURL());
        // Get content disposition header and get remote file name from it if possible.
        Header contentDispositionHeader = getMethod.getResponseHeader(HttpHelper.CONTENT_DISPOSITION_HEADER);
        if (contentDispositionHeader != null) {
            remoteFileName = HttpHelper.getRemoteFileNameFromContentDispositionHeader(contentDispositionHeader.getValue());
        }
        // If still null, get the path from httpclient.getMethod()
        if (remoteFileName == null) {
            // No name could be extracted using Content-Disposition. Let's try the
            // path from the getMethod.
            String pathStr = getMethod.getPath();
            if (pathStr != null && pathStr.length() > 0) {
                IPath path = Path.fromPortableString(pathStr);
                if (path.segmentCount() > 0)
                    remoteFileName = path.lastSegment();
            }
            // If still null, use the input file name
            if (remoteFileName == null)
                // Last resort. Use the path of the initial URL request
                remoteFileName = super.getRemoteFileName();
        }
    }

    final class ECFCredentialsProvider extends HttpClientProxyCredentialProvider {

        protected Proxy getECFProxy() {
            return getProxy();
        }

        protected Credentials getNTLMCredentials(Proxy lp) {
            if (hasForceNTLMProxyOption())
                return HttpClientRetrieveFileTransfer.createNTLMCredentials(lp);
            return null;
        }
    }

    Proxy getProxy() {
        return proxy;
    }

    protected void setInputStream(InputStream ins) {
        remoteFileContents = ins;
    }

    protected InputStream wrapTransferReadInputStream(InputStream inputStream, IProgressMonitor monitor) {
        // Added to address bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=370801
        return new NoCloseWrapperInputStream(inputStream);
    }

    // Added to address bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=370801
    class NoCloseWrapperInputStream extends FilterInputStream {

        protected  NoCloseWrapperInputStream(InputStream in) {
            super(in);
        }

        public void close() {
        // do nothing
        }
    }

    protected boolean hasForceNTLMProxyOption() {
        Map localOptions = getOptions();
        if (localOptions != null && localOptions.get(HttpClientOptions.FORCE_NTLM_PROP) != null)
            return true;
        return (System.getProperties().getProperty(HttpClientOptions.FORCE_NTLM_PROP) != null);
    }

    protected int getSocketReadTimeout() {
        return ConnectionManagerHelper.getSocketReadTimeout(getOptions());
    }

    /**
	 * @since 4.0
	 */
    protected int getConnectTimeout() {
        return ConnectionManagerHelper.getConnectTimeout(getOptions());
    }

    private void initHttpClientConnectionManager() {
        Activator.getDefault().getConnectionManagerHelper().initConnectionManager(httpClient, getOptions());
    }

    /* (non-Javadoc)
	 * @see org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer#openStreams()
	 */
    protected void openStreams() throws IncomingFileTransferException {
        //$NON-NLS-1$
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "openStreams");
        final String urlString = getRemoteFileURL().toString();
        this.doneFired = false;
        int code = -1;
        try {
            initHttpClientConnectionManager();
            setupAuthentication(urlString);
            CredentialsProvider credProvider = new ECFCredentialsProvider();
            setupHostAndPort(credProvider, urlString);
            getMethod = new GzipGetMethod(hostConfigHelper.getTargetRelativePath());
            //$NON-NLS-1$ //$NON-NLS-2$
            getMethod.addRequestHeader("Connection", "Keep-Alive");
            getMethod.setFollowRedirects(true);
            // Define a CredentialsProvider - found that possibility while debugging in org.apache.commons.httpclient.HttpMethodDirector.processProxyAuthChallenge(HttpMethod)
            // Seems to be another way to select the credentials.
            getMethod.getParams().setParameter(CredentialsProvider.PROVIDER, credProvider);
            setRequestHeaderValues();
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "retrieve=" + urlString);
            // 2) The target remote file does *not* end in .gz (see bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=280205)
            if (getFileRangeSpecification() == null && !targetHasGzSuffix(super.getRemoteFileName())) {
                //$NON-NLS-1$
                Trace.trace(//$NON-NLS-1$
                Activator.PLUGIN_ID, //$NON-NLS-1$
                "Accept-Encoding: gzip added to request header");
                getMethod.setRequestHeader(GzipGetMethod.ACCEPT_ENCODING, GzipGetMethod.CONTENT_ENCODING_ACCEPTED);
            } else {
                //$NON-NLS-1$
                Trace.trace(//$NON-NLS-1$
                Activator.PLUGIN_ID, //$NON-NLS-1$
                "Accept-Encoding NOT added to header");
            }
            fireConnectStartEvent();
            if (checkAndHandleDone()) {
                return;
            }
            connectingSockets.clear();
            // redirect response code handled internally
            if (connectJob == null) {
                performConnect(new NullProgressMonitor());
            } else {
                connectJob.schedule();
                connectJob.join();
                connectJob = null;
            }
            if (checkAndHandleDone()) {
                return;
            }
            code = responseCode;
            responseHeaders = getResponseHeaders();
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "retrieve resp=" + code);
            // Check for NTLM proxy in response headers 
            // This check is to deal with bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=252002
            boolean ntlmProxyFound = NTLMProxyDetector.detectNTLMProxy(getMethod);
            if (ntlmProxyFound && !hasForceNTLMProxyOption())
                throw new //$NON-NLS-1$
                IncomingFileTransferException(//$NON-NLS-1$
                "HttpClient Provider is not configured to support NTLM proxy authentication.", //$NON-NLS-1$
                HttpClientOptions.NTLM_PROXY_RESPONSE_CODE);
            if (code == HttpURLConnection.HTTP_PARTIAL || code == HttpURLConnection.HTTP_OK) {
                getResponseHeaderValues();
                setInputStream(getMethod.getResponseBodyAsUnzippedStream());
                fireReceiveStartEvent();
            } else if (code == HttpURLConnection.HTTP_NOT_FOUND) {
                getMethod.releaseConnection();
                throw new //$NON-NLS-1$
                IncomingFileTransferException(//$NON-NLS-1$
                NLS.bind("File not found: {0}", urlString), //$NON-NLS-1$
                code);
            } else if (code == HttpURLConnection.HTTP_UNAUTHORIZED) {
                getMethod.releaseConnection();
                throw new IncomingFileTransferException(Messages.HttpClientRetrieveFileTransfer_Unauthorized, code);
            } else if (code == HttpURLConnection.HTTP_FORBIDDEN) {
                getMethod.releaseConnection();
                throw new //$NON-NLS-1$
                IncomingFileTransferException(//$NON-NLS-1$
                "Forbidden", //$NON-NLS-1$
                code);
            } else if (code == HttpURLConnection.HTTP_PROXY_AUTH) {
                getMethod.releaseConnection();
                throw new IncomingFileTransferException(Messages.HttpClientRetrieveFileTransfer_Proxy_Auth_Required, code);
            } else {
                getMethod.releaseConnection();
                throw new IncomingFileTransferException(NLS.bind(Messages.HttpClientRetrieveFileTransfer_ERROR_GENERAL_RESPONSE_CODE, new Integer(code)), code);
            }
        } catch (final Exception e) {
            Trace.throwing(Activator.PLUGIN_ID, DebugOptions.EXCEPTIONS_THROWING, this.getClass(), "openStreams", e);
            if (code == -1) {
                if (!isDone()) {
                    setDoneException(e);
                }
                fireTransferReceiveDoneEvent();
            } else {
                IncomingFileTransferException ex = (IncomingFileTransferException) ((e instanceof IncomingFileTransferException) ? e : new IncomingFileTransferException(NLS.bind(Messages.HttpClientRetrieveFileTransfer_EXCEPTION_COULD_NOT_CONNECT, urlString), e, code));
                throw ex;
            }
        }
        //$NON-NLS-1$
        Trace.exiting(Activator.PLUGIN_ID, DebugOptions.METHODS_EXITING, this.getClass(), "openStreams");
    }

    private Map getResponseHeaders() {
        if (getMethod == null)
            return null;
        Header[] headers = getMethod.getResponseHeaders();
        Map result = null;
        if (headers != null && headers.length > 0) {
            result = new HashMap();
            for (int i = 0; i < headers.length; i++) {
                String name = headers[i].getName();
                String val = headers[i].getValue();
                if (name != null && val != null)
                    result.put(name, val);
            }
        }
        return Collections.unmodifiableMap(result);
    }

    private boolean checkAndHandleDone() {
        if (isDone()) {
            // for cancel the done event should have been fired always.
            if (!doneFired) {
                fireTransferReceiveDoneEvent();
            }
            return true;
        }
        return false;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ecf.filetransfer.IRetrieveFileTransferContainerAdapter#setConnectContextForAuthentication(org.eclipse.ecf.core.security.IConnectContext)
	 */
    public void setConnectContextForAuthentication(IConnectContext connectContext) {
        super.setConnectContextForAuthentication(connectContext);
        this.username = null;
        this.password = null;
    }

    protected static String getHostFromURL(String url) {
        String result = url;
        //$NON-NLS-1$
        final int colonSlashSlash = url.indexOf("://");
        if (colonSlashSlash < 0)
            //$NON-NLS-1$
            return "";
        if (colonSlashSlash >= 0) {
            result = url.substring(colonSlashSlash + 3);
        }
        final int colonPort = result.indexOf(':');
        final int requestPath = result.indexOf('/');
        int substringEnd;
        if (colonPort > 0 && requestPath > 0)
            substringEnd = Math.min(colonPort, requestPath);
        else if (colonPort > 0)
            substringEnd = colonPort;
        else if (requestPath > 0)
            substringEnd = requestPath;
        else
            substringEnd = result.length();
        return result.substring(0, substringEnd);
    }

    protected static int getPortFromURL(String url) {
        //$NON-NLS-1$
        final int colonSlashSlash = url.indexOf("://");
        if (colonSlashSlash < 0)
            return urlUsesHttps(url) ? HTTPS_PORT : HTTP_PORT;
        // This is wrong as if the url has no colonPort before '?' then it should return the default
        int colonPort = url.indexOf(':', colonSlashSlash + 1);
        if (colonPort < 0)
            return urlUsesHttps(url) ? HTTPS_PORT : HTTP_PORT;
        // Make sure that the colonPort is not from some part of the rest of the URL
        int nextSlash = url.indexOf('/', colonSlashSlash + 3);
        if (nextSlash != -1 && colonPort > nextSlash)
            return urlUsesHttps(url) ? HTTPS_PORT : HTTP_PORT;
        // Make sure the colonPort is not part of the credentials in URI
        final int atServer = url.indexOf('@', colonSlashSlash + 1);
        if (atServer != -1 && colonPort < atServer && atServer < nextSlash)
            colonPort = url.indexOf(':', atServer + 1);
        if (colonPort < 0)
            return urlUsesHttps(url) ? HTTPS_PORT : HTTP_PORT;
        final int requestPath = url.indexOf('/', colonPort + 1);
        int end;
        if (requestPath < 0)
            end = url.length();
        else
            end = requestPath;
        return Integer.parseInt(url.substring(colonPort + 1, end));
    }

    protected static boolean urlUsesHttps(String url) {
        url = url.trim();
        return url.startsWith(HTTPS);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ecf.internal.provider.filetransfer.AbstractRetrieveFileTransfer#supportsProtocol(java.lang.String)
	 */
    public static boolean supportsProtocol(String protocolString) {
        for (int i = 0; i < supportedProtocols.length; i++) if (supportedProtocols[i].equalsIgnoreCase(protocolString))
            return true;
        return false;
    }

    protected boolean isConnected() {
        return (getMethod != null);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer#doPause()
	 */
    protected boolean doPause() {
        if (isPaused() || !isConnected() || isDone())
            return false;
        this.paused = true;
        return this.paused;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer#doResume()
	 */
    protected boolean doResume() {
        if (!isPaused() || isConnected())
            return false;
        return openStreamsForResume();
    }

    protected void setResumeRequestHeaderValues() throws IOException {
        if (this.bytesReceived <= 0 || this.fileLength <= this.bytesReceived)
            throw new IOException(Messages.HttpClientRetrieveFileTransfer_RESUME_START_ERROR);
        //$NON-NLS-1$ //$NON-NLS-2$
        setRangeHeader("bytes=" + this.bytesReceived + "-");
        //$NON-NLS-1$
        int maxAge = Integer.getInteger("org.eclipse.ecf.http.cache.max-age", 0).intValue();
        // fix the fix for bug 249990 with bug 410813
        if (maxAge == 0) {
            //$NON-NLS-1$//$NON-NLS-2$
            getMethod.addRequestHeader("Cache-Control", "max-age=0");
        } else if (maxAge > 0) {
            //$NON-NLS-1$//$NON-NLS-2$
            getMethod.addRequestHeader("Cache-Control", "max-age=" + maxAge);
        }
        setRequestHeaderValuesFromOptions();
    }

    private boolean openStreamsForResume() {
        //$NON-NLS-1$
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "openStreamsForResume");
        final String urlString = getRemoteFileURL().toString();
        this.doneFired = false;
        int code = -1;
        try {
            initHttpClientConnectionManager();
            CredentialsProvider credProvider = new ECFCredentialsProvider();
            setupAuthentication(urlString);
            setupHostAndPort(credProvider, urlString);
            getMethod = new GzipGetMethod(hostConfigHelper.getTargetRelativePath());
            //$NON-NLS-1$ //$NON-NLS-2$
            getMethod.addRequestHeader("Connection", "Keep-Alive");
            getMethod.setFollowRedirects(true);
            // Define a CredentialsProvider - found that possibility while debugging in org.apache.commons.httpclient.HttpMethodDirector.processProxyAuthChallenge(HttpMethod)
            // Seems to be another way to select the credentials.
            getMethod.getParams().setParameter(CredentialsProvider.PROVIDER, credProvider);
            setResumeRequestHeaderValues();
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "resume=" + urlString);
            // Gzip encoding is not an option for resume
            fireConnectStartEvent();
            if (checkAndHandleDone()) {
                return false;
            }
            connectingSockets.clear();
            // redirect response code handled internally
            if (connectJob == null) {
                performConnect(new NullProgressMonitor());
            } else {
                connectJob.schedule();
                connectJob.join();
                connectJob = null;
            }
            if (checkAndHandleDone()) {
                return false;
            }
            code = responseCode;
            responseHeaders = getResponseHeaders();
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "retrieve resp=" + code);
            if (code == HttpURLConnection.HTTP_PARTIAL || code == HttpURLConnection.HTTP_OK) {
                getResumeResponseHeaderValues();
                setInputStream(getMethod.getResponseBodyAsUnzippedStream());
                this.paused = false;
                fireReceiveResumedEvent();
            } else if (code == HttpURLConnection.HTTP_NOT_FOUND) {
                getMethod.releaseConnection();
                throw new //$NON-NLS-1$
                IncomingFileTransferException(//$NON-NLS-1$
                NLS.bind("File not found: {0}", urlString), //$NON-NLS-1$
                code, //$NON-NLS-1$
                responseHeaders);
            } else if (code == HttpURLConnection.HTTP_UNAUTHORIZED) {
                getMethod.releaseConnection();
                throw new IncomingFileTransferException(Messages.HttpClientRetrieveFileTransfer_Unauthorized, code, responseHeaders);
            } else if (code == HttpURLConnection.HTTP_FORBIDDEN) {
                getMethod.releaseConnection();
                throw new //$NON-NLS-1$
                IncomingFileTransferException(//$NON-NLS-1$
                "Forbidden", //$NON-NLS-1$
                code, //$NON-NLS-1$
                responseHeaders);
            } else if (code == HttpURLConnection.HTTP_PROXY_AUTH) {
                getMethod.releaseConnection();
                throw new IncomingFileTransferException(Messages.HttpClientRetrieveFileTransfer_Proxy_Auth_Required, code, responseHeaders);
            } else {
                getMethod.releaseConnection();
                throw new IncomingFileTransferException(NLS.bind(Messages.HttpClientRetrieveFileTransfer_ERROR_GENERAL_RESPONSE_CODE, new Integer(code)), code, responseHeaders);
            }
            //$NON-NLS-1$
            Trace.exiting(Activator.PLUGIN_ID, DebugOptions.METHODS_EXITING, this.getClass(), "openStreamsForResume", Boolean.TRUE);
            return true;
        } catch (final Exception e) {
            Trace.catching(Activator.PLUGIN_ID, DebugOptions.EXCEPTIONS_CATCHING, this.getClass(), "openStreamsForResume", e);
            if (code == -1) {
                if (!isDone()) {
                    setDoneException(e);
                }
            } else {
                setDoneException((e instanceof IncomingFileTransferException) ? e : new IncomingFileTransferException(NLS.bind(Messages.HttpClientRetrieveFileTransfer_EXCEPTION_COULD_NOT_CONNECT, urlString), e, code, responseHeaders));
            }
            fireTransferReceiveDoneEvent();
            Trace.exiting(Activator.PLUGIN_ID, DebugOptions.METHODS_EXITING, this.getClass(), "openStreamsForResume", Boolean.FALSE);
            return false;
        }
    }

    protected void getResumeResponseHeaderValues() throws IOException {
        if (getResponseCode() != HttpURLConnection.HTTP_PARTIAL)
            throw new IOException();
        if (lastModifiedTime != getLastModifiedTimeFromHeader())
            throw new IOException(Messages.HttpClientRetrieveFileTransfer_EXCEPTION_FILE_MODIFIED_SINCE_LAST_ACCESS);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer#getAdapter(java.lang.Class)
	 */
    public Object getAdapter(Class adapter) {
        if (adapter == null)
            return null;
        if (adapter.equals(IFileTransferPausable.class) && isHTTP11())
            return this;
        if (adapter.equals(ISocketEventSource.class))
            return this.socketEventSource;
        return super.getAdapter(adapter);
    }

    private HostConfiguration getHostConfiguration() {
        if (hostConfigHelper == null) {
            hostConfigHelper = new HostConfigHelper(socketEventSource, connectingSockets);
        }
        return hostConfigHelper.getHostConfiguration();
    }

    /* (non-Javadoc)
	 * @see org.eclipse.ecf.provider.filetransfer.retrieve.AbstractRetrieveFileTransfer#setupProxy(org.eclipse.ecf.core.util.Proxy)
	 */
    protected void setupProxy(Proxy proxy) {
        if (proxy.getType().equals(Proxy.Type.HTTP)) {
            final ProxyAddress address = proxy.getAddress();
            getHostConfiguration().setProxy(address.getHostName(), address.getPort());
        } else if (proxy.getType().equals(Proxy.Type.SOCKS)) {
            //$NON-NLS-1$
            Trace.trace(Activator.PLUGIN_ID, "retrieve socksproxy=" + proxy.getAddress());
            proxyHelper.setupProxy(proxy);
        }
    }

    public static NTCredentials createNTLMCredentials(Proxy p) {
        if (p == null) {
            return null;
        }
        String un = getNTLMUserName(p);
        String domain = getNTLMDomainName(p);
        if (un == null || domain == null)
            return null;
        return new NTCredentials(un, p.getPassword(), p.getAddress().getHostName(), domain);
    }

    protected static String getNTLMDomainName(Proxy p) {
        String domainUsername = p.getUsername();
        if (domainUsername == null)
            return null;
        int slashloc = domainUsername.indexOf('\\');
        if (slashloc == -1)
            return null;
        return domainUsername.substring(0, slashloc);
    }

    protected static String getNTLMUserName(Proxy p) {
        String domainUsername = p.getUsername();
        if (domainUsername == null)
            return null;
        int slashloc = domainUsername.indexOf('\\');
        if (slashloc == -1)
            return null;
        return domainUsername.substring(slashloc + 1);
    }

    protected void fireConnectStartEvent() {
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "fireConnectStartEvent");
        listener.handleTransferEvent(new IFileTransferConnectStartEvent() {

            public IFileID getFileID() {
                return remoteFileID;
            }

            public void cancel() {
                HttpClientRetrieveFileTransfer.this.cancel();
            }

            public FileTransferJob prepareConnectJob(FileTransferJob j) {
                return HttpClientRetrieveFileTransfer.this.prepareConnectJob(j);
            }

            public void connectUsingJob(FileTransferJob j) {
                HttpClientRetrieveFileTransfer.this.connectUsingJob(j);
            }

            public String toString() {
                final StringBuffer sb = new StringBuffer("IFileTransferConnectStartEvent[");
                sb.append(getFileID());
                sb.append("]");
                return sb.toString();
            }

            public Object getAdapter(Class adapter) {
                return HttpClientRetrieveFileTransfer.this.getAdapter(adapter);
            }
        });
    }

    protected String createConnectJobName() {
        return getRemoteFileURL().toString() + createRangeName() + Messages.HttpClientRetrieveFileTransfer_CONNECTING_JOB_NAME;
    }

    protected FileTransferJob prepareConnectJob(FileTransferJob cjob) {
        if (cjob == null) {
            cjob = new FileTransferJob(createJobName());
        }
        cjob.setFileTransfer(this);
        cjob.setFileTransferRunnable(fileConnectRunnable);
        return cjob;
    }

    protected void connectUsingJob(FileTransferJob cjob) {
        Assert.isNotNull(cjob);
        this.connectJob = cjob;
    }

    private IFileTransferRunnable fileConnectRunnable = new IFileTransferRunnable() {

        public IStatus performFileTransfer(IProgressMonitor monitor) {
            return performConnect(monitor);
        }
    };

    private IStatus performConnect(IProgressMonitor monitor) {
        int ticks = 1;
        monitor.beginTask(getRemoteFileURL().toString() + Messages.HttpClientRetrieveFileTransfer_CONNECTING_TASK_NAME, ticks);
        try {
            if (monitor.isCanceled())
                throw newUserCancelledException();
            responseCode = httpClient.executeMethod(getHostConfiguration(), getMethod);
            Trace.trace(Activator.PLUGIN_ID, "retrieve resp=" + responseCode);
        } catch (final Exception e) {
            Trace.catching(Activator.PLUGIN_ID, DebugOptions.EXCEPTIONS_CATCHING, this.getClass(), "performConnect", e);
            if (!isDone()) {
                setDoneException(e);
            }
        } finally {
            monitor.done();
        }
        return Status.OK_STATUS;
    }

    protected void fireReceiveResumedEvent() {
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "fireReceiveResumedEvent len=" + fileLength + ";rcvd=" + bytesReceived);
        super.fireReceiveResumedEvent();
    }

    protected void fireTransferReceiveDataEvent() {
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "fireTransferReceiveDataEvent len=" + fileLength + ";rcvd=" + bytesReceived);
        super.fireTransferReceiveDataEvent();
    }

    protected void fireTransferReceiveDoneEvent() {
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "fireTransferReceiveDoneEvent len=" + fileLength + ";rcvd=" + bytesReceived);
        this.doneFired = true;
        super.fireTransferReceiveDoneEvent();
    }

    protected void fireTransferReceivePausedEvent() {
        Trace.entering(Activator.PLUGIN_ID, DebugOptions.METHODS_ENTERING, this.getClass(), "fireTransferReceivePausedEvent len=" + fileLength + ";rcvd=" + bytesReceived);
        super.fireTransferReceivePausedEvent();
    }
}
