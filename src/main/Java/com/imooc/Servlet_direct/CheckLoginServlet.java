package com.imooc.Servlet_direct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("登录成功！");
        req.setAttribute("username","admin");
        /*
        跳转 请求转发
        req.getRequestDispatcher("/IndexServlet").forward(req,resp);
        */
        //响应重定向需要增加contextPath即工程名
        resp.sendRedirect("/IDEA_File_war/IndexServlet");
    }
}
