package com.imooc.Servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestMethod extends HttpServlet {
    //处理Get请求
    public void doGet(HttpServletRequest  request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        response.getWriter().println("<h1 style='color:red'> name:" + name + "</h1>");
    }
    //处理Post请求
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        response.getWriter().println("<h1 style='color:green'> name:" + name + "</h1>");
    }

}
