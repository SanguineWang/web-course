package com.controller;

import com.entity.User;
import com.mysql.cj.log.Log;
import com.service.ServiceFactory;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp")
                .forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String password = req.getParameter("key");
        User user = userService.getUser(id);
        String url = null;
        if (password.equals(user.getKey())) {
            User u = new User("id");
            req.getSession().setAttribute("user", u);
            System.out.println(u);
           if (user.getIsadmin()==1){
               url = "/admin";
           }else {
               url = "/index";
           }
        } else {
            url = "/register";
        }
        resp.sendRedirect(url);
    }
}
