import org.apache.log4j.*;
import java.sql.*;
import java.lang.*;
import java.util.*;

public class Log4JTest {

    // Create a category instance for this class
    static Category cat = Category.getInstance(Log4JTest.class.getName());

    public static void main(String[] args) {
        // Ensure to have all necessary drivers installed !
        try {
            Driver d = (Driver) (Class.forName("oracle.jdbc.driver.OracleDriver").newInstance());
            DriverManager.registerDriver(d);
        } catch (Exception e) {
        }
        // Set the priority which messages have to be logged
        cat.setPriority(Priority.INFO);
        // Configuration with configuration-file
        PropertyConfigurator.configure("log4jtestprops.txt");
        // These messages with Priority >= setted priority will be logged to the database.
        //this not, because Priority DEBUG is less than INFO
        cat.debug("debug");
        cat.info("info");
        cat.error("error");
        cat.fatal("fatal");
    }
}

// Implement a sample JDBCConnectionHandler
class MyConnectionHandler implements JDBCConnectionHandler {

    Connection con = null;

    //Default connection
    String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1521))(ADDRESS=(COMMUNITY=tcp.world)(PROTOCOL=TCP)(Host=LENZI)(Port=1526)))(CONNECT_DATA=(SID=LENZI)))";

    String username = "mex_pr_dev60";

    String password = "mex_pr_dev60";

    public Connection getConnection() {
        return getConnection(url, username, password);
    }

    public Connection getConnection(String _url, String _username, String _password) {
        try {
            if (con != null && !con.isClosed())
                con.close();
            con = DriverManager.getConnection(_url, _username, _password);
            con.setAutoCommit(false);
        } catch (Exception e) {
        }
        return con;
    }
}

// Implement a sample JDBCIDHandler
class MyIDHandler implements JDBCIDHandler {

    private static long id = 0;

    public synchronized Object getID() {
        return new Long(++id);
    }
}
