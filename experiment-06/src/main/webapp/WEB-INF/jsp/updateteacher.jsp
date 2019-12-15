<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/10/31
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateteacher"  method="post">
    教师名：<input name="name" value="${teacher.name}"><br>
    注册时间：
    <fmt:formatDate value="${teacher.insertDate}" pattern="yyyy-MM-dd HH:mm"/><br>
    职称：
    <select name="title" >
<c:forEach items="${titles}" var="t">
<c:set var="s" value=""/>
    <c:if test="${t.id==teacher.title.id}">
        <c:set var="s" value="selected"/>
    </c:if>
    <option value="${t.id }" ${s }>${t.name }</option>
</c:forEach>
    </select><br>
    授课：
    <ul>
<c:forEach items="${courses }" var="c" varStatus="i">
    <c:set var="checked" value=""/>
    <c:forEach items="${teacher.courses }" var="tc">
        <c:if test="${tc.id == c.id }">
            <c:set var="checked" value="checked"/>
        </c:if>
    </c:forEach>
    <li><label><input type="checkbox" name="courseids" value="${c.id }" ${checked }>${c.name }</label></li>
    </c:forEach>
    </ul>
    <button type="submit">提交</button>
    <button type="reset">重置</button>
</form>
</body>
</html>
