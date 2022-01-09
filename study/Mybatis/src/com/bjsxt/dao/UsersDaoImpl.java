package com.bjsxt.dao;

import com.bjsxt.pojo.Users;
import com.bjsxt.utils.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDaoImpl implements UsersDao{
    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> selectUsersAll() throws IOException {
        //创建SqlSessionFactory对象
        //根据全局配置文件进行配置
        InputStream inputStream=Resources.getResourceAsStream("mybatis_cfg.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象
        //通过工厂,获取连接
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //通过SqlSession的API操作数据库
        List<Users> list=sqlSession.selectList("com.bjsxt.mapper.UsersMapper.selectUsersAll");
        //关闭SqlSession
        sqlSession.close();
        return list;
    }
    /**
     * 根据id查询用户
     * @return
     */
    @Override
    public Users selectUsersById(int userid) throws IOException {
        //创建SqlSessionFactory对象
        //根据全局配置文件进行配置
        InputStream inputStream=Resources.getResourceAsStream("mybatis_cfg.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //获取SqlSession对象
        //通过工厂,获取连接
        SqlSession sqlSession=sqlSessionFactory.openSession();
        Users users=sqlSession.selectOne("com.bjsxt.mapper.UsersMapper.selectUserById",userid);
        return users;
    }

    @Override
    public void insertUsers(Users users) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        sqlSession.insert("com.bjsxt.mapper.UsersMapper.insertUsers",users);

    }

    @Override
    public void deleteUsersById(int userid) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        int delete=sqlSession.delete("com.bjsxt.mapper.UsersMapper.deleteUsersById",userid);
    }

    @Override
    public Users selectUsersById2(int userid) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Users users = sqlSession.selectOne("com.bjsxt.mapper.UsersMapper.selectUserById2",userid);
        return users;
    }

    @Override
    public void updateUsersById(Users users) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        sqlSession.update("com.bjsxt.mapper.UsersMapper.updateUsersById", users);
    }

    @Override
    public Map<Integer, Users> selectUserByNameAndSex(String username, String usersex) {
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        Map<String ,String> param=new HashMap<>();
        //跟Mapper中的规定值一致
        param.put("name",username);
        param.put("sex",usersex);
        Map<Integer,Users> users=sqlSession.selectMap("com.bjsxt.mapper.UsersMapper.selectUserByNameAndSex",param,"userid");
        return users;

    }
}
