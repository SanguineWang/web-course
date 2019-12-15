<%@ page contentType="text/html; charset=UTF-8"%>
<script src="../../resources/js/jquery-3.4.1.min.js"></script>
<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    header{
        width: 100%;
        position: fixed;
        z-index: 10;
        /*background-color: rgba(0,0,0,0.3);*/
        box-shadow:0 0 0 200px rgba(0,0,0,0.2) inset;
    }
    .logo{
        position: relative;
        float: left;
        margin-right: 400px;
        top: 20px;
        left: 20px;
        /*background-color: rgba(0,0,0,0.2);*/
    }
    .navbar-nav{
        margin: 0;
    }
    .nav-link{
        color: white;
        padding-bottom: 15px;
    }
    .nav-link:hover{
        opacity: 0.8;
        color: white;

    }
    .nav-item{
        padding-top: 60px;
        padding-left: 30px;

    }
    .lisli{
        list-style: none;
        /*display: none;*/
        /*background-color: white;*/
        display: none;
    }
    .lisli li{
        /*padding-top: 12px;*/
        text-align: center;
        height: 35px;
    }
    .lisli a{
        text-decoration: none;
        color: white;
    }
</style>
<script>
 $(function () {
     $("#li11").hover(
        function(){ $("#li1").show()
        },
         function(){$("#li1").hide()
         }
         )
 });
 $(function () {
     $("#li22").hover(
         function(){ $("#li2").show()
         },
         function(){$("#li2").hide()
         }
     )
 });
 $(function () {
     $("#li33").hover(
         function(){ $("#li3").show()
         },
         function(){$("#li3").hide()
         }
     )
 })
</script>
<header>
<%--    公告,新闻，专业介绍，教师队伍，实验室，就业指南--%>
    <nav class="navbar navbar-expand-lg" style="width: 100% ;padding: 0;">
        <div class="collapse navbar-collapse" id="navbarSupportedContent" >
            <ul class="navbar-nav" >
                <li class="logo">
                    <a class="navbar-brand" href="/index">
                        <img src="../../resources/img/hui.png" width="60" height="60" alt=".." style=" border-radius: 100%">
                        <img src="../../resources/img/zhunye.png" width="200" height="40" alt="..">
                    </a>
                </li>
                <li class="nav-item ">
                    <a class="nav-link" href="/notice">公告</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/news">新闻</a>
                </li>
                <li class="nav-item" id="li11">
                    <a class="nav-link" href="/intro?id=1">专业介绍</a>
                    <ul class="lisli" id="li1">
                        <li><a href="/intro?id=1" >专业简介</a></li>
                        <li><a href="/intro?id=2" >方向简介</a></li>
                    </ul>
                </li>
                <li class="nav-item" id="li22">
                    <a class="nav-link" href="/teacher">教师队伍</a>
                    <ul class="lisli" id="li2">
                        <li><a href="/teacher?id=1" >教授</a></li>
                        <li><a href="/teacher?id=2" >副教授</a></li>
                        <li><a href="/teacher?id=3" >讲师</a></li>
                    </ul>
                </li>
                <li class="nav-item" id="li33">
                    <a class="nav-link" href="/experi?id=923">实验室</a>
                        <ul class="lisli" id="li3">
                            <li><a href="/experi?id=923" >923</a></li>
                            <li><a href="/experi?id=924" >924</a></li>
                            <li><a href="/experi?id=925" >925</a></li>
                        </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/work">就业指南</a>
                </li>

                <li class="nav-item">
                    <button type="button" onclick="window.location.href='/login'" class="btn btn-outline-light" style="right: 0">登录</button>
                </li>
            </ul>

        </div>
    </nav>
</header>