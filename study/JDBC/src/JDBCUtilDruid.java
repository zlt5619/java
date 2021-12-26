import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.baizhan.Pool.TestDBCP02;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtilDruid {
    //使用Druid连接池的JDBCUtil类
    private static DataSource ds = null;

    static {
        InputStream is = TestDBCP02.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
            DataSource ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection conn = ds.getConnection();
        return conn;
    }

    public static void close(Connection conn, Statement statement) throws SQLException {
        if (conn != null) {
            conn.close();
        }
        if (statement != null) {
            statement.close();
        }
    }

}
