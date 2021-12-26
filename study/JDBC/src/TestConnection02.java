import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

public class TestConnection02 {
    public static void main(String[] args) throws Exception {
        //通过反射方式
        Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();
        String url = "jdbc:mysql://localhost:3306/baizhan";
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "123456");
        Connection connection = driver.connect(url, info);
        System.out.println(connection);

    }
}
