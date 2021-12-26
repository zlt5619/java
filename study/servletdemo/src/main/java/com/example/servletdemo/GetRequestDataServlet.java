package com.example.servletdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class GetRequestDataServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username=req.getParameter("username");
        String[] userlike=req.getParameterValues("userlike");
        Enumeration<String> parameterNames = req.getParameterNames();
        Map<String,String[]> map= (Map<String, String[]>) req.getParameterMap();
        List<String> keys=new ArrayList<>();
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1> username:" + username+ "</h1>");
        for(String s:userlike){
            out.println("<h1> userlike:" + s+ "</h1>");
        }
        while (parameterNames.hasMoreElements()){
            keys.add(parameterNames.nextElement());
        }
        Iterator<Map.Entry<String,String[]>> iterator=map.entrySet().iterator();
        out.println("<h1> keys:" + keys+ "</h1>");
        while (iterator.hasNext()){
            Map.Entry<String,String[]> entry=iterator.next();
            out.println("key:"+entry.getKey()+";Value:"+Arrays.asList(entry.getValue())+"</br>");
        }
        out.println("</body></html>");
        out.flush();
        out.close();
    }

}
