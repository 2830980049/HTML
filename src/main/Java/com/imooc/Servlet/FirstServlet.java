package com.imooc.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    //service是请求处理的核心方法，无论是get或post都会被service()方法处理
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getMethod();
        //接受请求发来的参数
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String sex = req.getParameter("sex");
        String[] spec = req.getParameterValues("spec");
        //从服务器向浏览器返回的输出流
        PrintWriter out = resp.getWriter();
        //将HTML发送回浏览器
        out.println("<h1> method:" + method + "</h1>");
        out.println("<h1> name:" + name + "</h1>");
        out.println("<h1> mobile:" + mobile + "</h1>");
        out.println("<h1> mobile:" + sex + "</h1>");
        for(int i = 0; i < spec.length; i++)
            out.println("<h1> spec:" + spec[i] + "</h1>");
    }

}
