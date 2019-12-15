package com.controller;

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

@WebServlet("/notice")
public class NoticeServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Notice> noticeList=userService.getNotice();
        noticeList.forEach(i-> i.setTime(i.getTime().substring(0,10)));

        req.setAttribute("noticelist",noticeList);

        req.getRequestDispatcher("/WEB-INF/jsp/notice.jsp")
                .forward(req,resp);
    }
}
