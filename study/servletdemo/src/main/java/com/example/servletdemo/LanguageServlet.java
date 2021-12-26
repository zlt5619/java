package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LanguageServlet extends HttpServlet {
    //如果浏览器的语言是 zh-CN，显示“你好，聪明的中国人！”，
    // 如果浏览器的语言设置为 en-US,那么则显示“Hello，American”

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String language=req.getHeader("Accept-Language");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println(language);
        if(language.indexOf("zh-CN")!=-1){
            out.println("你好，中国人");
        }
        if(language.indexOf("en-US")!=-1){
            out.println("hello,american");
        }

        out.println("</body></html>");
        out.flush();
        out.close();
    }
}
