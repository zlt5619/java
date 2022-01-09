package com.bjsxt.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {
    private static ThreadLocal<SqlSession> threadLocal=new ThreadLocal<>();
    private static SqlSessionFactory sqlSessionFactory=null;
    //创建工厂
    static {
        InputStream is=null;
        try{
            is= Resources.getResourceAsStream("mybatis-cfg.xml");

        }catch (Exception e){
            e.printStackTrace();
        }
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }
    //获取sqlsession
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=threadLocal.get();
        if(sqlSession==null){
            sqlSession=sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    //关闭sqlsession对象
    public static void closeSqlSession(){
        SqlSession sqlSession=threadLocal.get();
        if(sqlSession!=null){
            sqlSession.close();
            threadLocal.set(null);
        }
    }
}
