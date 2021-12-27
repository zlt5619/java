package com.example.filter;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {
    //初始化Filter，初始化时，会调用一次
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(" filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("预处理请求");
        //对请求做放行处理
        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("预处理响应");
    }

    //销毁前，被调用一次
    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
