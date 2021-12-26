import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class TestConnection03 {
    public static void main(String[] args) throws Exception {
        //使用DriverManager替换Driver
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();
        //注册DriverManager
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://localhost:3306/baizhan";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

    }
}
