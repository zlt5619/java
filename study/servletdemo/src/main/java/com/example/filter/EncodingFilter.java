package com.example.filter;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    private String encode;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String encode=filterConfig.getInitParameter("code");
        this.encode=encode;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(this.encode!=null){
            servletRequest.setCharacterEncoding("utf-8");
        }else{
            servletRequest.setCharacterEncoding(this.encode);
        }

        //不建议设置response的响应编码,在servlet中设定
//        servletResponse.setCharacterEncoding("utf-8");
//        servletResponse.setContentType("text/html;charset=utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
