package com.example.Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//servletcontext生命周期监听器
public class ServerContextLifeCycleListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("servletcontext init");
        ServletContext servletContext=sce.getServletContext();
        System.out.println(servletContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servletcontext destroy");
        ServletContext servletContext=sce.getServletContext();
        System.out.println(servletContext);
    }
}
