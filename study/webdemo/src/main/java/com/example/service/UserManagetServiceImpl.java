package com.example.service;

import com.example.dao.UserManagerDao;
import com.example.dao.UserManagerDaoImpl;
import com.example.pojo.Users;

import java.util.List;

/*
* 用户管理业务层
* */
public class UserManagetServiceImpl implements UserManagerService{
    @Override
    public void addUser(Users user) {
        UserManagerDao userManagerDao=new UserManagerDaoImpl();
        userManagerDao.insertUser(user);
    }

    @Override
    public List<Users> findUser(Users users) {
        UserManagerDao userManagerDao=new UserManagerDaoImpl();
        return userManagerDao.selectUserByProperty(users);
    }

    @Override
    public Users findUserByUserId(int id) {
        UserManagerDao userManagerDao=new UserManagerDaoImpl();
        return userManagerDao.selectUserByUserId(id);
    }

    @Override
    public void modifyUser(Users users) {
        UserManagerDao userManagerDao = new UserManagerDaoImpl();
        userManagerDao.updateUserByUserId(users);
    }
}
