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
package org.apache.sling.scripting.xproc.cocoon.generator;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletOutputStream;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.wrappers.SlingHttpServletResponseWrapper;

public class SlingGeneratorServletResponse extends SlingHttpServletResponseWrapper implements SlingHttpServletResponse {

    private SlingGeneratorServletOutputStream output;

    private boolean hasWriter = false;

    private boolean hasOutputStream = false;

    public  SlingGeneratorServletResponse(SlingHttpServletResponse wrappedResponse, SlingGeneratorServletOutputStream output) {
        super(wrappedResponse);
        this.output = output;
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        if (this.hasOutputStream) {
            throw new IllegalStateException("getOutputStream was already called.");
        }
        this.hasWriter = true;
        return this.output.getWriter();
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if (this.hasWriter) {
            throw new IllegalStateException("getWriter was already called.");
        }
        this.hasOutputStream = true;
        return this.output;
    }

    @Override
    public int getBufferSize() {
        return 1024;
    }
}
