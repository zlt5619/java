package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseCharactorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/plain");
        resp.setContentType("text/html;");
//        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Hello World</h1>");
        out.println("</body></html>");
        out.flush();
        out.close();
    }
}
