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
package org.apache.sling.commons.log.logback.internal;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.apache.sling.commons.log.logback.internal.AppenderTracker.AppenderInfo;
import org.apache.sling.commons.log.logback.internal.util.SlingRollingFileAppender;
import org.apache.sling.commons.log.logback.internal.util.SlingStatusPrinter;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.gaffer.GafferUtil;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.classic.jul.LevelChangePropagator;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerContextAwareBase;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.classic.util.EnvUtil;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.joran.GenericConfigurator;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusListenerAsList;
import ch.qos.logback.core.status.StatusUtil;

public class LogbackManager extends LoggerContextAwareBase {

    private static final String JUL_SUPPORT = "org.apache.sling.commons.log.julenabled";

    //These properties should have been defined in SlingLogPanel
    //But we need them while registering ServiceFactory and hence
    //would not want to load SlingLogPanel class for registration
    //purpose as we need to run in cases where Servlet classes
    //are not available
    static final String APP_ROOT = "slinglog";

    static final String RES_LOC = APP_ROOT + "/res/ui";

    public static final String[] CSS_REFS = { RES_LOC + "/jquery.autocomplete.css", RES_LOC + "/prettify.css", RES_LOC + "/log.css" };

    private static final String PREFIX = "org.apache.sling.commons.log";

    private static final String DEBUG = PREFIX + "." + "debug";

    private static final String PRINTER_URL = "slinglogs";

    private static final String RESET_EVENT_TOPIC = "org/apache/sling/commons/log/RESET";

    /**
     * Framework property specifying the root location used to resolve relative paths
     */
    private static final String SLING_LOG_ROOT = "sling.log.root";

    private final BundleContext bundleContext;

    private final String rootDir;

    private final String contextName = "sling";

    private final LogConfigManager logConfigManager;

    private final List<LogbackResetListener> resetListeners = new ArrayList<LogbackResetListener>();

    private final org.slf4j.Logger log;

    /**
     * Acts as a bridge between Logback and OSGi
     */
    private final LoggerContextListener osgiIntegrationListener = new OsgiIntegrationListener();

    private final boolean debug;

    private final boolean started;

    private final Semaphore resetLock = new Semaphore(1);

    private final Object configChangedFlagLock = new Object();

    private boolean configChanged = false;

    private final AppenderTracker appenderTracker;

    private final ConfigSourceTracker configSourceTracker;

    private final FilterTracker filterTracker;

    private final TurboFilterTracker turboFilterTracker;

    private final List<ServiceRegistration> registrations = new ArrayList<ServiceRegistration>();

    private final List<ServiceTracker> serviceTrackers = new ArrayList<ServiceTracker>();

    private final boolean bridgeHandlerInstalled;

    /**
     * Time at which reset started. Used as the threshold for logging error
     * messages from status printer
     */
    private volatile long resetStartTime;

    public  LogbackManager(BundleContext bundleContext) throws InvalidSyntaxException {
        this.bundleContext = bundleContext;
        setLoggerContext((LoggerContext) LoggerFactory.getILoggerFactory());
        this.log = LoggerFactory.getLogger(getClass());
        this.rootDir = getRootDir(bundleContext);
        this.debug = Boolean.parseBoolean(bundleContext.getProperty(DEBUG));
        this.bridgeHandlerInstalled = installSlf4jBridgeHandler(bundleContext);
        this.appenderTracker = new AppenderTracker(bundleContext, getLoggerContext());
        this.configSourceTracker = new ConfigSourceTracker(bundleContext, this);
        this.filterTracker = new FilterTracker(bundleContext, this);
        this.turboFilterTracker = new TurboFilterTracker(bundleContext, getLoggerContext());
        getLoggerContext().setName(contextName);
        this.logConfigManager = new LogConfigManager(getLoggerContext(), bundleContext, rootDir, this);
        resetListeners.add(new LevelChangePropagatorChecker());
        resetListeners.add(logConfigManager);
        resetListeners.add(appenderTracker);
        resetListeners.add(configSourceTracker);
        resetListeners.add(filterTracker);
        resetListeners.add(turboFilterTracker);
        //Should be invoked at last
        resetListeners.add(new RootLoggerListener());
        //Record trackers for shutdown later
        serviceTrackers.add(appenderTracker);
        serviceTrackers.add(configSourceTracker);
        serviceTrackers.add(filterTracker);
        serviceTrackers.add(turboFilterTracker);
        getLoggerContext().addListener(osgiIntegrationListener);
        registerWebConsoleSupport();
        registerEventHandler();
        started = true;
        configChanged();
    }

