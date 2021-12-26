import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class TestStatement01 {
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

        //执行statement对象
        Statement s = conn.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter username");
        String username = scanner.next();
        System.out.println("enter password");
        String password02 = scanner.next();
        //拼接sql语句
        String sql = "insert into baizhan.user1 (username,password) values('" + username + "','" + password02 + "')";
        s.execute(sql);
        s.close();
        conn.close();


    }
}
