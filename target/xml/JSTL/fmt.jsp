<%--
  Created by IntelliJ IDEA.
  User: 28309
  Date: 2020/3/13
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("amt",54151215.214);
        request.setAttribute("now",new  java.util.Date());
        request.setAttribute("html","<a href = 'index.html'>index</a>");
        request.setAttribute("nothing",null);
    %>

    <h2>${now}</h2>
    <!--
        formatDate pattern
        yyyy - 4位年
        MM   - 2位月
        dd   - 2位日
        HH   - 24小时制
        hh   - 12小时制
        mm   - 分钟
        ss   - 秒数
        SSS  - 毫秒
    -->
    <h2>
        <fmt:formatDate value="${requestScope.now}" pattern="yyyy年MM月dd日HH时mm分ss秒SSS毫秒"/>
    </h2>

    <h2>${amt}</h2>
<h2>
    <fmt:formatNumber value="${amt}" pattern="0.00"/>
</h2>
    <h2>￥<fmt:formatNumber value="${amt}" pattern="0,000.00"/>元</h2>
    <h2>￥<fmt:formatNumber value="${amt}" pattern="0,00.00"/>元</h2>
    <h2>null默认值：<c:out value="${nothing}" default="无"></c:out></h2>

    <h2> <c:out value="${html}" escapeXml="true"></c:out></h2>

</body>
</html>
