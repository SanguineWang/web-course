package com.fliter;

import com.entity.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

//拦截全部
@WebFilter("/*")
public class LoginFliter extends HttpFilter {
    private static final Logger LOGGER=Logger.getLogger(LoginFliter.class.getName());
    private List<String> excepts=List.of("/login");

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        for (String i : excepts){
            if (i.equals(req.getServletPath())){
                //过滤掉当前路径到下一个过滤器
                LOGGER.info("路径过滤开始");
                chain.doFilter(req,res);
                LOGGER.info("路径过滤结束");
                return;
            }
        }
        User user=(User)req.getSession().getAttribute("name");
        if(user!=null){
            LOGGER.info("session过滤开始");
            chain.doFilter(req,res);
            LOGGER.info("session过滤开始");
        }else {
            res.sendRedirect("/login");
        }
    }
}
