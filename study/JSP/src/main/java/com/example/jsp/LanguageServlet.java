package com.example.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/language")
public class LanguageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String language= req.getHeader("Accept-Language");
        //给request设值
        req.setAttribute("key",language);
        //将值传到jsp
        req.getRequestDispatcher("requestforward.jsp").forward(req,resp);
    }
}
