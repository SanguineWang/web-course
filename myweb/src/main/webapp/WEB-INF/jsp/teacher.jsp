<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/12/14
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>teacher</title>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    .area {
        padding: 10px;
        border: 1px solid #3185bf;
        background-color: #f1f1f1;
        border-radius: 5px;
    }

    header {
        grid-area: header;
    }

    aside {
        min-width: 200px;
        grid-area: aside;
    }

    article {
        grid-area: article;
    }

    footer {
        grid-area: footer;
    }

    .container {
        display: grid;
        grid-gap: 15px;
        grid-template-columns: 4fr 1fr;
        grid-template-areas: "header header" "article aside" "footer footer";
    }
    /* ----------- 上导航 ---------------- */
    header > nav > ul {
        display: flex;
        background: #333;
        list-style: none;
    }
    header > nav a {
        color: white;
        text-decoration: none;
        display: block;
        padding: 15px 25px;
    }
    header > nav a:hover {
        background-color: #111;
    }
    header > nav .right {
        margin-left: auto;
    }
    /* ------------ 侧边栏 ---------------- */
    aside > div > ul {
        /*display: flex;*/
        /*background: #333;*/
        list-style: none;
    }
    .sidebar {
        background: #f1f1f1;
    }
    .sidebar > h2 {
        background: #333333;
        color: white;
        padding: 10px 20px;
    }
    .sidebar a{
        display: block;
        color: black;
        text-decoration: none;
        padding: 10px 20px;
        transition: transform 0.5s;
    }
    .sidebar a:hover {
        background: #333333;
        color: white;
        transform: scale(1.1);
    }
    /* --------响应式布局 ----------------- */
    @media (max-width: 800px) {
        .container {
            grid-template-columns: 1fr;
            grid-template-areas: "header" "aside" "article" "footer";
        }
    }
    /* 容器 */
    .container2 {
        display: flex;
    }
    /* card容器 */
    .card {
        width: 270px;
        margin: 15px;
        padding: 5px;

    }
    /*  */
    .card .header2 {
        text-align: center;
        transform: translateY(100px);
        transition: transform 0.5s;
        position: relative;
        background:  #f1f1f1;
        z-index: 99;
    }
    /* 圆角加在图片上，因为header容器需要把背景盖住问题内容 */
    .card .header2 img {
        border-radius: 50%;
        opacity: 0.5;
        transition: opacity 0.5s;
    }

    .card .content {

        transform: translateY(-100px);
        opacity: 0.5;
        transition: transform 0.5s, opacity 0.5s;
        text-align: center;
    }
    .card .content p {
        height: 200px;
        overflow: hidden;
    }

    .card .content a {
        display: inline-block;
        padding: 10px 15px;
        /*background: #f44336;*/
        color:  black;
        text-decoration: none;
        border-radius: 5px;
    }

    .card:hover .header2 {
        transform: translateY(0px);
    }
    .card:hover .header2 > img {
        opacity: 1.0;
    }
    .card:hover .content {
        transform: translateY(0px);
        opacity: 1.0;
    }
    .card .content a:hover {
        background: black;
        color: white;
    }
    footer{
        text-align: center;
    }
</style>
<body>
<div class="container">
    <header class="area">
        <nav>
            <ul>
                <li><a href="/index">主页</a></li>
                <li><a href="/notice">公告</a></li>
                <li><a href="/news">新闻</a></li>
                <li><a href="/work">就业指南</a></li>
                <li class="right"><a href="/login">Login</a></li>
            </ul>
        </nav>
    </header>
    <aside class="area">
        <div class="sidebar">
            <h2>专业介绍</h2>
            <ul>
                <li><a href="/intro?id=1">专业简介</a></li>
                <li><a href="/intro?id=2">方向简介</a></li>

            </ul>
        </div>
        <div class="sidebar">
            <h2>教师队伍</h2>
            <ul>
                <li><a href="/teacher?id=1">教授</a></li>
                <li><a href="/teacher?id=2">副教授</a></li>
                <li><a href="/teacher?id=3">讲师</a></li>
            </ul>
        </div>
        <div class="sidebar">
            <h2>实验室</h2>
            <ul>
                <li><a href="/experi?id=923">923实验室</a></li>
                <li><a href="/experi?id=924">923创新实验室</a></li>
                <li><a href="/experi?id=925">925</a></li>
            </ul>
        </div>
    </aside>
    <article class="area">
        <div class="container2">
          <c:forEach items="${teacherlist}" var="t" varStatus="s">

            <div class="card">
                <div class="header2">
                    <img src="https://i.pravatar.cc/250?img=${t.img}+${s.count}" alt="face">
                </div>
                <div class="content">
                    <p>${t.intro}</p>
                    <a href="">${t.name}</a>
                </div>
            </div>
          </c:forEach>

        </div>
    </article>
    <footer class="area">
        东北林业大学<br>
        软件工程专业 2019&copy;
    </footer>
</body>
</html>
