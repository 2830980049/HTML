<%--
  Created by IntelliJ IDEA.
  User: 28309
  Date: 2020/3/13
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>姓名：${requestScope.student.name}</h1>
    <h2>手机：${requestScope.student.mobile}</h2>
    <h2>年龄：${sessionScope.age}</h2>
    <h2>讲师：${param.teacher}</h2>
    <h2>评级：${requestScope.grade}</h2>
</body>
</html>
