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
package org.apache.sling.launchpad.testservices.servlets;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

/** Example/test Sling Servlet using a prefix to demonstrate how
 *  PrefixServletZero overrides PrefixServletMinusOne
 */
@Component(immediate = true, metatype = false)
@Service(value = javax.servlet.Servlet.class)
@Properties({ @Property(name = "service.description", value = "Prefix Test Servlet Minus One"), @Property(name = "service.vendor", value = "The Apache Software Foundation"), @Property(name = "sling.servlet.prefix", intValue = -1), @Property(name = "sling.servlet.resourceTypes", value = "sling/servlet/default"), @Property(name = "sling.servlet.extensions", value = { "TEST_EXT_3", "TEST_EXT_4" }) })
@SuppressWarnings("serial")
public class PrefixServletMinusOne extends TestServlet {
}
