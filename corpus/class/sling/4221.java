/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.jcr.jackrabbit.server.impl.security;

import org.apache.jackrabbit.core.security.AnonymousPrincipal;
import java.security.Principal;

/**
 *
 */
public final class AnonCredentials extends TrustedCredentials {

    /**
     * 
     */
    private static final long serialVersionUID = 5680761007286418384L;

    /**
     * @param anonUser
     */
    public  AnonCredentials(String anonUser) {
        super(anonUser);
    }

    /**
     * {@inheritDoc}
     * @see org.apache.sling.jcr.jackrabbit.server.impl.security.TrustedCredentials#getPrincipal(java.lang.String)
     */
    @Override
    protected Principal getPrincipal(String userId) {
        return new AnonymousPrincipal();
    }
}
