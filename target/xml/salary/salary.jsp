<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 28309
  Date: 2020/3/8
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>year</th>
            <th>salary</th>
        </tr>
        <%
            for(int i = 0; i <= 50; i++){
                out.println("<tr>");
                out.println("<td>" + i + "</td>");
                int money = 0;
                if(i <= 5)
                    money = 1500 + i * 150;
                    else if(i > 5 && i <= 10)
                        money = 1500 + 150 * 5 + 300 * (i-5);
                        else
                            money = 1500 + 150 * 5 + 375 * (i-10);
                out.println("<td>"+money+"</td>");
                out.println("</tr>");
            }
        %>
    </table>


    <%
        int sum = 0;
        for(int i = 0; i <= 100; i++)
            sum += i;
    %>


   <%= sum%>


    <%!
        boolean isPrime(int num){
            boolean flag = true;
            for(int j = 2; j <= Math.sqrt(num); j++){
                if(num % j == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    %>

<%
    List<Integer> a = new ArrayList();
    for(int i = 2; i <= 1000; i++){
        if(isPrime(i))
            a.add(i);
    }
%>

<%
    for(Integer p : a){
        //out.println("<h1>" + p + "是质数</h1>");
%>
    <h1><%=p%>是质数</h1>
<%
    }
%>

</body>
</html>
