package com.example.servletdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.UUID;

@WebServlet(urlPatterns = "/fileupload")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String desc=req.getParameter("desc");
        Part part=req.getPart("file");
        //获取文件上传的字节流
//        InputStream is=part.getInputStream();
        //给文件改名
        String filename= UUID.randomUUID().toString()+part.getSubmittedFileName().substring(part.getSubmittedFileName().lastIndexOf("."));
        //路径转换
        ServletContext servletContext=this.getServletContext();
        String realpath=servletContext.getRealPath("img/"+filename);
        part.write(realpath);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> 上传成功 </h1>");

        out.println("</body></html>");
        out.flush();
        out.close();



    }
}
