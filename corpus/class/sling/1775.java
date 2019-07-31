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
package org.apache.sling.models.it.models.implextend;

import javax.inject.Inject;
import javax.inject.Named;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

/**
 * Additional model class that implements the same interface as {@link ImplementsInterfacePropertyModel}.
 */
@Model(adaptables = Resource.class, adapters = { SampleServiceInterface.class })
public class ImplementsInterfacePropertyModel2 implements SampleServiceInterface {

    @Inject
    private String first;

    @Inject
    @Optional
    private String second;

    @Inject
    @Named("third")
    private String thirdProperty;

    public String getAllProperties() {
        StringBuilder sb = new StringBuilder();
        sb.append(first).append("|").append(second).append("|").append(thirdProperty);
        return sb.toString();
    }
}
