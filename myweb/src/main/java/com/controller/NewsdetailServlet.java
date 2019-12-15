package com.controller;

import com.entity.News;
import com.service.ServiceFactory;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newsdetail")
public class NewsdetailServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        News news=userService.idGetNews(id);
        req.setAttribute("item",news);
        req.getRequestDispatcher("/WEB-INF/jsp/newsdetail.jsp")
                .forward(req,resp);
    }
}
