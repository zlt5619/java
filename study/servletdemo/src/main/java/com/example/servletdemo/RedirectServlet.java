package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String search=req.getParameter("search");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> URI:" + search + "</h1>");
        out.println("</body></html>");

        resp.sendRedirect("https://www.baidu.com/s?ie=utf-8&wd="+search);
    }
}
