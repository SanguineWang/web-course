<%@ page contentType="text/html; charset=UTF-8"%>
<link href="https://cdn.bootcss.com/material-design-icons/3.0.1/iconfont/material-icons.css" rel="stylesheet">
<style>
    *{
        padding: 0;
        margin: 0;
        box-sizing: border-box;
        color: white;
    }
    footer{
        width: 100%;
        position: absolute;
        z-index: 10;
        box-shadow:0 0 0 58px rgba(0,0,0,0.3) inset;
        background: url("/resources/img/footer2-2.jpg") no-repeat ;
        background-size: 100%;
    }
    .copyrights{
        padding: 10px 0;
        border-top: 1px solid rgba(255, 255, 255, 0.4);;
        font-size: 12px;
        margin-left: 20px;
    }
    .txtwrapper{
        display: inline-block;
        font-size: 12px;
        position: relative;
        top:12px;
    }
</style>
<footer>
<div class="copy">
            <div style="display: inline-block     ; background-color: transparent;margin-left: 18px ;padding-bottom: 5px">
                <a class="navbar-brand" href="/index" style="text-decoration: none">
                    <img src="../../resources/img/hui.png" width="50" height="50" alt=".." style=" border-radius: 100%">
                    <img src="../../resources/img/zhunye.png" width="180" height="40" alt="..">
                </a>
            </div>
            <div class="txtwrapper" >

                <i class="material-icons" style="font-size: 14px;position: relative;top: 5px;">email</i> www.nefu.edu.cn <br>
                <i class="material-icons" style="font-size: 14px;position: relative;top: 5px;">location_on</i> 哈尔滨市香坊区东北林业大学
            </div>
            <div class="copyrights">
            版权所有 © 东北林业大学 王子阳
            </div>
</div>
</footer>