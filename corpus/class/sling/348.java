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
package org.apache.sling.commons.log.logback;

import aQute.bnd.annotation.ProviderType;
import org.apache.sling.commons.log.logback.internal.OsgiAppenderRefInternalAction;

/**
 * The action class needs to be referred in external files hence adding a marker
 * class in public package which extends the internal class.
 * <p>
 * This class is for configuration reference only. Consumers are not intended to
 * instantiate or extend from it.
 */
@ProviderType
public final class OsgiAppenderRefAction extends OsgiAppenderRefInternalAction {
}
