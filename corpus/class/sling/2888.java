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
package org.apache.sling.validation;

import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 * A {@code ValidationResult} contains validation information about a validated property / child resource.
 */
public interface ValidationResult {

    /**
     * Tells if the validation was successful or not.
     *
     * @return {@code true} for yes, {@code false} otherwise
     */
    boolean isValid();

    /**
     * In case the validation failed (check the {@link ValidationResult#isValid()} method), this method returns the failure's causes. The
     * keys of the returned {@link Map} will contain the validated resource's properties (or child resources' properties) names; the
     * associated values will be the actual failure messages.
     *
     * @return the validation's failure messages (never {@code null})
     */
    @Nonnull
    Map<String, List<String>> getFailureMessages();
}
