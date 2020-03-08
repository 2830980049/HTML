<%--
  Created by IntelliJ IDEA.
  User: 28309
  Date: 2020/3/4
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学员信息登记表</h1>
<form action="http://localhost:8080/IDEA_File_war/method's" method="get">
    姓名：<input name="name">
    </br>
    电话：<input name="mobile"><br>
    性别：<select name="sex" style="width: 100px;padding: 5px">
    <option value="male">男</option>
    <option value="female">女</option>
</select></br>
    特长：
    <input type="checkbox" name="spec" value="English">英语
    <input type="checkbox" name="spec" value="Program">编程
    <input type="checkbox" name="spec" value="Speech">演讲
    <input type="checkbox" name="spec" value="Swimming">游泳
    </br>
    <input type="submit" value="提交">
    </br>
</form>
</body>
</html>
