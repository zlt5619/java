package com.bjsxt.test;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import com.bjsxt.service.UsersServiceImpl;

import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        UsersService usersService=new UsersServiceImpl();
        Map<Integer, Users> map= usersService.findUsersByNameAndSex("bjsxt","male");
        Set<Integer> integer=map.keySet();
        for(Integer key:integer){
            Users users=map.get(key);
            System.out.println(users.getUserid()+"\t"+users.getUsername()+"\t"+users.getUsersex());
        }
    }
}
