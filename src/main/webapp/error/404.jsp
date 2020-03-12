<%--
  Created by IntelliJ IDEA.
  User: 28309
  Date: 2020/3/12
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>资源不存在</h1>
    <%
        String msg = exception.getMessage();
        out.println("<br>" + exception.getClass().getSimpleName() + msg);
    %>
</body>
</html>
