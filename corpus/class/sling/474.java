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
package org.apache.sling.mailarchiveserver.util;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class MailArchiveServerConstants {

    public static final String ARCHIVE_PATH = "/content/mailarchiveserver/archive/";

    //RT = ResourceType
    public static final String RT_KEY = "sling:resourceType";

    public static final String DOMAIN_RT = "mailarchiveserver/domain";

    public static final String LIST_RT = "mailarchiveserver/list";

    public static final String THREAD_RT = "mailarchiveserver/thread";

    public static final String MESSAGE_RT = "mailarchiveserver/message";

    public static final CharsetEncoder DEFAULT_ENCODER = Charset.forName("UTF-8").newEncoder();
}
