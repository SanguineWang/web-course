package com.controller;

import com.HelloServlet;
import com.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      请求转发
       req.getRequestDispatcher("/WEB-INF/jsp/login.html").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String username=req.getParameter("username");
     String password=req.getParameter("password");
     if(username.equals("a") && password.equals("123")){
         User user =new User("wang");
//   将信息添加到session中
         req.getSession().setAttribute("name",user);
       // 重定向
         resp.sendRedirect("/welcome");
     }else {
         resp.sendRedirect("/login");
     }

    }
}
