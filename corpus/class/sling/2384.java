package org.apache.sling.performance.tests;

import java.math.BigInteger;
import java.security.SecureRandom;
import javax.jcr.Node;
import org.apache.jackrabbit.JcrConstants;
import org.apache.sling.commons.testing.jcr.RepositoryUtil;
import org.apache.sling.performance.AbstractRepositoryTest;
import org.apache.sling.performance.TestHelper;
import org.apache.sling.performance.annotation.AfterMethodInvocation;
import org.apache.sling.performance.annotation.PerformanceTest;
import org.junit.After;
import org.junit.Before;

public class StartupWithManyAliasTest extends AbstractRepositoryTest {

    private static final String PN_SLING_ALIAS = "sling:alias";

    public static final String PROP_REDIRECT_INTERNAL = "sling:internalRedirect";

    private final TestHelper helper;

    private Node mapRoot;

    private Node rootNode;

    private String rootPath;

    private final int nodeCount;

    public  StartupWithManyAliasTest(String testInstanceName, TestHelper helper, int nodeCount) {
        super(testInstanceName);
        this.helper = helper;
        this.nodeCount = nodeCount;
    }

    @After
    protected void afterSuite() throws Exception {
        if (helper != null) {
            helper.dispose();
        }
        if (rootNode != null) {
            rootNode.remove();
        }
        if (mapRoot != null) {
            mapRoot.remove();
        }
        session.save();
    }

    @AfterMethodInvocation
    protected void afterMethod() throws Exception {
        helper.dispose();
    }

    @Before
    protected void beforeSuite() throws Exception {
        RepositoryUtil.registerNodeType(getSession(), this.getClass().getResourceAsStream("/SLING-INF/nodetypes/folder.cnd"));
        RepositoryUtil.registerNodeType(getSession(), this.getClass().getResourceAsStream("/SLING-INF/nodetypes/resource.cnd"));
        RepositoryUtil.registerNodeType(getSession(), this.getClass().getResourceAsStream("/SLING-INF/nodetypes/vanitypath.cnd"));
        RepositoryUtil.registerNodeType(getSession(), this.getClass().getResourceAsStream("/SLING-INF/nodetypes/mapping.cnd"));
        // test data
        rootPath = "/test" + System.currentTimeMillis();
        rootNode = getSession().getRootNode().addNode(rootPath.substring(1), "nt:unstructured");
        // test mappings
        mapRoot = getSession().getRootNode().addNode("etc", JcrConstants.NT_FOLDER);
        Node map = mapRoot.addNode("map", "sling:Mapping");
        Node http = map.addNode("http", "sling:Mapping");
        Node aliasNode = map.addNode("alias", "nt:unstructured");
        Node localhost80 = http.addNode("localhost.80", "sling:Mapping");
        Node https = map.addNode("https", "sling:Mapping");
        https.addNode("localhost.443", "sling:Mapping");
        SecureRandom random = new SecureRandom();
        for (int j = 0; j < nodeCount; j++) {
            Node content = rootNode.addNode("a" + j, JcrConstants.NT_UNSTRUCTURED);
            String alias = new BigInteger(130, random).toString(32);
            content.setProperty(PN_SLING_ALIAS, alias);
            if (j % 10 == 0) {
                session.save();
            }
        }
        session.save();
    }

    @PerformanceTest
    public void runTest() throws Exception {
        helper.init(rootPath, session, getRepository());
    }
}
