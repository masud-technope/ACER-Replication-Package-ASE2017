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
package org.apache.sling.commons.js.nodetypes.downloaddefaultbinary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Value;
import javax.jcr.nodetype.NodeType;
import javax.jcr.nodetype.NodeTypeManager;
import javax.jcr.nodetype.PropertyDefinition;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Service(Servlet.class)
@Properties({ @Property(name = "service.description", value = "Download Servlet for binary properties"), @Property(name = "service.vendor", value = "Sandro Boehme"), @Property(name = "sling.servlet.selectors", value = "default_binary_value"), @Property(name = "sling.servlet.extensions", value = "bin"), @Property(name = "sling.servlet.resourceTypes", value = "sling/servlet/default") })
public class DownloadDefaultBinaryValueServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = -1L;

    /** default log */
    private final Logger log = LoggerFactory.getLogger(DownloadDefaultBinaryValueServlet.class);

    @SuppressWarnings("deprecation")
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/octet-stream; charset=UTF-8");
        String requestURI = request.getRequestURI();
        String[] idFields = requestURI.substring(1).split("/");
        try {
            NodeTypeManager nodeTypeManager = request.getResourceResolver().getResource("/").adaptTo(Node.class).getSession().getWorkspace().getNodeTypeManager();
            NodeType nodeType = nodeTypeManager.getNodeType(idFields[0]);
            PropertyDefinition[] propertyDefinitions = nodeType.getPropertyDefinitions();
            List<PropertyDefinition> propertyDefinitionList = Arrays.asList(propertyDefinitions);
            if (propertyDefinitionList != null) {
                // Every matcher represents a path element in the URL and is initialized with its value.
                // It will try to match the value of a path element with the corresponding property 
                // element of all property definitions from the node type in findMatchingPropertyDef().
                PropertyMatcher[] propertyMatcher = new PropertyMatcher[] { new PropertyNameMatcher(idFields, 1), new RequiredPropertyTypeMatcher(idFields, 2), new AutoCreatedMatcher(idFields, 3), new MandatoryMatcher(idFields, 4), new ProtectedMatcher(idFields, 5), new MultipleMatcher(idFields, 6), new OnParentVersionMatcher(idFields, 7) };
                PropertyDefinition propDef = findMatchingPropertyDef(propertyDefinitionList, new LinkedList<PropertyMatcher>(Arrays.asList(propertyMatcher)));
                if (propDef != null) {
                    Value[] defaultValues = propDef.getDefaultValues();
                    if (defaultValues != null && defaultValues.length > 0) {
                        int startIndex = requestURI.lastIndexOf('/') + 1;
                        int endIndex = requestURI.indexOf("default_binary_value.bin") - 1;
                        int defaultValueIndex = 0;
                        if (endIndex - startIndex == 1) {
                            String indexString = requestURI.substring(startIndex, endIndex);
                            defaultValueIndex = Integer.parseInt(indexString);
                        }
                        try {
                            if (defaultValueIndex < defaultValues.length) {
                                Value defaultValue = defaultValues[defaultValueIndex];
                                InputStream stream = defaultValue.getStream();
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
                                PrintWriter writer = response.getWriter();
                                String line = null;
                                while ((line = bufferedReader.readLine()) != null) {
                                    writer.write(line);
                                }
                                writer.flush();
                                writer.close();
                                response.setStatus(HttpServletResponse.SC_OK);
                            } else {
                                response.sendError(HttpServletResponse.SC_NOT_FOUND);
                            }
                        } catch (NumberFormatException nfe) {
                            response.sendError(HttpServletResponse.SC_NOT_FOUND);
                        }
                    } else {
                        response.sendError(HttpServletResponse.SC_NOT_FOUND);
                    }
                } else {
                    response.sendError(HttpServletResponse.SC_NOT_FOUND);
                }
            }
        } catch (RepositoryException e) {
            log.error("Could not return the binary file.", e);
            throw new ServletException(e);
        }
    }

    /**
	 * This method pulls the first matcher out of the list and iterates over the list of specified property definitions to find matches. 
	 * Lets say this is a PropertyNameMatcher that has been initialized with the property name from the URL. Than it will match for every
	 * property definition who's name is equal to the one specified in the URL. The matched property definitions and the rest of the matchers
	 * will be provided for the next recursive call of the method to work through the other path elements until all matchers are processed or
	 * until only one property definition matches. In the first case null is returned and in the second case the identified property definition
	 * is returned. 
	 * @param propertyDefinitions The list of property definitions.
	 * @param propertyMatcherList The list of matcher in the order of appearance of their type in the URL. A matcher checks if the
	 * content of a path element it was initialized with matches its corresponding value in the property definition.
	 * @return Returns the property definition that is identified by the URL or null if no property definition matches the values specified in the URL.
	 */
    private PropertyDefinition findMatchingPropertyDef(List<PropertyDefinition> propertyDefinitions, List<PropertyMatcher> propertyMatcherList) {
        if (propertyMatcherList.size() > 0) {
            // retrieve the matcher to be used for this iteration
            PropertyMatcher propertyMatcher = propertyMatcherList.get(0);
            // remove the matcher to make the next matcher available for the
            // next iteration
            propertyMatcherList.remove(0);
            List<PropertyDefinition> matchedPropDefs = new LinkedList<PropertyDefinition>();
            // try to match all property definitions with the top matcher
            for (PropertyDefinition propertyDefinition : propertyDefinitions) {
                if (propertyMatcher.match(propertyDefinition)) {
                    matchedPropDefs.add(propertyDefinition);
                }
            }
            if (matchedPropDefs.size() == 1) {
                return matchedPropDefs.get(0);
            } else if (matchedPropDefs.size() > 1) {
                return findMatchingPropertyDef(matchedPropDefs, propertyMatcherList);
            }
        }
        return null;
    }
}
