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
package org.apache.sling.sample.slingshot.ratings.impl;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.sample.slingshot.SlingshotConstants;
import org.apache.sling.testing.mock.sling.junit.SlingContext;
import org.junit.Rule;
import org.junit.Test;

public class RatingServiceImplTest {

    @Rule
    public SlingContext context = new SlingContext();

    @Test
    public void getRatingsResourcePath() {
        context.load().json("/slingshot.json", SlingshotConstants.APP_ROOT_PATH);
        RatingsServiceImpl service = new RatingsServiceImpl();
        Resource resource = context.resourceResolver().getResource(SlingshotConstants.APP_ROOT_PATH + "/users/admin/content/hobby");
        String ratingsResourcePath = service.getRatingsResourcePath(resource);
        assertThat(ratingsResourcePath, equalTo("/slingshot/users/admin/ugc/ratings/hobby"));
    }

    @Test
    public void getRatingsResourcePath_missing() {
        context.load().json("/slingshot.json", SlingshotConstants.APP_ROOT_PATH);
        RatingsServiceImpl service = new RatingsServiceImpl();
        Resource resource = context.resourceResolver().getResource(SlingshotConstants.APP_ROOT_PATH + "/users/admin");
        String ratingsResourcePath = service.getRatingsResourcePath(resource);
        assertThat(ratingsResourcePath, nullValue());
    }
}
