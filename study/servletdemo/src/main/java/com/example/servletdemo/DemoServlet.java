package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
* 获取请求信息
*
*
 */
@WebServlet(name = "DemoServlet", value = "/demoservlet")
public class DemoServlet extends HttpServlet {
    public void init() {

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI=req.getRequestURI();
        StringBuffer requestURL=req.getRequestURL();
        String remoteAddr=req.getRemoteAddr();
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> URI:" + requestURI + "</h1>");
        out.println("<h1> URL:" + requestURL + "</h1>");
        out.println("<h1> remoteAddr" + remoteAddr + "</h1>");
        out.println("</body></html>");
        out.flush();
        out.close();
    }
    public void destroy() {
    }
}
