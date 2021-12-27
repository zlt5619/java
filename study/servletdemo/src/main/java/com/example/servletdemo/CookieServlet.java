package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建cookie对象，服务端创建，发送到浏览器
        Cookie cookie=new Cookie("key1","SXT");
        cookie.setMaxAge(60);
        Cookie cookie1=new Cookie("key2","北京");
        resp.addCookie(cookie);
//        resp.addCookie(cookie1);

        //获取cookie对象
        Cookie[] cookies=req.getCookies();
        //解决中文问题,servlet4.0做法
        resp.setContentType("text/html;charset=utf-8");
        //解决中文问题,servlet4.0之前做法
//        Cookie cookie1=new Cookie("key2", URLEncoder.encode("北京","utf-8"));
        resp.addCookie(cookie1);


        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        for(Cookie c:cookies){
//            if(c.getName()=="key2"){
//                out.println("<h1> key2:"+ URLDecoder.decode(c.getValue(),"utf-8")+"<h1>");
//            }else{
//                out.println("<h1> cookie-name:" + c.getName() +"   value:"+c.getValue()+ "</h1>");
//            }
            out.println("<h1> cookie-name:" + c.getName() +"   value:"+c.getValue()+ "</h1>");
        }

        out.println("</body></html>");
        out.flush();
        out.close();
    }
}
