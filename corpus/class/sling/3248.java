/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.crankstart.testservices;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Base class for our test servlets */
abstract class TestServlet extends HttpServlet {

    private static final long serialVersionUID = -6918378772515948578L;

    protected String message;

    protected String path;

    protected final Logger log = LoggerFactory.getLogger(getClass());

    protected HttpService httpService;

    protected void register() throws ServletException, NamespaceException {
        httpService.registerServlet(path, this, null, null);
        log.info("Registered {} on path {}", this, path);
    }

    protected void unregister() throws ServletException, NamespaceException {
        httpService.unregister(path);
        log.info("Unregistered path {}", path);
    }

    protected void bindHttpService(HttpService s) {
        httpService = s;
    }

    protected void unbindHttpService(HttpService s) {
        httpService = null;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(getClass().getSimpleName() + ":" + message);
        resp.getWriter().flush();
    }
}
