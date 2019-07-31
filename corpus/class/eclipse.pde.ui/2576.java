/*******************************************************************************
 *  Copyright (c) 2000, 2008 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.pde.internal.core.text.plugin;

import java.io.PrintWriter;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.core.IModel;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.ischema.ISchema;
import org.eclipse.pde.internal.core.schema.SchemaRegistry;
import org.eclipse.pde.internal.core.text.IDocumentAttributeNode;
import org.eclipse.pde.internal.core.text.IDocumentElementNode;

public class PluginExtensionNode extends PluginParentNode implements IPluginExtension {

    private static final long serialVersionUID = 1L;

    private transient ISchema fSchema;

    @Override
    public String getPoint() {
        return getXMLAttributeValue(P_POINT);
    }

    @Override
    public void setPoint(String point) throws CoreException {
        setXMLAttribute(P_POINT, point);
    }

    @Override
    public void setName(String name) throws CoreException {
        setXMLAttribute(P_NAME, name);
    }

    @Override
    public String getName() {
        return getXMLAttributeValue(P_NAME);
    }

    @Override
    public String getTranslatedName() {
        String name = getName();
        if (name != null && name.trim().length() > 0)
            return getResourceString(name);
        String point = getPoint();
        ISchema schema = PDECore.getDefault().getSchemaRegistry().getSchema(point);
        //$NON-NLS-1$
        return schema == null ? "" : schema.getName();
    }

    @Override
    public String getId() {
        return getXMLAttributeValue(P_ID);
    }

    @Override
    public void setId(String id) throws CoreException {
        setXMLAttribute(P_ID, id);
    }

    @Override
    public String write(boolean indent) {
        String sep = getLineDelimiter();
        StringBuffer buffer = new StringBuffer();
        if (indent)
            buffer.append(getIndent());
        buffer.append(writeShallow(false));
        IDocumentElementNode[] children = getChildNodes();
        for (int i = 0; i < children.length; i++) {
            children[i].setLineIndent(getLineIndent() + 3);
            buffer.append(sep + children[i].write(true));
        }
        //$NON-NLS-1$
        buffer.append(sep + getIndent() + "</extension>");
        return buffer.toString();
    }

    @Override
    public void write(String indent, PrintWriter writer) {
        // Used for text transfers for copy, cut, paste operations
        writer.write(write(true));
    }

    @Override
    public String writeShallow(boolean terminate) {
        String sep = getLineDelimiter();
        //$NON-NLS-1$
        String attrIndent = "      ";
        //$NON-NLS-1$
        StringBuffer buffer = new StringBuffer("<extension");
        IDocumentAttributeNode attr = getDocumentAttribute(P_ID);
        if (attr != null && attr.getAttributeValue().trim().length() > 0)
            buffer.append(sep + getIndent() + attrIndent + attr.write());
        attr = getDocumentAttribute(P_NAME);
        if (attr != null && attr.getAttributeValue().trim().length() > 0)
            buffer.append(sep + getIndent() + attrIndent + attr.write());
        attr = getDocumentAttribute(P_POINT);
        if (attr != null && attr.getAttributeValue().trim().length() > 0)
            buffer.append(sep + getIndent() + attrIndent + attr.write());
        if (terminate)
            //$NON-NLS-1$
            buffer.append("/");
        //$NON-NLS-1$
        buffer.append(">");
        return buffer.toString();
    }

    @Override
    public Object getSchema() {
        if (fSchema == null) {
            SchemaRegistry registry = PDECore.getDefault().getSchemaRegistry();
            fSchema = registry.getSchema(getPoint());
        } else if (fSchema.isDisposed()) {
            fSchema = null;
        }
        return fSchema;
    }

    @Override
    public void reconnect(IDocumentElementNode parent, IModel model) {
        super.reconnect(parent, model);
        // Transient Field:  Schema
        // Not necessary to reconnect schema.
        // getSchema will retrieve the schema on demand if it is null
        fSchema = null;
    }
}
