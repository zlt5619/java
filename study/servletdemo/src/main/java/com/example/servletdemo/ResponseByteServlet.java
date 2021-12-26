package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ResponseByteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        File file=new File("D:\\java学习资料\\05、JAVAEE 和项目开发\\03、Servlet技术详解\\源码\\web\\images\\尚学堂.jpg");
        FileInputStream fis=new FileInputStream(file);
        byte[] buf=new byte[fis.available()];
        fis.read(buf);

        //设置相应类型
        resp.setContentType("image/jpeg");
        //从httpservlet对象中获取字节输出流对象
        OutputStream os=resp.getOutputStream();
        os.write(buf);
        os.flush();
        os.close();

    }
}
