package com.controller;

import com.entity.News;
import com.entity.Notice;
import com.service.ServiceFactory;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.border.TitledBorder;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
    private static Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    private UserService userService = ServiceFactory.getUserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String direct=req.getParameter("from");
//        String id2= req.getParameter("id");
//        logger.info(req.getParameter("id"));
        int id =Integer.parseInt(req.getParameter("id"));
        String title=req.getParameter("title");
        String content =req.getParameter("content");

        if (direct.equals("notice")){
            Notice notice=new Notice(id,title,content);
            userService.updateNotice(notice);
        }
        else {
            News news =new News(id,title,content);
            userService.updateNews(news);
        }
        resp.sendRedirect("/admin");
    }
}
