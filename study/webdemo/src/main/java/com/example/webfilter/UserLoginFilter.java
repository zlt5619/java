package com.example.webfilter;

import com.example.commons.Constance;
import com.example.pojo.Users;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 判断当前客户端浏览器是否登录
 */
@WebFilter(urlPatterns = {"*.do","*.jsp"})
public class UserLoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String uri=request.getRequestURI();
        if(uri.indexOf("login.jsp")!=-1 || uri.indexOf("login.do")!=-1||uri.indexOf("validateCode.do")!=-1){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            HttpSession session=request.getSession();
            Users user= (Users) session.getAttribute(Constance.User_Seesion_key);
            if(user!=null){
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                request.setAttribute(Constance.REQUEST_MSG,"不登陆不好使");
                request.getRequestDispatcher("login.jsp").forward(servletRequest,servletResponse);
            }


        }
    }
}
