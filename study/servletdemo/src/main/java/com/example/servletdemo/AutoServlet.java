package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class AutoServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("servlet init...");
    }
}
