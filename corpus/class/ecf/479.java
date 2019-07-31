/*******************************************************************************
 * Copyright (c) 2004 Peter Nehrer and Composent, Inc.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Nehrer - initial API and implementation
 *******************************************************************************/
package org.eclipse.ecf.sdo;

import org.eclipse.ecf.core.identity.ID;
import org.eclipse.ecf.core.util.ECFException;

/**
 * Convenience callback implementation that can be used to block the calling
 * thread until the data graph is obtained.
 * 
 * @author pnehrer
 */
public class WaitableSubscriptionCallback implements ISubscriptionCallback {

    private ID containerID;

    private Throwable cause;

    /*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ecf.sdo.ISubscriptionCallback#dataGraphObtained(org.eclipse.ecf.sdo.ISharedDataGraph,
	 *      org.eclipse.ecf.core.identity.ID)
	 */
    public synchronized void dataGraphSubscribed(ISharedDataGraph graph, ID cID) {
        this.containerID = cID;
        notifyAll();
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ecf.sdo.ISubscriptionCallback#subscriptionFailed(org.eclipse.ecf.sdo.ISharedDataGraph,
	 *      java.lang.Throwable)
	 */
    public synchronized void subscriptionFailed(ISharedDataGraph graph, Throwable c) {
        this.cause = c;
        notifyAll();
    }

    /**
	 * Blocks the calling thread until the data graph is obtained.
	 * 
	 * @param timeout
	 *            period, in milliseconds, to wait for subscription
	 * @return id of the container from which the data graph originated
	 * @throws InterruptedException
	 *             if interrupted while waiting for notification
	 * @throws ECFException
	 *             if subscription failed
	 */
    public synchronized ID waitForSubscription(long timeout) throws InterruptedException, ECFException {
        if (containerID == null && cause == null)
            wait(timeout);
        if (cause != null)
            throw new ECFException(cause);
        return containerID;
    }
}
