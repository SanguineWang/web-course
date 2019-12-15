package com.controller;

import com.entity.News;
import com.entity.Notice;
import com.service.ServiceFactory;
import com.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.service.ServiceFactory;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> newsList= userService.getNews();
        List<Notice> noticeList=userService.getNotice();
        req.setAttribute("newslist",newsList);
        req.setAttribute("noticelist",noticeList);
        req.setAttribute("newssize",newsList.size());
        req.setAttribute("noticesize",noticeList.size());
        req.getRequestDispatcher("/WEB-INF/jsp/admin.jsp")
                .forward(req,resp);
    }


}
