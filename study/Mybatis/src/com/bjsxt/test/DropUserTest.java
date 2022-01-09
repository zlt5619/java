package com.bjsxt.test;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import com.bjsxt.service.UsersServiceImpl;

public class DropUserTest {
    public static void main(String[] args) {
        UsersService usersService=new UsersServiceImpl();

        usersService.dropUsersById(3);
    }
}