    public void shutdown() {
        if (bridgeHandlerInstalled) {
            SLF4JBridgeHandler.uninstall();
        }
        logConfigManager.close();
        for (ServiceTracker tracker : serviceTrackers) {
            tracker.close();
        }
        for (ServiceRegistration reg : registrations) {
            reg.unregister();
        }
        getLoggerContext().removeListener(osgiIntegrationListener);
        getLoggerContext().stop();
    }

    //-------------------------------------- Config reset handling ----------
    public void configChanged() {
        if (!started) {
            return;
        }
        synchronized (configChangedFlagLock) {
            if (resetLock.tryAcquire()) {
                configChanged = false;
                scheduleConfigReload();
            } else {
                configChanged = true;
                addInfo("LoggerContext reset in progress. Marking config changed to true");
            }
        }
    }

    private void rescheduleIfConfigChanged() {
        synchronized (configChangedFlagLock) {
            //and proceed to reload
            if (configChanged) {
                if (resetLock.tryAcquire()) {
                    configChanged = false;
                    scheduleConfigReload();
                }
            //else some other thread acquired the resetlock
            //and reset is in progress. That job would
            //eventually call rescheduleIfConfigChanged again
            //and configChanged request would be taken care of
            }
        }
    }

    private void scheduleConfigReload() {
        getLoggerContext().getExecutorService().submit(new Runnable() {

            @Override
            public void run() {
                // TODO Might be better to run a job to monitor refreshRequirement
                try {
                    addInfo("Performing configuration");
                    configure();
                } catch (Exception e) {
                    log.warn("Error occurred while re-configuring logger", e);
                    addError("Error occurred while re-configuring logger", e);
                } finally {
                    resetLock.release();
                    addInfo("Re configuration done");
                    rescheduleIfConfigChanged();
                }
            }
        });
    }

    public void fireResetCompleteListeners() {
        for (LogbackResetListener listener : resetListeners) {
            addInfo("Firing reset listener - onResetComplete " + listener.getClass());
            listener.onResetComplete(getLoggerContext());
        }
    }

    public LogConfigManager getLogConfigManager() {
        return logConfigManager;
    }

    public AppenderTracker getAppenderTracker() {
        return appenderTracker;
    }

    public ConfigSourceTracker getConfigSourceTracker() {
        return configSourceTracker;
    }

    public void addSubsitutionProperties(InterpretationContext ic) {
        ic.addSubstitutionProperty("sling.home", rootDir);
    }

    public URL getDefaultConfig() {
        return getClass().getClassLoader().getResource("logback-empty.xml");
    }

    public String getRootDir() {
        return rootDir;
    }

    private void configure() {
        ConfiguratorCallback cb = new DefaultCallback();
        // Check first for an explicit configuration file
        File configFile = logConfigManager.getLogbackConfigFile();
        if (configFile != null) {
            cb = new FilenameConfiguratorCallback(configFile);
        }
        configure(cb);
    }

