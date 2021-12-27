package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class CookieServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建cookie对象，服务端创建，发送到浏览器
        Cookie[] cookies=req.getCookies();
        boolean flag=false;
        if(cookies!=null){
            for(Cookie cookie:cookies){
                if("first".equals(cookie.getName())){
                    flag=true;
                }
            }
        }
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        if(flag){
            out.println("<h1>欢迎您回来</h1>");
        }else{
            out.println("<h1>欢迎您第一次访问</h1>");
            Cookie c=new Cookie("first","first-visit");
            c.setMaxAge(60);
            resp.addCookie(c);
        }


        out.println("</body></html>");
        out.flush();
        out.close();

    }
}
