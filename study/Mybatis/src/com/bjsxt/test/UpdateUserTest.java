package com.bjsxt.test;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import com.bjsxt.service.UsersServiceImpl;

public class UpdateUserTest {
    public static void main(String[] args) {
        UsersService usersService = new UsersServiceImpl();
        Users users = usersService.preUpdateUsers(2);
        System.out.println(users.getUserid());
        users.setUsername("zlt");
        users.setUsersex("MALE");
        usersService.modifyUsers(users);
    }
}
