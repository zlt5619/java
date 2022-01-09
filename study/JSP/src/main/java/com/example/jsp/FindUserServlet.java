package com.example.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/finduser")
public class FindUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> list=new ArrayList<>();
        User user1=new User(1,"zlt");
        User user2=new User(2,"zzm");
        list.add(user1);
        list.add(user2);
        req.setAttribute("list",list);
        req.getRequestDispatcher("showUsers.jsp").forward(req,resp);
    }
}
