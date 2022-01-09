package com.example.listener;

import com.example.commons.Constance;
import com.example.pojo.Users;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/*
 解决 HttpSession 被反复销毁的问题
 */
@WebListener
public class HttpSessionLifecycleListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSessionListener.super.sessionCreated(se);
    }
    /*
    获取servletcontext对象，将对应的session删除掉
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session=se.getSession();
        ServletContext servletContext=session.getServletContext();
        Users user=(Users) session.getAttribute(Constance.User_Seesion_key);
        servletContext.removeAttribute(user.getUserid()+"");
    }
}
