package com.example.servlet;

import com.example.commons.Constance;
import com.example.exception.UserNotFoundException;
import com.example.pojo.Users;
import com.example.service.UserLoginService;
import com.example.service.UserLoginServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
处理用户登录请求
 */
@WebServlet(urlPatterns = "/login.do")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String userpwd=req.getParameter("userpwd");
        try{
            UserLoginService userLoginService=new UserLoginServiceImpl();
            Users user=userLoginService.userLogin(username,userpwd);
            //建立客户端与服务端的会话状态
            HttpSession session=req.getSession();
            session.setAttribute(Constance.User_Seesion_key,user);
            //用户只能一处登录
            ServletContext servletContext=this.getServletContext();
            HttpSession temp=(HttpSession) servletContext.getAttribute(user.getUserid()+"");
            if(temp!=null){
                servletContext.removeAttribute(user.getUserid()+"");
                temp.invalidate();
            }
            servletContext.setAttribute(user.getUserid()+"",session);
            //使用重定向方式跳转到首页
            resp.sendRedirect("main.jsp");
        }catch (UserNotFoundException e){
            req.setAttribute("msg",e.getMessage());
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
}
