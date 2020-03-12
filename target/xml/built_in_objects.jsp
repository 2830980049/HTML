<%--
  Created by IntelliJ IDEA.
  User: 28309
  Date: 2020/3/12
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String url = request.getRequestURI().toString();
        response.getWriter().println(url);
    %>
    <%
        session.setAttribute("user","苏苏");
        out.println((String)session.getAttribute("user"));
    %>
<%
    //ServletContext
    String cp = application.getInitParameter("copyright");
    out.println("<hr/>");
    out.println(cp);
    pageContext.getRequest();
    pageContext.getResponse();
    pageContext.getSession();
    pageContext.getServletContext();
%>
</body>
</html>
