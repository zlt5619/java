<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: zlt
  Date: 2021/12/28
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>formatdate</title>
</head>
<body>
<fmt:formatDate value="${date}" pattern="yyyy-MM-dd"/>
<fmt:formatNumber value="${money}" type="currency"/>

</body>
</html>
