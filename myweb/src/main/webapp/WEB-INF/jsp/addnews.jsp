<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/12/12
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addnews</title>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>admin</title>
    <link href="https://cdn.bootcss.com/material-design-icons/3.0.1/iconfont/material-icons.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="../../resources/js/jquery-3.4.1.min.js"></script>
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
            width: 100%;
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
        .btn{
            background-color: #1c1c1c;
            color: white;
            transition: 0.8s;
        }
        .btn:hover{
            opacity: 0.4;
            color: white;
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
        textarea{
            width: 100%;
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
      <form action="/update"  id="f1" method="post">
          <h2>Update</h2>
          <table>
             <tr>
                 <input type="text" name="from" value="${from}" style="display: none">
                 <input type="text" name="id" value="${form.id}" style="display: none">

             ${from}
              </tr>
              <tr>
                  <%--                    <th>id</th>--%>
                  <th>标题</th> <td><input name="title" class="form-control" type="text" placeholder="请输入标题" value="${form.title}"></td>
              </tr>
              <tr>
                  <th>内容</th>

                  <td><textarea rows="10"  name="content">${form.content}</textarea></td>

              </tr>
              <tr>
               <c:if test="${from=='news'}">
                   <th>封面</th>  <td>a.jpg</td>
               </c:if>
              </tr>
              <tr>
                  <th> </th>  <td><a href="#" class="btn" onclick="document.getElementById('f1').submit();return false;">提交</a></td>
              </tr>

          </table>
      </form>


  </div>
</div>
</body>
</html>
