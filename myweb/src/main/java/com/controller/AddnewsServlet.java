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

@WebServlet("/addnews")
public class AddnewsServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> newsList= userService.getNews();
        List<Notice> noticeList=userService.getNotice();
        int id = Integer.parseInt(req.getParameter("id"));
        News news=userService.idGetNews(id);
        Notice notice=userService.idGetNotice(id);
        String from =req.getParameter("from");
        req.setAttribute("from",from);

        if (from.equals("news")){
            req.setAttribute("form",news);

        }
        else {
            req.setAttribute("form",notice);
        }


        req.getRequestDispatcher("/WEB-INF/jsp/addnews.jsp")
                .forward(req,resp);
    }

}
