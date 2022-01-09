package com.bjsxt.service;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.dao.UsersDaoImpl;
import com.bjsxt.pojo.Users;
import com.bjsxt.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

public class UsersServiceImpl implements UsersService{
    @Override
    public void addUsers(Users users) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        try{
            UsersDao usersDao=new UsersDaoImpl();
            usersDao.insertUsers(users);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    @Override
    public void dropUsersById(int userid) {
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        try{
            UsersDao usersDao=new UsersDaoImpl();
            usersDao.deleteUsersById(userid);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    @Override
    public Users preUpdateUsers(int userid) {
        Users users = null;
        try{
            SqlSession sqlSession = MybatisUtil.getSqlSession();
            UsersDao usersDao = new UsersDaoImpl();
            users = usersDao.selectUsersById2(userid);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            MybatisUtil.closeSqlSession();
        }
        return users;
    }

    @Override
    public void modifyUsers(Users users) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try{
            UsersDao usersDao = new UsersDaoImpl();
            usersDao.updateUsersById(users);
            sqlSession.commit();
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MybatisUtil.closeSqlSession();
        }
    }

    @Override
    public Map<Integer, Users> findUsersByNameAndSex(String username, String usersex) {
        Map<Integer, Users> map=null;
        try{
            UsersDao usersDao=new UsersDaoImpl();
            map=usersDao.selectUserByNameAndSex(username,usersex);
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            MybatisUtil.closeSqlSession();
        }
        return map;
    }
}
