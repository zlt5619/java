import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class TestConnection05 {
    public static void main(String[] args) throws Exception {
        //推荐的方式
        //将数据库链接需要的4个基本信息声明在配置文件中，通过读取配置文件的方式。
        //将配置文件和程序分开
        //数据与代码的分离
        InputStream is = TestConnection05.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        //将读取的inputstream加载到properties中
        properties.load(is);
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

    }
}
