/*******************************************************************************
 * Copyright (c) 2004, 2007 Composent, Inc. and others.
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
import org.eclipse.ecf.core.util.Trace;
import org.eclipse.ecf.internal.provider.ECFProviderDebugOptions;
import org.eclipse.ecf.internal.provider.ProviderPlugin;
import org.eclipse.ecf.provider.comm.tcp.*;

public class TCPServerSOContainerGroup extends SOContainerGroup implements ISocketAcceptHandler {

    //$NON-NLS-1$
    public static final String INVALID_CONNECT = "Invalid connect request.";

    public static final String DEFAULT_GROUP_NAME = TCPServerSOContainerGroup.class.getName();

    private int port;

    private Server listener;

    private boolean isOnTheAir = false;

    private final ThreadGroup threadGroup;

    private int backlog = Server.DEFAULT_BACKLOG;

    private InetAddress bindAddress;

    /**
	 * @since 4.4
	 */
    public  TCPServerSOContainerGroup(String name, ThreadGroup group, int port, int backlog, InetAddress bindAddress) {
        super(name);
        threadGroup = group;
        this.port = port;
        this.backlog = backlog;
        this.bindAddress = bindAddress;
    }

    /**
	 * @since 4.4
	 */
    public  TCPServerSOContainerGroup(String name, ThreadGroup group, int port, InetAddress bindAddress) {
        this(name, group, port, Server.DEFAULT_BACKLOG, bindAddress);
    }

    public  TCPServerSOContainerGroup(String name, ThreadGroup group, int port) {
        this(name, group, port, Server.DEFAULT_BACKLOG, null);
    }

    public  TCPServerSOContainerGroup(String name, int port) {
        this(name, null, port);
    }

    public  TCPServerSOContainerGroup(int port) {
        this(DEFAULT_GROUP_NAME, port);
    }

    protected void trace(String msg) {
        //$NON-NLS-1$
        Trace.trace(ProviderPlugin.PLUGIN_ID, ECFProviderDebugOptions.DEBUG, "TRACING " + msg);
    }

    protected void traceStack(String msg, Throwable e) {
        Trace.catching(ProviderPlugin.PLUGIN_ID, ECFProviderDebugOptions.EXCEPTIONS_CATCHING, TCPServerSOContainerGroup.class, msg, e);
    }

    public synchronized void putOnTheAir() throws IOException {
        //$NON-NLS-1$ //$NON-NLS-2$
        trace("TCPServerSOContainerGroup at port " + port + " on the air");
        listener = new Server(threadGroup, port, backlog, bindAddress, this);
        port = listener.getLocalPort();
        isOnTheAir = true;
    }

    public synchronized boolean isOnTheAir() {
        return isOnTheAir;
    }

    private void setSocketOptions(Socket aSocket) throws SocketException {
        aSocket.setTcpNoDelay(true);
    }

    public void handleAccept(Socket aSocket) throws Exception {
        // Set socket options
        setSocketOptions(aSocket);
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
        final TCPServerSOContainer srs = (TCPServerSOContainer) get(path);
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
        if (listener != null) {
            //$NON-NLS-1$ //$NON-NLS-2$
            trace("Taking " + getName() + " off the air.");
            try {
                listener.close();
            } catch (final IOException e) {
                traceStack("Exception in closeListener", e);
            }
            listener = null;
        }
        isOnTheAir = false;
    }

    public int getPort() {
        return port;
    }

    public String toString() {
        //$NON-NLS-1$
        return super.toString() + ";port:" + port;
    }
}
