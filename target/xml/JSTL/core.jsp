<%--
  Created by IntelliJ IDEA.
  User: 28309
  Date: 2020/3/13
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>${requestScope.score}</h1>
    <c:if test = "${score >= 60}">
        <h1 style="color: green">恭喜你，通过！</h1>
    </c:if>
    <c:if test = "${score < 60}">
        <h1 style="color: red">未通过</h1>
    </c:if>
    <c:choose>
        <c:when test="${grade == 'A'}">Good</c:when>
        <c:when test="${grade == 'B'}">common</c:when>
        <c:when test="${grade == 'C'}">No</c:when>
        <c:otherwise>No No</c:otherwise>
    </c:choose>

    <!--
     forEach 用于遍历集合
     List companies =  (List)request.getAttribute("companies");
     for(Company c : companies)
        out.print();
     -->
    <c:forEach items="${requestScope.companies}" var = "c" varStatus="idx">
        <h2>${idx.index+1}:${c.cname}-${c.url}</h2>
    </c:forEach>

</body>
</html>
