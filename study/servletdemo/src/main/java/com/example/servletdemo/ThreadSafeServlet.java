package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ThreadSafeServlet extends HttpServlet {
    private PrintWriter pw=null;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        synchronized (this){
            try{
                Thread.sleep(5000);
                pw=resp.getWriter();
                pw.println(name);
                pw.flush();
                pw.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