    private void configure(ConfiguratorCallback cb) {
        long startTime = System.currentTimeMillis();
        StatusListener statusListener = new StatusListenerAsList();
        if (debug) {
            statusListener = new OnConsoleStatusListener();
        }
        getStatusManager().add(statusListener);
        addInfo("Resetting context: " + getLoggerContext().getName());
        resetContext(statusListener);
        StatusUtil statusUtil = new StatusUtil(getLoggerContext());
        JoranConfigurator configurator = createConfigurator();
        final List<SaxEvent> eventList = configurator.recallSafeConfiguration();
        final long threshold = System.currentTimeMillis();
        boolean success = false;
        try {
            cb.perform(configurator);
            if (statusUtil.hasXMLParsingErrors(threshold)) {
                cb.fallbackConfiguration(eventList, createConfigurator(), statusListener);
            }
            addInfo("Context: " + getLoggerContext().getName() + " reloaded.");
            success = true;
        } catch (Throwable t) {
            addError("Error occurred while configuring Logback", t);
        } finally {
            if (!success) {
                cb.fallbackConfiguration(eventList, createConfigurator(), statusListener);
            }
            getStatusManager().remove(statusListener);
            SlingStatusPrinter.printInCaseOfErrorsOrWarnings(getLoggerContext(), resetStartTime, startTime, success);
        }
    }

    private JoranConfigurator createConfigurator() {
        SlingConfigurator configurator = new SlingConfigurator();
        configurator.setContext(getLoggerContext());
        return configurator;
    }

    private void resetContext(StatusListener statusListener) {
        getLoggerContext().reset();
        // after a reset the statusListenerAsList gets removed as a listener
        if (statusListener != null && !getStatusManager().getCopyOfStatusListenerList().contains(statusListener)) {
            getStatusManager().add(statusListener);
        }
    }

    private String getRootDir(BundleContext bundleContext) {
        String rootDir = bundleContext.getProperty(SLING_LOG_ROOT);
        if (rootDir == null) {
            rootDir = bundleContext.getProperty("sling.home");
            if (rootDir == null) {
                rootDir = new File(".").getAbsolutePath();
            }
        }
        addInfo("Using rootDir as " + rootDir);
        return rootDir;
    }

    //~-------------------------------------------------- Slf4j Bridge Handler Support
    /**
     * Installs the Slf4j BridgeHandler to route the JUL logs through Slf4j
     *
     * @return true only if the BridgeHandler is installed.
     */
    private static boolean installSlf4jBridgeHandler(BundleContext bundleContext) {
        // SLING-2373
        if (Boolean.parseBoolean(bundleContext.getProperty(JUL_SUPPORT))) {
            // make sure configuration is empty unless explicitly set
            if (System.getProperty("java.util.logging.config.file") == null && System.getProperty("java.util.logging.config.class") == null) {
                final Thread ct = Thread.currentThread();
                final ClassLoader old = ct.getContextClassLoader();
                try {
                    ct.setContextClassLoader(LogbackManager.class.getClassLoader());
                    System.setProperty("java.util.logging.config.class", DummyLogManagerConfiguration.class.getName());
                    java.util.logging.LogManager.getLogManager().reset();
                } finally {
                    ct.setContextClassLoader(old);
                    System.clearProperty("java.util.logging.config.class");
                }
            }
            SLF4JBridgeHandler.install();
            return true;
        }
        return false;
    }

    /**
     * It checks if LevelChangePropagator is installed or not. If not then
     * it installs the propagator when Slf4j Bridge Handler is installed
     */
    private class LevelChangePropagatorChecker implements LogbackResetListener {

        @Override
        public void onResetStart(LoggerContext context) {
        }

        @Override
        public void onResetComplete(LoggerContext context) {
            List<LoggerContextListener> listenerList = context.getCopyOfListenerList();
            boolean levelChangePropagatorInstalled = false;
            for (LoggerContextListener listener : listenerList) {
                if (listener instanceof LevelChangePropagator) {
                    levelChangePropagatorInstalled = true;
                    break;
                }
            }
            //http://logback.qos.ch/manual/configuration.html#LevelChangePropagator
            if (!levelChangePropagatorInstalled && bridgeHandlerInstalled) {
                LevelChangePropagator propagator = new LevelChangePropagator();
                propagator.setContext(context);
                propagator.start();
                context.addListener(propagator);
                addInfo("Slf4j bridge handler found to be enabled. Installing the LevelChangePropagator");
            }
        }
    }

