package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class GetHeaderServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String headerValue = req.getHeader("Accept-Language");
        Enumeration<String> headerNames = req.getHeaderNames();

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> header:" + headerValue + "</h1>");
        while (headerNames.hasMoreElements()){
            String key=headerNames.nextElement();
            out.println("<h1> header-key:"+key+"   header-value:" + req.getHeader(key) + "</h1>");
        }
        out.println("</body></html>");
        out.flush();
        out.close();
    }
}
