import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class TestPreparedStatement {
    public static void main(String[] args) throws Exception {
        InputStream is = TestStatement01.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(is);
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "insert into user1(username,password) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        //setString方法会自动给参数携带引号
        ps.setString(1, "admin6");
        ps.setString(2, "123456");

        ps.executeUpdate();
        conn.close();
    }
}
