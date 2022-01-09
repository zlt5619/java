package com.bjsxt.test;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import com.bjsxt.service.UsersServiceImpl;

public class AddUserTest {
    public static void main(String[] args) {
        UsersService usersService=new UsersServiceImpl();
        Users users=new Users();
        users.setUsersex("male");
        users.setUsername("张三");
        usersService.addUsers(users);

    }
}
