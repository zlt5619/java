package com.example.servlet;

import com.example.pojo.Users;
import com.example.service.UserManagerService;
import com.example.service.UserManagetServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
*用户管理
 */
@WebServlet(urlPatterns = "/userManage.do")
public class UserManagerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String flag=req.getParameter("flag");
        if("addUser".equals(flag)){
            this.addUser(req,resp);
        }
        if("findUser".equals(flag)){
            this.findUser(req,resp);
        }
        if("preUpdate".equals(flag)){
            this.preUpdate(req,resp);
        }
    }

    private void findUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Users users=this.createUser(req);
        try{
            UserManagerService userManagerService=new UserManagetServiceImpl();
            List<Users> list=userManagerService.findUser(users);
            req.setAttribute("list",list);
            req.getRequestDispatcher("usermanager/viewUser.jsp").forward(req,resp);
        }catch (Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    //预更新
    private void preUpdate(HttpServletRequest req, HttpServletResponse
            resp) throws ServletException, IOException{
        String userid = req.getParameter("userid");
        try{
            UserManagerService userManagerService = new UserManagetServiceImpl();
            Users user =
                    userManagerService.findUserByUserId(Integer.parseInt(userid));
            req.setAttribute("user",user);

            req.getRequestDispatcher("usermanager/updateUser.jsp").forward(req,resp);
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }

    }
    /**
     * 处理更新用户请求
     */
    private void modifyUser(HttpServletRequest req, HttpServletResponse
            resp) throws ServletException, IOException{
        String userid = req.getParameter("userid");
        Users users = this.createUser(req);
        users.setUserid(Integer.parseInt(userid));
        try{
            UserManagerService userManagerService = new
                    UserManagetServiceImpl();
            userManagerService.modifyUser(users);
            resp.sendRedirect("ok.jsp");
        }catch(Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }
    //处理用户添加请求
    private void addUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Users user=this.createUser(req);
        System.out.println(user);
        try{
            UserManagerService userManagerService=new UserManagetServiceImpl();
            userManagerService.addUser(user);
            resp.sendRedirect("ok.jsp");
        }catch (Exception e){
            e.printStackTrace();
            resp.sendRedirect("error.jsp");
        }
    }

    //获取用户提交数据
    private Users createUser(HttpServletRequest req){
        String username = req.getParameter("username");
        String userpwd = req.getParameter("userpwd");
        String usersex = req.getParameter("usersex");
        String phonenumber = req.getParameter("phonenumber");
        String qqnumber = req.getParameter("qqnumber");
        Users user = new Users();
        user.setQqnumber(qqnumber);
        user.setPhonenumber(phonenumber);
        user.setUsername(username);
        user.setUserpwd(userpwd);
        user.setUsersex(usersex);
        return user;
    }
}
