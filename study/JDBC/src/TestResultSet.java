import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class TestResultSet {
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
        String sql = "select * from employees.employees";
        ResultSet rs = s.executeQuery(sql);
        int i = 0;
        while (rs.next()) {
            //System.out.println(rs.getString("emp_no")+":"+rs.getString("first_name"));
            i++;
        }
        System.out.println(i);
        s.close();
        conn.close();
    }

}
