/*******************************************************************************
 *  Copyright (c) 2000, 2015 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.pde.internal.ui.elements;

import org.eclipse.jface.viewers.IStructuredContentProvider;

public class ListContentProvider extends DefaultContentProvider implements IStructuredContentProvider {

    public  ListContentProvider() {
        super();
    }

    @Override
    public Object[] getElements(Object element) {
        if (element instanceof IPDEElement) {
            return ((IPDEElement) element).getChildren();
        }
        return null;
    }
}
