package com.example.dao;

import com.example.pojo.Users;

import java.sql.Connection;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        UserLoginDaoImpl userLoginDao=new UserLoginDaoImpl();
//        Users u=userLoginDao.selectUsersByUserNameAndUserPwd("admin","admin");
//        System.out.println(u.getUserid());
//        System.out.println(u.getUsername());
//        System.out.println(u.getUserpwd());
//        System.out.println(u.getUsersex());
        Users user=new Users();
//        user.setUsersex("1");
//        user.setUsername("admin");
        UserManagerDao userManagerDao=new UserManagerDaoImpl();
        List<Users> usersList=userManagerDao.selectUserByProperty(user);
        System.out.println(usersList.size());



    }
}
