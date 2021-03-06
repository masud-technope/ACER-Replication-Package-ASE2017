/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.atom.taglib.media;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import org.apache.abdera.ext.media.MediaConstants;
import org.apache.abdera.ext.media.MediaContent;
import org.apache.abdera.ext.media.MediaGroup;
import org.apache.abdera.ext.media.MediaRestriction;
import org.apache.abdera.ext.media.MediaConstants.Relationship;
import org.apache.abdera.ext.media.MediaConstants.RestrictionType;
import org.apache.abdera.model.Entry;
import org.apache.abdera.model.Feed;
import org.apache.sling.atom.taglib.AbstractAbderaHandler;

public class MediaRestrictionTagHandler extends AbstractAbderaHandler {

    private static final long serialVersionUID = 1L;

    private String relationship;

    private String type;

    @Override
    public int doEndTag() throws JspException {
        final ServletRequest request = pageContext.getRequest();
        MediaRestriction restriction;
        if (request.getAttribute("content") != null && request.getAttribute("content") instanceof MediaContent) {
            restriction = ((MediaContent) request.getAttribute("content")).addExtension(MediaConstants.RESTRICTION);
        } else if (request.getAttribute("group") != null && request.getAttribute("group") instanceof MediaGroup) {
            restriction = ((MediaGroup) request.getAttribute("group")).addExtension(MediaConstants.RESTRICTION);
        } else if (request.getAttribute("entry") != null && request.getAttribute("entry") instanceof Entry) {
            restriction = ((Entry) request.getAttribute("entry")).addExtension(MediaConstants.RESTRICTION);
        } else {
            restriction = ((Feed) request.getAttribute("feed")).addExtension(MediaConstants.RESTRICTION);
        }
        // set the body content
        restriction.setText(getBodyContent().getString());
        // set the scheme
        if (relationship != null)
            restriction.setRelationship(Relationship.valueOf(relationship));
        if (type != null)
            restriction.setType(RestrictionType.valueOf(type));
        return super.doEndTag();
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int doStartTag() {
        return EVAL_BODY_BUFFERED;
    }
}
