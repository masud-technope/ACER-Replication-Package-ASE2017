/*******************************************************************************
 * Copyright (c) 2012 Composent, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Composent, Inc. - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecf.provider.generic;

import java.io.*;
import java.net.*;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecf.core.util.Trace;
import org.eclipse.ecf.internal.provider.ECFProviderDebugOptions;
import org.eclipse.ecf.internal.provider.ProviderPlugin;
import org.eclipse.ecf.provider.comm.tcp.*;

/**
 * @since 4.3
 */
public class SSLServerSOContainerGroup extends SOContainerGroup implements ISocketAcceptHandler {

    public static final int DEFAULT_BACKLOG = 50;

    //$NON-NLS-1$
    public static final String INVALID_CONNECT = "Invalid connect request.";

    public static final String DEFAULT_GROUP_NAME = SSLServerSOContainerGroup.class.getName();

    private int port = 0;

    private int backlog = DEFAULT_BACKLOG;

    SSLServerSocket serverSocket;

    private boolean isOnTheAir = false;

    private ThreadGroup threadGroup;

    private InetAddress inetAddress;

    private Thread listenerThread;

    public  SSLServerSOContainerGroup(String name, ThreadGroup group, int port, int backlog, InetAddress inetAddress) {
        super(name);
        this.threadGroup = group;
        this.port = port;
        this.backlog = backlog;
        this.inetAddress = inetAddress;
        listenerThread = setupListener();
    }

    public  SSLServerSOContainerGroup(String name, ThreadGroup group, int port, int backlog) {
        this(name, group, port, backlog, null);
    }

    /**
	 * @since 4.4
	 */
    public  SSLServerSOContainerGroup(String name, ThreadGroup group, int port, InetAddress bindAddress) {
        this(name, group, port, Server.DEFAULT_BACKLOG, bindAddress);
    }

    public  SSLServerSOContainerGroup(String name, ThreadGroup group, int port) {
        this(name, group, port, DEFAULT_BACKLOG);
    }

    public  SSLServerSOContainerGroup(String name, int port) {
        this(name, null, port);
    }

    public  SSLServerSOContainerGroup(int port) {
        this(DEFAULT_GROUP_NAME, null, port);
    }

    /**
	 * @since 4.6
	 */
    public  SSLServerSOContainerGroup(String name, ThreadGroup group, SSLServerSocket sslServerSocket) {
        super(name);
        this.threadGroup = group;
        this.serverSocket = sslServerSocket;
        this.port = serverSocket.getLocalPort();
        this.listenerThread = setupListener();
    }

    protected void trace(String msg) {
        Trace.trace(ProviderPlugin.PLUGIN_ID, ECFProviderDebugOptions.DEBUG, msg);
    }

    protected void traceStack(String msg, Throwable e) {
        Trace.catching(ProviderPlugin.PLUGIN_ID, ECFProviderDebugOptions.EXCEPTIONS_CATCHING, SSLServerSOContainerGroup.class, msg, e);
    }

    public synchronized void putOnTheAir() throws IOException {
        //$NON-NLS-1$ //$NON-NLS-2$
        trace("SSLServerSOContainerGroup at port " + port + " on the air");
        if (this.serverSocket == null) {
            SSLServerSocketFactory socketFactory = ProviderPlugin.getDefault().getSSLServerSocketFactory();
            if (socketFactory == null)
                throw new //$NON-NLS-1$
                IOException(//$NON-NLS-1$
                "Cannot get SSLServerSocketFactory to create SSLServerSocket");
            serverSocket = (SSLServerSocket) ((this.inetAddress == null) ? socketFactory.createServerSocket(this.port, this.backlog) : socketFactory.createServerSocket(this.port, this.backlog, this.inetAddress));
        }
        port = serverSocket.getLocalPort();
        isOnTheAir = true;
        listenerThread.start();
    }

    public synchronized boolean isOnTheAir() {
        return isOnTheAir;
    }

