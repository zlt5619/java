<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zlt
  Date: 2021/12/28
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="true">
        执行了。。。
    </c:if>
    <c:choose>
        <c:when test="${1==1}">
            when1执行了
        </c:when>
        <c:when test="${1==1}">
            when2执行了
        </c:when>
        <c:otherwise>
            otherwise执行了
        </c:otherwise>
    </c:choose>
    <hr/>
<c:forEach begin="0" end="9" step="2" varStatus="var">
    foreach ...${var.count}<br/>
</c:forEach>



</body>
</html>