    /**
     * The <code>DummyLogManagerConfiguration</code> class is used as JUL
     * LogginManager configurator to preven reading platform default
     * configuration which just duplicate log output to be redirected to SLF4J.
     */
    @SuppressWarnings("UnusedDeclaration")
    public static class DummyLogManagerConfiguration {
    }

    private class OsgiIntegrationListener implements LoggerContextListener {

        @Override
        public boolean isResetResistant() {
            // on its own in ReconfigureOnChangeFilter
            return true;
        }

        @Override
        public void onStart(LoggerContext context) {
        }

        @Override
        public void onReset(LoggerContext context) {
            addInfo("OsgiIntegrationListener : context reset detected. Adding LogManager to context map and firing" + " listeners");
            context.setPackagingDataEnabled(logConfigManager.isPackagingDataEnabled());
            context.setMaxCallerDataDepth(logConfigManager.getMaxCallerDataDepth());
            // Attach a console appender to handle logging untill we configure
            // one. This would be removed in RootLoggerListener.reset
            final Logger rootLogger = getLoggerContext().getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
            rootLogger.setLevel(Level.INFO);
            rootLogger.addAppender(logConfigManager.getDefaultAppender());
            // Now record the time of reset with a default appender attached to
            // root logger. We also add a milli second extra to account for logs which would have
            // got fired in same duration
            resetStartTime = System.currentTimeMillis() + TimeUnit.MILLISECONDS.toMillis(1);
            addInfo("Registered a default console based logger");
            context.putObject(LogbackManager.class.getName(), LogbackManager.this);
            for (LogbackResetListener l : resetListeners) {
                addInfo("Firing reset listener - onResetStart " + l.getClass());
                l.onResetStart(context);
            }
        }

        @Override
        public void onStop(LoggerContext context) {
        }

        @Override
        public void onLevelChange(Logger logger, Level level) {
        }
    }

    private class RootLoggerListener implements LogbackResetListener {

        @Override
        public void onResetStart(LoggerContext context) {
        }

        @Override
        public void onResetComplete(LoggerContext context) {
            // Remove the default console appender that we attached at start of
            // reset
            ch.qos.logback.classic.Logger root = context.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
            Iterator<Appender<ILoggingEvent>> appenderItr = root.iteratorForAppenders();
            //Root logger has at least 1 appender associated with it. Remove the one added by us
            if (appenderItr.hasNext()) {
                root.detachAppender(LogConfigManager.DEFAULT_CONSOLE_APPENDER_NAME);
                addInfo("Found appender attached with root logger. Detaching the default console based logger");
            } else {
                addInfo("No appender was found to be associated with root logger. Registering " + "a Console based logger");
            }
        }
    }

    private class SlingConfigurator extends JoranConfigurator {

        @Override
        protected void buildInterpreter() {
            super.buildInterpreter();
            addSubsitutionProperties(interpreter.getInterpretationContext());
        }
    }

    private abstract class ConfiguratorCallback {

        abstract void perform(JoranConfigurator configurator) throws JoranException;

        /**
         * Logic based on
         * ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter.
         * ReconfiguringThread
         */
        public void fallbackConfiguration(List<SaxEvent> eventList, JoranConfigurator configurator, StatusListener statusListener) {
            URL mainURL = getMainUrl();
            if (mainURL != null) {
                if (eventList != null) {
                    addWarn("Falling back to previously registered safe configuration.");
                    try {
                        resetContext(statusListener);
                        GenericConfigurator.informContextOfURLUsedForConfiguration(context, mainURL);
                        configurator.doConfigure(eventList);
                        addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
                        configurator.registerSafeConfiguration();
                    } catch (JoranException e) {
                        addError("Unexpected exception thrown by a configuration considered safe.", e);
                    }
                } else {
                    addWarn("No previous configuration to fall back on.");
                }
            }
        }