    void handleSyncAccept(Socket aSocket) throws Exception {
        // Set socket options
        aSocket.setTcpNoDelay(true);
        final ObjectOutputStream oStream = new ObjectOutputStream(aSocket.getOutputStream());
        oStream.flush();
        final ObjectInputStream iStream = new ObjectInputStream(aSocket.getInputStream());
        final ConnectRequestMessage req = (ConnectRequestMessage) iStream.readObject();
        if (req == null)
            //$NON-NLS-1$
            throw new InvalidObjectException(INVALID_CONNECT + " Connect request message cannot be null");
        final URI uri = req.getTarget();
        if (uri == null)
            //$NON-NLS-1$
            throw new InvalidObjectException(INVALID_CONNECT + " URI connect target cannot be null");
        final String path = uri.getPath();
        if (path == null)
            //$NON-NLS-1$
            throw new InvalidObjectException(INVALID_CONNECT + " Path cannot be null");
        final SSLServerSOContainer srs = (SSLServerSOContainer) get(path);
        if (srs == null)
            //$NON-NLS-1$
            throw new InvalidObjectException("Container not found for path=" + path);
        // Create our local messaging interface
        final Client newClient = new Client(aSocket, iStream, oStream, srs.getReceiver());
        // Get output stream lock so nothing is sent until we've responded
        Object outputStreamLock = newClient.getOutputStreamLock();
        // connect request
        synchronized (outputStreamLock) {
            // Call checkConnect
            final Serializable resp = srs.handleConnectRequest(aSocket, path, req.getData(), newClient);
            // Create connect response wrapper and send it back
            oStream.writeObject(new ConnectResultMessage(resp));
            oStream.flush();
        }
    }

    public synchronized void takeOffTheAir() {
        //$NON-NLS-1$ //$NON-NLS-2$
        trace("Taking " + getName() + " off the air.");
        if (listenerThread != null) {
            listenerThread.interrupt();
            listenerThread = null;
        }
        if (threadGroup != null) {
            threadGroup.interrupt();
            threadGroup = null;
        }
        if (this.serverSocket != null) {
            try {
                this.serverSocket.close();
            } catch (IOException e) {
                Trace.catching("org.eclipse.ecf.provider", ECFProviderDebugOptions.CONNECTION, SSLServerSOContainerGroup.class, "takeOffTheAir", e);
            }
            this.serverSocket = null;
        }
        isOnTheAir = false;
    }

    public synchronized int getPort() {
        return port;
    }

    public synchronized String toString() {
        //$NON-NLS-1$
        return super.toString() + ";port:" + port;
    }

    protected Thread setupListener() {
        return new Thread(threadGroup, new Runnable() {

            public void run() {
                while (true) {
                    try {
                        handleAccept(serverSocket.accept());
                    } catch (Exception e) {
                        traceStack("Exception in accept", e);
                        break;
                    }
                }
                debug(//$NON-NLS-1$
                "SSLServerSOContaienrGroup closing listener normally.");
            }
        }, //$NON-NLS-1$ //$NON-NLS-2$
        "SSLServerSOContainerGroup(" + port + ")");
    }

    public void handleAccept(final Socket aSocket) {
        new Thread(threadGroup, new Runnable() {

            public void run() {
                try {
                    debug("accept:" + //$NON-NLS-1$
                    aSocket.getInetAddress());
                    handleSyncAccept(aSocket);
                } catch (Exception e) {
                    traceStack("Unexpected exception in handleAccept...closing", e);
                    try {
                        aSocket.close();
                    } catch (IOException e1) {
                        ProviderPlugin.getDefault().log(new Status(IStatus.ERROR, ProviderPlugin.PLUGIN_ID, IStatus.ERROR, "accept.close", e1));
                    }
                }
            }
        }).start();
    }

    protected void debug(String msg) {
        Trace.trace(ProviderPlugin.PLUGIN_ID, ECFProviderDebugOptions.CONNECTION, msg);
    }
}
