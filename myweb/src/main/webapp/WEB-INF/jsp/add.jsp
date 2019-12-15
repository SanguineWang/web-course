<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/12/13
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
    <link href="https://cdn.bootcss.com/material-design-icons/3.0.1/iconfont/material-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <style>
        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            /*background-color: #0a0583;*/
        }
        i{
            background-color: #0d0004;
            color: white;
            padding: 6px;
            margin: 6px;
            border-radius: 50%;

        }
        .container{
            display: flex;
        }
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
            padding-left: 100px;
            text-align: justify;
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
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table th, table td {
            text-align: center;
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }
       .content1{
           display: grid;
           grid-template-columns: 50% 50%;
           grid-gap: 20%;
        }
        .btn{
            background-color: #1c1c1c;
            color: white;
        transition: 0.8s;
        }
        .btn:hover{
            opacity: 0.4;
            color: white;
        }
    </style>
</head>
<body>
<div class="container">
    <ul class="navigate">
        <li> <a href="/admin" style="color: black; text-decoration: none">
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

        <form action="/add" name="form2" id="f2" method="post">
            <h2>AddNotice</h2>
            <table>
                <tr>
                    <input type="text"  name="direction" value="Notice" style="display: none">
                </tr>
                <tr>
                    <%--                    <th>id</th>--%>
                    <th>标题</th> <td><input name="title" class="form-control" type="text" placeholder="请输入标题" value="${news.title}"></td>
                </tr>
                <tr>
                    <th>内容</th>

                    <td><textarea rows="10" cols="30" name="content" placeholder="至少输入40字"></textarea></td>

                </tr>
                <tr>
                    <th></th>  <td> <a href="#" class="btn" onclick="document.getElementById('f2').submit();return false;">提交</a></td>
                </tr>

            </table>
        </form>
        <form action="/add" name="form1" id="f1" method="post">
            <h2>AddNews</h2>
            <table>
                <tr>
                    <input type="text"  name="direction" value="news" style="display: none">
                </tr>
                <tr>
                    <%--                    <th>id</th>--%>
                    <th>标题</th> <td><input name="title" class="form-control" type="text" placeholder="请输入标题" value="${news.title}"></td>
                </tr>
                <tr>
                    <th>内容</th>

                    <td><textarea rows="10" cols="30" name="content" placeholder="至少输入40字"></textarea></td>

                </tr>
                <tr>
                    <th>封面</th>  <td>a.jpg</td>
                </tr>
                <tr>
                    <th></th>  <td><a href="#" class="btn" onclick="document.getElementById('f1').submit();return false;">提交</a></td>
                </tr>

            </table>
        </form>

    </div>
</div>
</body>
</html>
