<%--
  Created by IntelliJ IDEA.
  User: zlt
  Date: 2021/12/28
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>requestForward</title>
</head>
<body>
<% String language= (String) request.getAttribute("key"); %>
语言为:<%=language%>

</body>
</html>
