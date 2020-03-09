package com.imooc.Servlet_advanced;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cs")
public class ContentTyoe_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String output = "<a href='http://www.baidu.com'>百度</a>";
        resp.setContentType("application/x-msdownload;charset=utf-8");
        resp.getWriter().println(output);
    }
}
