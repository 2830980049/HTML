package com.imooc.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/unused",loadOnStartup = 0)
public class load_servlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("正在创建数据库");
    }
}
