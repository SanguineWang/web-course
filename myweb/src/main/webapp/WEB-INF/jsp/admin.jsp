<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/12/1
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!doctype html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>admin</title>
    <link href="https://cdn.bootcss.com/material-design-icons/3.0.1/iconfont/material-icons.css" rel="stylesheet">
    <script src="../../resources/js/jquery-3.4.1.min.js"></script>
<%--    <script>--%>
<%--        $(function(){--%>
<%--            $("#home").hover(function () {--%>
<%--                $("#home>h2>a>i").css({--%>
<%--                    'transform':'rotate(180deg)',--%>
<%--                    'transition':'0.5s'--%>
<%--                });--%>
<%--                $("#fade").fadeToggle(500);--%>
<%--            },function (){--%>
<%--                $("#home>h2>a>i").css({--%>
<%--                    'transform':'rotate(0)'--%>
<%--                });--%>
<%--                $("#fade").fadeOut(500);--%>
<%--            })--%>
<%--        })--%>

<%--    </script>--%>
    <style>
        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            /*background-color: #0a0583;*/
        }
        i{
            background-color: #03a9f4;
            color: white;
            padding: 6px;
            margin: 6px;
            border-radius: 50%;

        }
        /*.container{*/
        /*    display: flex;*/
        /*}*/
        .navigate{
            list-style-type: none;
            width: 50px;
            height: 100%;
            margin: 0;
            /*background-color: #0a0583;*/
            position: fixed;
            left: 0;
        }
        .content1{
            padding-left: 80px;
            display: grid;
            grid-template-columns: 49% 49%;
            /*text-align: justify;*/
        }
        .navigate li{
            text-align: center;
            color: white;
            padding: 10px 0;
            transition: 0.5s;
        }
        .navigate li:hover{
            transform: translateY(-5px);
        }
        /*表单*/
        /* 抽象全局标签，仅设置大小圆角等基本属性 */
        span.label {
            padding: 0 10px;
            border-radius: 3px;
            color: white;
        }
        /* 成功标签，绿色 */
        span.label-success {
            background: green;
        }
        /* 警告标签，橙色 */
        span.label-warning {
            background: orange;
        }
        /* --------------全局table属性-------------------- */
        table {
            width: 100%;
            border-collapse: collapse;
        }

        table th, table td {
            text-align: center;
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }
        tbody tr:nth-child(odd) {
            background-color: #f2f2f2;
        }

        /* --------------全局超链接按钮------------------ */
        a.btn {
            background-color: #69d6ff;
            color: white;
            padding: 10px 15px;
            text-decoration: none;
            display: inline-block;
            border-radius: 8px;
            margin-top: 5px;
            transition: 0.5s;
        }

        a.btn:hover {
            background-color: rgba(155,214,255,0.8);
        }
        .main2{
            border-left: 5px solid rgb(193, 195, 191);

        }

    </style>

</head>
<body>
<div class="container">
    <ul class="navigate">
        <li> <a href="#" style="color: black; text-decoration: none">
            <i class="material-icons">edit</i>
            管理</a>
        </li>
        <%--        <li><i class="material-icons">ac_unit</i></li>--%>
        <li><a href="/add" style="color: black; text-decoration: none">
            <i class="material-icons">add</i>
            添加</a></li>
        <li><a href="/logout" style="color: black; text-decoration: none">
            <i class="material-icons">flash_off</i>
            退出</a></li>
    </ul>
    <div class="content1">

        <div class="main" >
            <h1>公告</h1>
            <table name="t1">
                <thead>
                <tr>
                    <th>id</th> <th>标题</th><th>时间</th><th>内容</th><th>封面</th><th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${noticelist}" var="u" varStatus="s">
                    <tr>
                        <td>${s.count}</td>
                        <td>${u.title}</td>
                        <td>${u.time}</td>
                        <td>${u.content}</td>
                        <td>a.png</td>
                        <td><a href="/addnews?id=${u.id}&from=notice" class="btn">修改</a>
                            <a href="/delete?id=${u.id}&direct=notice" class="btn">删除</a></td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>

        <div class="main2">
            <h1>新闻</h1>
            <table name="t2">
                <thead>
                <tr>
                    <th>id</th><th>标题</th><th>时间</th><th>内容</th><th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${newslist}" var="b" varStatus="a">
                <tr>
                    <td>${a.count}</td>
                    <td>${b.title}</td>
                    <td>${b.time}</td>
                    <td>${b.content}</td>
                    <td><a href="/addnews?id=${b.id}&from=news" class="btn">修改</a>
                        <a href="/delete?id=${b.id}&direct=news" class="btn">删除</a></td>
                </tr>
                </c:forEach>
                    </tbody>
            </table>
        </div>
    </div>
</div>
</body>

</html>