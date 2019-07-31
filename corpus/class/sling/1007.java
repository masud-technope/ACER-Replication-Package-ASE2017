import java.io.IOException;
import org.apache.sling.commons.testing.integration.HttpTestBase;
import org.junit.Test;

public class LaunchpadReadyIT extends HttpTestBase {

    @Test
    public void testLaunchpadReady() throws IOException {
        assertHttpStatus(HTTP_URL + "/index.html", 200);
    }
}
