package com.baizhan.Dao;

import com.baizhan.account.JDBCutil;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao<T> {
    // 定义一个变量来接收泛型的类型
    private Class<T> type;

    // 获取T的Class对象，获取泛型的类型，泛型是在被子类继承时才确定
    public BaseDao() {
        // 获取子类的类型
        Class clazz = this.getClass();
        // 获取父类的类型
        // getGenericSuperclass()用来获取当前类的父类的类型
        // ParameterizedType表示的是带泛型的类型
        ParameterizedType parameterizedType = (ParameterizedType) clazz.getGenericSuperclass();
        // 获取具体的泛型类型 getActualTypeArguments获取具体的泛型的类型
        // 这个方法会返回一个Type的数组
        Type[] types = parameterizedType.getActualTypeArguments();
        // 获取具体的泛型的类型
        this.type = (Class<T>) types[0];
    }

    //通用的增删改操作
    public int executeUpdate(String sql, Object... param) throws Exception {
        //获取连接
        Connection conn = JDBCutil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(sql);
        //绑定参数
        for (int i = 0; i < param.length; i++) {
            psmt.setObject(i + 1, param[i]);
        }
        int rows = psmt.executeUpdate();
        JDBCutil.close(conn, psmt);
        //返回受影响行数
        return rows;
    }

    //通用查询方法，返回一条或多条查询记录
    public List<T> getBean(String sql, Object... param) throws Exception {
        List<T> list = new ArrayList<>();
        //获取连接
        Connection conn = JDBCutil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(sql);
        //绑定参数
        for (int i = 0; i < param.length; i++) {
            psmt.setObject(i + 1, param[i]);
        }
        //获取结果集的信息
        ResultSet rs = psmt.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        while (rs.next()) {
            T bean = type.newInstance();
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                //得到列名
                String columnName = rsmd.getColumnName(i + 1);
                //获取列的值
                Object value = rs.getObject(columnName);
                //通过 BeanUtil工具类将值注入到对象中
                BeanUtils.setProperty(bean, columnName, value);
            }
            list.add(bean);
        }
        return list;

    }

    //获取单一值，如select(*),select max(date)等等
    public Object getValue(String sql, Object... param) throws Exception {
        Object res = null;
        Connection conn = JDBCutil.getConnection();
        PreparedStatement psmt = conn.prepareStatement(sql);
        for (int i = 0; i < param.length; i++) {
            psmt.setObject(i + 1, param[i]);
        }
        ResultSet rs = psmt.executeQuery();
        if (rs.next()) {
            //获取第一列的值
            res = rs.getObject(1);
        }
        return res;

    }
}
