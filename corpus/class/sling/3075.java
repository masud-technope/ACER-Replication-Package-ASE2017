package org.apache.sling.hc.samples.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.apache.sling.junit.annotations.SlingAnnotationsTestRunner;
import org.apache.sling.junit.annotations.TestReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/** Trivial test used to demonstrate the junit Health Check service.
 *  Verify that the BundleContext is injected and that a specific
 *  bundle is active.
 */
@RunWith(SlingAnnotationsTestRunner.class)
public class SampleJUnitTest {

    @TestReference
    private BundleContext bundleContext;

    @Test
    public void checkBundleContext() {
        assertNotNull(bundleContext);
    }

    @Test
    public void checkSlingAPIBundleActive() {
        // TODO - adjust
        final String symbolicName = "org.apache.sling.api";
        for (Bundle b : bundleContext.getBundles()) {
            if (symbolicName.equals(b.getSymbolicName())) {
                assertEquals("Expecting " + symbolicName + " to be active", Bundle.ACTIVE, b.getState());
            }
        }
    }
}
