<%@ page import="java.util.Random" %>
<%--
  Created by IntelliJ IDEA.
  User: zlt
  Date: 2021/12/28
  Time: 8:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lottery</title>
</head>
<body>
    <%
        int flag=new Random().nextInt(100);
        if(flag<=20){


    %>
    中奖了   <%= flag%>
    <%
        }else{
    %>
    再试试吧  <%= flag%>
    <%
        }
    %>
</body>
</html>
