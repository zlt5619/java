package com.bjsxt.test;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.dao.UsersDaoImpl;
import com.bjsxt.pojo.Users;

import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        UsersDao usersDao=new UsersDaoImpl();
//        List<Users> list=usersDao.selectUsersAll();
//        for(Users users:list){
//            System.out.println(users.getUserid()+"\t"+users.getUsername()+"\t"+users.getUsersex());
//        }

       Users users= usersDao.selectUsersById(2);
        System.out.println(users.getUserid()+"\t"+users.getUsername()+"\t"+users.getUsersex());

    }
}
