<%--
  Created by IntelliJ IDEA.
  User: Mr.wang
  Date: 2019/10/31
  Time: 16:54
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
<table>
  <tr>
      <td>#</td>
      <td>姓名</td>
      <td>注册时间</td>
  </tr>
       <c:forEach items="${teachers}" var="u" varStatus="s">
         <tr>
              <td>${s.count}</td>
              <td><a href="/updateteacher?tid=${u.id}">${u.name}</a></td>
              <td><fmt:formatDate value="${u.insertDate}" pattern="yyyy-MM-dd HH:mm"/></td>
        </tr>
      </c:forEach>
</table>
</body>
</html>
