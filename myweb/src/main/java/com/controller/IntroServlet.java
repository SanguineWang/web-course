package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/intro")
public class IntroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
         String id1="软件工程专业以IT业需求为导向，培养具有良好综合素质和职业道德，掌握扎实的基础理论和专业知识，具有软件分析、设计、开发、测试与管理能力，具备较强工程实践能力、技术创新能力和团队精神，能快速适应软件工程新技术发展并具有国际视野和国际竞争力的高级软件工程师。专业实施灵活的“211”人才培养模式（其中,2年基础教育,1年面向企业的专业教育,1年企业顶岗实习），在教学上着力推动基于问题、基于项目和基于案例的学习，对于实践性强的课程，采取校企联合“双师制”培养，同时以大学生创新实践活动、科技大赛为补充，突出工程化培养。\n" +
                 "\n" +
                 "教师队伍采用专兼结合的用人机制，现有专职教师12人，其中高级职称7人，讲师5人，博士8人，硕士4人，其中6人具有国外留学或访学经历，此外,专业还从国内外知名软件企业、高校聘请兼职教师承担部分教学工作作为补充。专业教师主持或参加了多项国家、省、部、市及学校的纵向、横向科研和教研项目。获得省优秀教育科研成果奖一等奖、省优秀高等教育科学研究成果二等奖、省科技进步二等奖、三等奖、省高等学校优秀多媒体教学软件三等奖、市科技进步一等奖、省高等教育学会十一五规划课题三等奖等奖项。取得发明专利和实用新型专利10余项，软件著作权10余项。专业教师累计主编和参编出版教材13部，发表论文70余篇，其中EI及ISTP检索论文40余篇。\n" +
                 "\n" +
                 "软件工程专业综合实验室，服务于专业的课程实验和创新创业项目，培养学生获得软件项目管理和开发经验，完成系统开发的实习、实训。软件工程专业综合实验室下设软件工程实验室（系统开发实训基地）、嵌入式技术实验室、移动开发实验室和IOS开发实验室。主要完成基于行业标准和技术的Rational统一过程和测试、软件体系结构、面向对象技术与UML、软件需求与分析、软件测试和质量保证、移动开发和IOS开发等课程的实验。同时，依托国家级大型软件企业，建立了校企合作的实习、实训基地。结合企业项目、师资、环境等对学生进行有针对性的工程能力训练，使学生具备综合运用所学知识解决复杂工程问题的能力。\n" +
                 "\n" +
                 "专业目前已经建立了华为、亿阳安全、东软、华信、北京思特奇、博彦集智、江苏乐建、华宇（大连）、青软、微洋科技等实习基地。";
        String id2="目前软件工程专业设有三个方向：软件技术开发、软件工程管理、数字媒体艺术（虚拟现实及游戏软件制作）。在夯实英语、数学、软件基本理论的基础上，通过一系列的特色课程及实践培养同学们的自学能力、团队合作能力、交流沟通表达能力、工程管理组织能力、外语应用能力。学院专业课程的教师大多来自各大软件企业，实施案例式教学，课堂边学边练，边练边学，讲授最新的软件工程专业知识。专设项目实训课程，模拟企业生产开发环境，由企业教师按照企业真实的开发流程组织同学们完成真实的软件项目。除此之外的业界之旅活动，组织参观各大软件企业和研究机构，同学有和两院院士、软件业巨子进行一对一交流的机会。";

        if(id==1){
            req.setAttribute("title","专业简介");
            req.setAttribute("intro",id1);
        }
        else{
            req.setAttribute("title","方向简介");
            req.setAttribute("intro",id2);

        }

        req.getRequestDispatcher("/WEB-INF/jsp/intro.jsp")
                .forward(req,resp);
    }
}
