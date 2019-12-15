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

@WebServlet("/add")
public class AddSevlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> newsList= userService.getNews();
        List<Notice> noticeList=userService.getNotice();
        req.setAttribute("newssize",newsList.size());
        req.setAttribute("noticesize",noticeList.size());
        req.getRequestDispatcher("/WEB-INF/jsp/add.jsp")
                .forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> newsList= userService.getNews();
        List<Notice> noticeList=userService.getNotice();
        int  newsize =  newsList.size();
        int  noticesize = noticeList.size();
         String  direction=null;
         direction=req.getParameter("direction");
         String title =req.getParameter("title");
         String content=req.getParameter("content");
         if(direction.equals("news")){
             News news=new News( 0,title,content);
             userService.addNews(news);
         }
         else {
             Notice notice = new Notice(title,content);
             userService.addNotice(notice);
         }
         resp.sendRedirect("/add");
    }
}
