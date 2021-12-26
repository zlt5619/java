import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class TestConnection04 {
    public static void main(String[] args) throws Exception {
        //MySql驱动默认会进行驱动的注册
        String url = "jdbc:mysql://localhost:3306/baizhan";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

    }
}
