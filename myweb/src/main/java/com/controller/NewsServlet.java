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
import java.util.List;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> newsList= userService.getNews();
        newsList.forEach(i-> i.setTime(i.getTime().substring(0,10)));
        req.setAttribute("newslist",newsList);
        req.getRequestDispatcher("/WEB-INF/jsp/news.jsp")
                .forward(req,resp);
    }
}
