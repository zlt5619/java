package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class DownloadFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file=new File("D:\\java学习资料\\05、JAVAEE 和项目开发\\03、Servlet技术详解\\源码\\web\\images\\尚学堂.jpg");
        FileInputStream fis=new FileInputStream(file);
        byte[] buf=new byte[fis.available()];
        fis.read(buf);
        //设置响应头，用于下载
        //处理文件名中文乱码
        resp.addHeader("Content-Disposition","attachment; filename="+new String(file.getName().getBytes("gbk"),"iso-8859-1"));
        OutputStream os=resp.getOutputStream();
        os.write(buf);
        os.flush();
        os.close();
    }
}
