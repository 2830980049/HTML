package com.imooc.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接受请求发来的参数
        String name = req.getParameter("name");
        String html = "<h1 style='color:red'>hi," + name + "!</h1><hr/>";
        //从服务器向浏览器返回的输出流
        PrintWriter out = resp.getWriter();
        //将HTML发送回浏览器
        out.println(html);

    }

}
