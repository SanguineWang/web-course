package com.controller;

import com.entity.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@WebServlet("/teacher")
public class TeacherServlet extends HttpServlet {
    private static List<Teacher> teachers;
static {
    Teacher teacher1=new Teacher("教授",1,"周嘉淑","博士，副教授，软件工程专业主任，专业教工党支部书记，硕士生导师。主要研究方向：先进软件工程技术、群智能优化、大型分布式计算。主持和参加国家级、省部级各类科学研究项目、教学研究项目10余项，各级各类科研及教学获奖5项，多次获得东北林业大学教学质量优秀奖、教书育人先进个人，获得东北林业大学青年教师授课大赛二等奖，信息与计算机工程学院教师授课精英赛第一名。获得2016年东北林业大学“我最喜爱的十佳教师”称号。主持重点课程、精品在线课程、线上线下建设课程各1门。拥有专利权3项。在国内外核心期刊及国际学术会议上发表学术论文 10余篇，编写教材3部。美国University of California Riverside访问学者。",4);
    Teacher teacher2=new Teacher("教授",1,"权凝心","硕士，副教授，硕士生导师。主要研究方向：信息系统析与设计、图像处理、软件服务与应用。主持和参加省攻关重点、省自然基金、国家林业公益性行业专项、省教改项目15项，发表论文20余篇，教材3部。",6);
    Teacher teacher3=new Teacher("副教授",2,"溥星津","教授，硕士，硕士生导师，软件工程一级学科带头人，省计算机学会嵌入式专委会委员。主要研究方向：自动控制、信号与信息处理。主持或参加科研、教学项目11项，科研与教学获奖11项，出版教材2部，发表论文32篇。",7);

    Teacher teacher4=new Teacher("副教授",2,"嬴惜玉","博士，副教授，软件工程专业主任，专业教工党支部书记，硕士生导师。主要研究方向：先进软件工程技术、群智能优化、大型分布式计算。主持和参加国家级、省部级各类科学研究项目、教学研究项目10余项，各级各类科研及教学获奖5项，多次获得东北林业大学教学质量优秀奖、教书育人先进个人，获得东北林业大学青年教师授课大赛二等奖，信息与计算机工程学院教师授课精英赛第一名。获得2016年东北林业大学“我最喜爱的十佳教师”称号。主持重点课程、精品在线课程、线上线下建设课程各1门。拥有专利权3项。在国内外核心期刊及国际学术会议上发表学术论文 10余篇，编写教材3部。美国University of California Riverside访问学者。",5);
    Teacher teacher5=new Teacher("讲师",3,"魏震轩","硕士，副教授，硕士生导师。主要研究方向：信息系统析与设计、图像处理、软件服务与应用。主持和参加省攻关重点、省自然基金、国家林业公益性行业专项、省教改项目15项，发表论文20余篇，教材3部。",8);
    Teacher teacher6=new Teacher("讲师",3,"曲星华","教授，硕士，硕士生导师，软件工程一级学科带头人，省计算机学会嵌入式专委会委员。主要研究方向：自动控制、信号与信息处理。主持或参加科研、教学项目11项，科研与教学获奖11项，出版教材2部，发表论文32篇。",9);

    teachers=List.of(teacher1,teacher2,teacher3,teacher4,teacher5,teacher6);
}
public  List<Teacher> getTeacher(int id) {
        return teachers.stream()
                .filter(t -> t.getTitleid() == id)
                .collect(Collectors.toList());
}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("teacherlist",getTeacher(id));
        req.getRequestDispatcher("/WEB-INF/jsp/teacher.jsp")
                .forward(req,resp);
    }
}
