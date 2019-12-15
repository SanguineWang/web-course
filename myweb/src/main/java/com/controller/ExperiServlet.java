package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/experi")
public class ExperiServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String id1="923创新实验室";
        String id2="923实验室";
        String id3="925移动开发实验室";
        if(id==923){
            req.setAttribute("title","923创新实验室");
            req.setAttribute("intro",id1);
        }
        if (id == 924){
            req.setAttribute("title","923实验室");
            req.setAttribute("intro",id2);

        }
        if( id==925){
            req.setAttribute("title","925移动开发实验室");
            req.setAttribute("intro",id3);
        }
        req.getRequestDispatcher("/WEB-INF/jsp/experi.jsp")
                .forward(req,resp);
    }
}
