package com.baizhan.Dao;

import com.baizhan.Utils.User;

public class Test {
    public static void main(String[] args) throws Exception {
        UserDAOImpl userDAO = new UserDAOImpl();
        User u = userDAO.getUser("admin6");
        System.out.println(u.toString());

        User u1 = new User();
        u1.setId(10);
        u1.setUsername("zzm");
        u1.setPassword("1234");
        userDAO.insertUser(u1);


    }
}
