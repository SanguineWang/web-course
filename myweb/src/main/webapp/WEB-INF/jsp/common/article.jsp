<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/12/3
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<link href="https://cdn.bootcss.com/material-design-icons/3.0.1/iconfont/material-icons.css" rel="stylesheet">
<%@ page contentType="text/html; charset=UTF-8"%>
<style>
    *{
        padding: 0;
        margin: 0;
        box-sizing: border-box;
    }
    article{
        /*background-color: #ab24ff;*/
        background: url("/resources/img/footer2.jpg") no-repeat;
        background-size: 100% 100%;
        padding:0 30px;
      }
    .mycontent{
        background-color: rgba(0,0,0,0.5);
       /*background-color: white ;*/
    }
    .divnews{
        display: grid;
        grid-template-columns: 32% 32% 32%;
        grid-gap: 1%;
    }
    .onenews{
        display: grid;
        grid-template-columns: 50% 50%;
        background-color: rgba(0,0,0,0.5);
        padding: 10px;
        border-radius: 10px;
        transition: 0.8s;
    }
    .notices{
        /*background-color: rgba(0,0,0,0.3);*/
        display: grid;
        grid-template-columns: 30% 30% 30%;
        grid-gap: 3%;
    }
    .noticecard{
        text-align: center;
        display: grid;
        grid-template-columns: 27% 70%;
        grid-gap: 3%;
        transition: 0.5s;
    }
    .noticecard:hover{
        opacity: 0.8;
    }
    .notice-a{
        border-left: 1px solid rgba(255, 255, 255, 0.3);
    }
    .notice-a:hover{
        text-decoration: none;
        /*box-shadow: 0  5px black;*/
    }
    .mybtn{
        text-align: center;
        text-decoration: none;
        color: white;
        font-size: 18px;
        padding: 20px;
        border: white;
    }
    p{
        margin: 0;
    }
    .header2 img{
     border-radius: 8px;
        opacity: 0.6;
        transition: 0.8s;
    }
    .content >a{
        display: inline-block;
        /*border:1px black;*/

        color: white;
        text-decoration: none;
        border-radius: 5px;
    }
    .onenews:hover{
        box-shadow:2px 5px 5px rgba(155, 155, 155, 0.8);
    }
    .onenews:hover .header2 > img{
        opacity: 1.0;
    }
    .onenews:hover .header2 .hide1{
        transform: rotate(360deg);
        transition: 0.8s;
    }
    .header2 div{
        display: inline-block;
        background-color: black;
        border-radius: 10px;
        padding: 5px;
        margin: 5px 0;
    }
    .header2 div>i{
       font-size: 18px;

        /*padding-top: 5px;*/
   }

</style>
<article >
<div class="mycontent">
    <div class="notice">
    <h2 style="text-align: center;padding-bottom: 40px">
    <b></b>
        <br>
       —— 公告 ——
    <b></b>
    </h2>
    <div class="notices">
     <c:forEach items="${noticelist}" var="u">
        <a href="/noticedetail?id=${u.id}" class="notice-a">
        <div class="noticecard">
            <div  class="time">
            <h2>14</h2>
            <p5>${u.time}</p5>
            </div>
            <div  class="txtwraper">
                <h5>${u.title}</h5>
                <p style="font-size: 14px">${u.content}</p>
            </div>
        </div>
        </a>
     </c:forEach>
     </div>
        <a href="/notice" class="mybtn">
            <h5>更多公告</h5></a>
    </div>

    <div class="news">
        <h2 style="text-align: center;padding: 40px 0;margin: 0;">
            <b></b>
            —— 新闻 ——
            <b></b>
        </h2>
        <div class="divnews">
<%--      <c:forEach>--%>
    <c:forEach items="${newslist}" var="n">
      <div class="onenews">
           <a href="/newsdetail?id=${n.id}">
             <div class="header2">
                 <img src="/resources/img/footer3.jpg" alt="..." style="width: 200px;height: 200px;">
                <div class="hide1"><i class="material-icons">remove_red_eye</i>
                    <span >2000</span>
                </div>
                <div class="hide1"><i class="material-icons">favorite_border</i>
                    <span>100</span>
                </div>
                <div class="hide1"><i class="material-icons">comment</i>
                    <span>20</span></div>
             </div>
           <div class="content">
               <p>${n.title}</p>
               <br>
               <a href="" style="font-size: 14px">${n.content}</a>
           </div>
           </a>
        </div>
    </c:forEach>

     </div>
    </div>

    <h2 style="text-align: center;padding: 40px 0;margin: 0;">
        <br>
        <a href="/news" class="mybtn">
            <h5>更多新闻</h5></a>
    </h2>
</div>

</article>
<script src="/resources/js/jquery-3.4.1.min.js"></script>
