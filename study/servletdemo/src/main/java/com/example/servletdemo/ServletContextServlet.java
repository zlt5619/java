package com.example.servletdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Enumeration;

public class ServletContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext=this.getServletContext();
        String realPath=servletContext.getRealPath("img/尚学堂.jpg");
        //用于读取静态资源
//        File file=new File(realPath);
//        FileInputStream fis=new FileInputStream(file);
//        byte[] buf=new byte[fis.available()];
//        fis.read(buf);
//
//        //设置相应类型
//        resp.setContentType("image/jpeg");
//        //从httpservlet对象中获取字节输出流对象
//        OutputStream os=resp.getOutputStream();
//        os.write(buf);
//        os.flush();
//        os.close();

        String s1=servletContext.getServerInfo();
        //返回 Servlet 容器的名称和版本号
        int i1=servletContext.getMajorVersion();
       // 返回 Servlet 容器所支持 Servlet 的主版本号。
        int i2=servletContext.getMinorVersion();
        //返回 Servlet 容器所支持 Servlet 的副版本号。

        //读取web.xml请文件 context-param标签
        Enumeration<String> e=servletContext.getInitParameterNames();
        //设置全局容器
        servletContext.setAttribute("key",new String("s"));
        String s=(String)servletContext.getAttribute("key");

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> path:" + realPath + "</h1>");
        out.println("<h1> version:" + s1 + "</h1>");
        out.println("<h1>  main version:" + i1 + "</h1>");
        out.println("<h1> second version:" + i2+ "</h1>");
        while(e.hasMoreElements()){
            out.println("<h1> key:"+e.nextElement()+"</h1>");
        }
        out.println("<h1> container key:" + s+ "</h1>");
        out.println("</body></html>");
    }
}
