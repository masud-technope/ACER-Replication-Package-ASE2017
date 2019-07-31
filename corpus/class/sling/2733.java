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
package org.apache.sling.ide.test.impl.helpers;

import org.apache.sling.ide.transport.CommandExecutionProperties;
import org.osgi.service.event.Event;

/**
 * The <tt>FailOnUnsuccessfulEventsRule</tt> fails the test if an unsuccesful event was found
 *
 */
public class FailOnUnsuccessfulEventsRule extends AbstractFailOnUnexpectedEventsRule {

    @Override
    public void handleEvent(Event event) {
        Boolean status = (Boolean) event.getProperty(CommandExecutionProperties.RESULT_STATUS);
        if (!status) {
            addUnexpectedEvent(event);
        }
    }
}