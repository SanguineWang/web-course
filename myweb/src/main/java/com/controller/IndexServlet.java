package com.controller;

import com.entity.News;
import com.entity.Notice;
import com.service.ServiceFactory;
import com.service.UserService;
import org.apache.taglibs.standard.tag.common.core.ForEachSupport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<News> newsList= userService.getNews().stream().limit(5).collect(Collectors.toList());
        List<Notice> noticeList=userService.getNotice().stream().limit(3).collect(Collectors.toList());
//        newsList.forEach(i-> i.setContent(i.getContent().substring(0,20)+"..."));
        for (News i : newsList) {
            if(i.getContent().length()>20){
                i.setContent(i.getContent().substring(0,40)+"...");
            }

        };
        for (Notice i : noticeList) {
            if(i.getContent().length()>80){
                i.setContent(i.getContent().substring(0,80)+"...");
            }
        };
        noticeList.forEach(i-> i.setTime(i.getTime().substring(0,7)));
//        noticeList.forEach(i-> i.setContent(i.getContent().substring(0,80)+"..."));
        req.setAttribute("newslist",newsList);
        req.setAttribute("noticelist",noticeList);
        req.getRequestDispatcher("/WEB-INF/jsp/index.jsp")
                .forward(req,resp);
    }
}
