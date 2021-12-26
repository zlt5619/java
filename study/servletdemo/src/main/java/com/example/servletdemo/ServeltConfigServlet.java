package com.example.servletdemo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ServeltConfigServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //<servlet>标签中<init-param>标签中的配置信息
        ServletConfig serveltConfig=this.getServletConfig();
        Enumeration<String> e=serveltConfig.getInitParameterNames();
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        while(e.hasMoreElements()){
            out.println("<h1> key:"+e.nextElement()+"</h1>");
        }
        out.println("</body></html>");
    }
}
