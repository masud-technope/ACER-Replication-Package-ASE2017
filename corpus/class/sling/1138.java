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
package org.apache.sling.commons.osgi.bundleversion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class BundleVersionComparisonTest {

    @Test
    public void testSimpleCompare() {
        // We want more recent bundles to be "greater" than older ones
        {
            final MockBundleVersionInfo a = new MockBundleVersionInfo("a.name", "1.1", 1);
            final MockBundleVersionInfo b = new MockBundleVersionInfo("a.name", "1.0", 1);
            assertEquals("a is more recent than b", 1, a.compareTo(b));
        }
        {
            final MockBundleVersionInfo a = new MockBundleVersionInfo("b", "1.2.0.SNAPSHOT", 2);
            final MockBundleVersionInfo b = new MockBundleVersionInfo("b", "1.2.0.SNAPSHOT", 1);
            assertEquals("SNAPSHOT a is more recent than b", 1, a.compareTo(b));
        }
    }

    @Test
    public void testSortBundles() {
        // The comparator sorts bundles in ascending order
        // of their symbolic names and versions
        final MockBundleVersionInfo[] sorted = { new MockBundleVersionInfo("a.name", "1.0", 1), new MockBundleVersionInfo("a.name", "1.1", 1), new MockBundleVersionInfo("b", "0.8.1", 1), new MockBundleVersionInfo("b", "0.9", 1), new MockBundleVersionInfo("b", "1.0", 1), new MockBundleVersionInfo("b", "1.0.1.SNAPSHOT", 1), new MockBundleVersionInfo("b", "1.0.1.SNAPSHOT", 2), new MockBundleVersionInfo("b", "1.1", 1), new MockBundleVersionInfo("b", "1.2.0.SNAPSHOT", 1), new MockBundleVersionInfo("b", "1.2.0.SNAPSHOT", 2) };
        final List<BundleVersionInfo<?>> list = new ArrayList<BundleVersionInfo<?>>();
        for (int i = sorted.length - 1; i >= 0; i--) {
            list.add(sorted[i]);
        }
        final String firstBeforeSort = list.get(0).toString();
        Collections.sort(list);
        final String newFirstItem = list.get(0).toString();
        assertFalse("First item (" + newFirstItem + ") must have changed during sort", firstBeforeSort.equals(newFirstItem));
        int i = 0;
        for (BundleVersionInfo<?> vi : list) {
            assertEquals("Item sorted as expected at index " + i, sorted[i].toString(), vi.toString());
            i++;
        }
    }

    @Test
    public void testEqual() {
        final MockBundleVersionInfo a = new MockBundleVersionInfo("a", "1.0", 2);
        final MockBundleVersionInfo b = new MockBundleVersionInfo("a", "1.0", 1);
        assertEquals("Last-modified must not be relevant for non-snapshot bundles", 0, a.compareTo(b));
    }

    public void testExceptionsOnNull() {
        final MockBundleVersionInfo a = new MockBundleVersionInfo("a", "1.0", 2);
        try {
            a.compareTo(null);
            fail("Expected an IllegalArgumentException");
        } catch (IllegalArgumentException asExpected) {
        }
    }

    public void testExceptionOnNonBundle() {
        final MockBundleVersionInfo a = new MockBundleVersionInfo("a", "1.0", 2);
        final MockBundleVersionInfo nonBundle = new MockBundleVersionInfo();
        try {
            a.compareTo(nonBundle);
            fail("Expected an IllegalArgumentException");
        } catch (IllegalArgumentException asExpected) {
        }
        try {
            nonBundle.compareTo(a);
            fail("Expected an IllegalArgumentException");
        } catch (IllegalArgumentException asExpected) {
        }
    }
}
