package org.apache.sling.jcr.resource.internal;

import java.util.HashMap;
import java.util.Map;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.PathSet;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.jcr.api.SlingRepository;
import org.apache.sling.jcr.resource.JcrResourceConstants;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.EventAdmin;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Support object for the different observation implementations
 */
public class ObservationListenerSupport {

    /** Logger */
    private final Logger logger = LoggerFactory.getLogger(ObservationListenerSupport.class);

    private final ServiceTracker eventAdminTracker;

    private volatile ServiceTracker resourceResolverFactoryTracker;

    private volatile int resourceResolverFactoryChangeCount = -1;

    /** The admin resource resolver. */
    private volatile ResourceResolver resourceResolver;

    private final BundleContext bundleContext;

    private final Session session;

    private final PathSet excludedPaths;

    public  ObservationListenerSupport(final BundleContext bundleContext, final SlingRepository repository, final PathSet excludedPaths) throws RepositoryException {
        this.bundleContext = bundleContext;
        this.eventAdminTracker = new ServiceTracker(bundleContext, EventAdmin.class.getName(), null);
        this.eventAdminTracker.open();
        this.excludedPaths = excludedPaths;
        this.session = repository.loginAdministrative(null);
    }

    /**
     * Dispose this support object.
     */
    public void dispose() {
        if (this.resourceResolver != null) {
            this.resourceResolver.close();
            this.resourceResolver = null;
        }
        if (this.resourceResolverFactoryTracker != null) {
            this.resourceResolverFactoryTracker.close();
            this.resourceResolverFactoryTracker = null;
        }
        this.eventAdminTracker.close();
        this.session.logout();
    }

    public boolean isExcluded(final String path) {
        return this.excludedPaths != null && this.excludedPaths.matches(path) != null;
    }

    public Session getSession() {
        return this.session;
    }

    public EventAdmin getEventAdmin() {
        return (EventAdmin) this.eventAdminTracker.getService();
    }

    /**
     * Get a resource resolver.
     * We don't need any syncing as this is called from the process OSGi thread.
     *
     * @return the resolver
     */
    public ResourceResolver getResourceResolver() {
        if (this.resourceResolver == null || (this.resourceResolverFactoryTracker != null && (resourceResolverFactoryChangeCount < this.resourceResolverFactoryTracker.getTrackingCount()))) {
            if (this.resourceResolver != null) {
                this.resourceResolver.close();
                this.resourceResolver = null;
            }
            if (this.resourceResolverFactoryTracker == null) {
                this.resourceResolverFactoryTracker = new ServiceTracker(this.bundleContext, ResourceResolverFactory.class.getName(), null);
                this.resourceResolverFactoryTracker.open();
            }
            final ResourceResolverFactory factory = (ResourceResolverFactory) this.resourceResolverFactoryTracker.getService();
            if (factory != null) {
                final Map<String, Object> authInfo = new HashMap<String, Object>();
                authInfo.put(JcrResourceConstants.AUTHENTICATION_INFO_SESSION, this.session);
                try {
                    this.resourceResolver = factory.getResourceResolver(authInfo);
                    this.resourceResolverFactoryChangeCount = this.resourceResolverFactoryTracker.getTrackingCount();
                } catch (final LoginException le) {
                    logger.error("Unable to get administrative resource resolver.", le);
                }
            }
        }
        if (this.resourceResolver != null) {
            this.resourceResolver.refresh();
        }
        return this.resourceResolver;
    }
}
