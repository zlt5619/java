package com.example.service;

import com.example.dao.UserLoginDao;
import com.example.dao.UserLoginDaoImpl;
import com.example.exception.UserNotFoundException;
import com.example.pojo.Users;

public class UserLoginServiceImpl implements UserLoginService{
    @Override
    public Users userLogin(String username, String userpwd) {
        UserLoginDao userLoginDao=new UserLoginDaoImpl();
        Users user=userLoginDao.selectUsersByUserNameAndUserPwd(username,userpwd);
        if(user==null){
            throw new UserNotFoundException("用户名或密码有误");
        }
        return user;
    }
}
