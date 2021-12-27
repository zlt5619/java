package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        session.setAttribute("key1","value1");
        session.setAttribute("key2","value2");
        session.setAttribute("key3","value3");

        String id=session.getId();
        String s=(String)session.getAttribute("key1");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Create session "+id+"</h1>");
        out.println("<h1> value1: "+s+"</h1>");
        out.println("</body></html>");
        out.flush();
        out.close();
    }
}
