<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/11/27
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0,shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <title>register</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
       *{
           box-sizing: border-box;
       }
        body{
            display: flex;
            /*padding-top: 40px;*/
            background-color: #f5f5f5   ;
            background-size: 100% 100%;
        }
        form{
            border-radius: 15px;
            background-color: white;
            margin: auto;
            text-align: center;
            padding: 50px 100px;
            transition: 0.5s;
        }
        form:hover{
            box-shadow: 2px 5px 5px rgba(155, 155, 155, 0.8);
        }
        .form-control{
            margin-left: 30px;
            padding-right: 30px;
        }
    </style>
</head>
<body>
<form>
    <h2>注册</h2><br>
    <div class="form-group row">
        <label for="inputEmail3" class="col-sm-2 col-form-label" style="padding:6px 12px;margin: 0">Email</label>
        <div class="col-sm-10">
            <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
        </div>
    </div>
    <div class="form-group row">
        <label for="inputPassword3" class="col-sm-2 col-form-label" style="padding:6px 12px;margin:0">Password</label>
        <div class="col-sm-10" style="">
            <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
        </div>
    </div>
<%--    <fieldset class="form-group">--%>
<%--        <div class="row">--%>
<%--            <legend class="col-form-label col-sm-2 pt-0">Radios</legend>--%>
<%--            <div class="col-sm-10">--%>
<%--                <div class="form-check">--%>
<%--                    <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios1" value="option1" checked>--%>
<%--                    <label class="form-check-label" for="gridRadios1">--%>
<%--                        First radio--%>
<%--                    </label>--%>
<%--                </div>--%>
<%--                <div class="form-check">--%>
<%--                    <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios2" value="option2">--%>
<%--                    <label class="form-check-label" for="gridRadios2">--%>
<%--                        Second radio--%>
<%--                    </label>--%>
<%--                </div>--%>
<%--                <div class="form-check disabled">--%>
<%--                    <input class="form-check-input" type="radio" name="gridRadios" id="gridRadios3" value="option3" disabled>--%>
<%--                    <label class="form-check-label" for="gridRadios3">--%>
<%--                        Third disabled radio--%>
<%--                    </label>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </fieldset>--%>
    <div class="form-group row">

        <div class="col-sm-2">Checkbox</div>
        <div class="col-sm-10">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="gridCheck1">
                <label class="form-check-label" for="gridCheck1">
                    Example checkbox
                </label>
            </div>
        </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-10">
            <button type="submit" class="btn btn-primary">Register</button>
        </div>
    </div>
</form>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.15.0/umd/popper.min.js" integrity="sha384-L2pyEeut/H3mtgCBaUNw7KWzp5n9+4pDQiExs933/5QfaTh8YStYFFkOzSoXjlTb" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>