        protected URL getMainUrl() {
            return null;
        }
    }

    private class FilenameConfiguratorCallback extends ConfiguratorCallback {

        private final File configFile;

        public  FilenameConfiguratorCallback(File configFile) {
            this.configFile = configFile;
        }

        @Override
        public void perform(JoranConfigurator configurator) throws JoranException {
            final String path = configFile.getAbsolutePath();
            addInfo("Configuring from " + path);
            if (configFile.getName().endsWith("xml")) {
                configurator.doConfigure(configFile);
            } else if (configFile.getName().endsWith("groovy")) {
                if (EnvUtil.isGroovyAvailable()) {
                    // avoid directly referring to GafferConfigurator so as to
                    // avoid
                    // loading groovy.lang.GroovyObject . See also
                    // http://jira.qos.ch/browse/LBCLASSIC-214
                    GafferUtil.runGafferConfiguratorOn(getLoggerContext(), this, configFile);
                } else {
                    addError("Groovy classes are not available on the class path. ABORTING INITIALIZATION.");
                }
            }
        }

        @Override
        protected URL getMainUrl() {
            try {
                return configFile.toURI().toURL();
            } catch (MalformedURLException e) {
                addWarn("Cannot convert file to url " + configFile.getAbsolutePath(), e);
                return null;
            }
        }
    }

    private class DefaultCallback extends ConfiguratorCallback {

        @Override
        public void perform(JoranConfigurator configurator) throws JoranException {
            configurator.doConfigure(getMainUrl());
        }

        @Override
        protected URL getMainUrl() {
            return getDefaultConfig();
        }
    }

    // ~ ----------------------------------------------WebConsole Support
    public LoggerStateContext determineLoggerState() {
        final List<Logger> loggers = getLoggerContext().getLoggerList();
        final LoggerStateContext ctx = new LoggerStateContext(loggers);
        //2. Other means - Configured via Logback config or any other means
        for (LogConfig lc : logConfigManager.getLogConfigs()) {
            for (String category : lc.getCategories()) {
                ctx.osgiConfiguredLoggers.put(category, lc);
            }
        }
        for (Logger logger : loggers) {
            boolean hasOnlySlingRollingAppenders = true;
            Iterator<Appender<ILoggingEvent>> itr = logger.iteratorForAppenders();
            while (itr.hasNext()) {
                Appender<ILoggingEvent> a = itr.next();
                if (a.getName() != null && !ctx.appenders.containsKey(a.getName())) {
                    ctx.appenders.put(a.getName(), a);
                }
                if (!(a instanceof SlingRollingFileAppender)) {
                    hasOnlySlingRollingAppenders = false;
                }
            }
            if (logger.getLevel() == null) {
                continue;
            }
            boolean configuredViaOSGiConfig = ctx.osgiConfiguredLoggers.containsKey(logger.getName());
            if (!configuredViaOSGiConfig || (configuredViaOSGiConfig && !hasOnlySlingRollingAppenders)) {
                ctx.nonOSgiConfiguredLoggers.add(logger);
            }
        }
        return ctx;
    }

    public class LoggerStateContext {

        final LoggerContext loggerContext = getLoggerContext();

        final List<Logger> allLoggers;

        /**
         * List of logger which have explicitly defined level or appenders set
         */
        final List<Logger> nonOSgiConfiguredLoggers = new ArrayList<Logger>();

        final Map<String, LogConfig> osgiConfiguredLoggers = new HashMap<String, LogConfig>();

        final Map<String, Appender<ILoggingEvent>> appenders = new HashMap<String, Appender<ILoggingEvent>>();

        final Map<Appender<ILoggingEvent>, AppenderInfo> dynamicAppenders = new HashMap<Appender<ILoggingEvent>, AppenderInfo>();

        final Map<ServiceReference, TurboFilter> turboFilters;

