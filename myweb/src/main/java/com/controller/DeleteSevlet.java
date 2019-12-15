package com.controller;

import com.service.ServiceFactory;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteSevlet  extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String direct=req.getParameter("direct");
       int id =Integer.parseInt(req.getParameter("id"));
       if (direct.equals("notice")){
           userService.deleteNotice(id);
       }
       else {
           userService.deleteNews(id);
       }
      resp.sendRedirect("/admin");
    }
}
