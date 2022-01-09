<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zlt
  Date: 2021/12/28
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>showusers</title>
</head>
<body>
<table border="1" align="center">
  <tr>
    <th>用户ID</th>
    <th>用户名</th>
  </tr>
  <c:forEach items="${requestScope.list}" var="user">
    <tr>
      <th>${user.userid}</th>
      <th>${user.username}</th>
    </tr>

  </c:forEach>

</table>

</body>
</html>
