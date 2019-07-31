/****************************************************************************
 * Copyright (c) 2004 Composent, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Composent, Inc. - initial API and implementation
 *****************************************************************************/
package org.eclipse.ecf.presence;

import java.io.Serializable;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ecf.core.identity.ID;

/**
 * Super interface for messages. Sub interfaces define specific types of
 * messages...for example chat, user keyboard activity/typing and chat room
 * messages.
 */
public interface IIMMessage extends IAdaptable, Serializable {

    /**
	 * Get ID of originator of message.
	 * 
	 * @return ID of originator of message. Will not be <code>null</code>.
	 */
    public ID getFromID();
}
