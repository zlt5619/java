package com.example.service;

import com.example.pojo.Users;

public class test {
    public static void main(String[] args) {
        UserLoginService userLoginService=new UserLoginServiceImpl();
        Users u=userLoginService.userLogin("admin","admin");
        System.out.println(u);
        System.out.println(u.getUserid());
        System.out.println(u.getUsername());
        System.out.println(u.getUserpwd());
        System.out.println(u.getUsersex());
        Users user=new Users();
        user.setUsername("zlt");
        user.setUserpwd("123");
        user.setUsersex("0");
        user.setPhonenumber("123");
        user.setQqnumber("345");
        UserManagerService userManagerService=new UserManagetServiceImpl();
        userManagerService.addUser(user);
    }
}
