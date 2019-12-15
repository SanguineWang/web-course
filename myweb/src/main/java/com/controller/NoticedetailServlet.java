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

@WebServlet("/noticedetail")
public class NoticedetailServlet extends HttpServlet {
    private UserService userService = ServiceFactory.getUserService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        Notice notice=userService.idGetNotice(id);
        req.setAttribute("item",notice);
        req.getRequestDispatcher("/WEB-INF/jsp/noticedetail.jsp")
                .forward(req,resp);
    }
}