         LoggerStateContext(List<Logger> allLoggers) {
            this.allLoggers = allLoggers;
            for (AppenderTracker.AppenderInfo ai : getAppenderTracker().getAppenderInfos()) {
                dynamicAppenders.put(ai.appender, ai);
            }
            this.turboFilters = turboFilterTracker.getFilters();
        }

        int getNumberOfLoggers() {
            return allLoggers.size();
        }

        int getNumOfDynamicAppenders() {
            return getAppenderTracker().getAppenderInfos().size();
        }

        int getNumOfAppenders() {
            return appenders.size();
        }

        boolean isDynamicAppender(Appender<ILoggingEvent> a) {
            return dynamicAppenders.containsKey(a);
        }

        ServiceReference getTurboFilterRef(TurboFilter tf) {
            for (Map.Entry<ServiceReference, TurboFilter> e : turboFilters.entrySet()) {
                if (e.getValue().equals(tf)) {
                    return e.getKey();
                }
            }
            return null;
        }

        Collection<Appender<ILoggingEvent>> getAllAppenders() {
            return appenders.values();
        }

        Map<String, Appender<ILoggingEvent>> getAppenderMap() {
            return Collections.unmodifiableMap(appenders);
        }
    }

    private void registerWebConsoleSupport() {
        final ServiceFactory serviceFactory = new PluginServiceFactory();
        Properties pluginProps = new Properties();
        pluginProps.put(Constants.SERVICE_VENDOR, "Apache Software Foundation");
        pluginProps.put(Constants.SERVICE_DESCRIPTION, "Sling Log Support");
        pluginProps.put("felix.webconsole.label", APP_ROOT);
        pluginProps.put("felix.webconsole.title", "Log Support");
        pluginProps.put("felix.webconsole.category", "Sling");
        pluginProps.put("felix.webconsole.css", CSS_REFS);
        registrations.add(bundleContext.registerService("javax.servlet.Servlet", serviceFactory, pluginProps));
        Properties printerProps = new Properties();
        printerProps.put(Constants.SERVICE_VENDOR, "Apache Software Foundation");
        printerProps.put(Constants.SERVICE_DESCRIPTION, "Sling Log Configuration Printer");
        printerProps.put("felix.webconsole.label", PRINTER_URL);
        printerProps.put("felix.webconsole.title", "Log Files");
        printerProps.put("felix.webconsole.configprinter.modes", "always");
        // TODO need to see to add support for Inventory Feature
        registrations.add(bundleContext.registerService(SlingConfigurationPrinter.class.getName(), new SlingConfigurationPrinter(this), printerProps));
    }

    private class PluginServiceFactory implements ServiceFactory {

        private Object instance;

        @Override
        public Object getService(Bundle bundle, ServiceRegistration registration) {
            synchronized (this) {
                if (this.instance == null) {
                    this.instance = new SlingLogPanel(LogbackManager.this, bundleContext);
                }
                return instance;
            }
        }

        @Override
        public void ungetService(Bundle bundle, ServiceRegistration registration, Object service) {
        }
    }

    private void registerEventHandler() {
        Properties props = new Properties();
        props.put(Constants.SERVICE_VENDOR, "Apache Software Foundation");
        props.put(Constants.SERVICE_DESCRIPTION, "Sling Log Reset Event Handler");
        props.put("event.topics", new String[] { RESET_EVENT_TOPIC });
        registrations.add(bundleContext.registerService("org.osgi.service.event.EventHandler", new ServiceFactory() {

            private Object instance;

            @Override
            public Object getService(Bundle bundle, ServiceRegistration serviceRegistration) {
                synchronized (this) {
                    if (this.instance == null) {
                        this.instance = new ConfigResetRequestHandler(LogbackManager.this);
                    }
                    return instance;
                }
            }

            @Override
            public void ungetService(Bundle bundle, ServiceRegistration serviceRegistration, Object o) {
            }
        }, props));
    }
}
