package com.example.servletdemo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Annotation",name = "AnnotationServlet",initParams ={@WebInitParam(name="key1",value="value1"),@WebInitParam(name="key2",value="value2")},loadOnStartup=1)

public class AnnotationServlet extends HttpServlet {
    String s1=null;
    String s2=null;
    @Override
    public void init() throws ServletException {
        ServletConfig serveltConfig=this.getServletConfig();
        s1=serveltConfig.getInitParameter("key1");
        s2=serveltConfig.getInitParameter("key2");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> Annotation  Servlet</h1>");
        out.println("<h1> "+s1+"</h1>");
        out.println("<h1> "+s2+"</h1>");
        out.println("</body></html>");
        out.flush();
        out.close();
    }
}
