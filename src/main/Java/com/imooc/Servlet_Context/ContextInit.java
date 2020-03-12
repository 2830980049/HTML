package com.imooc.Servlet_Context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ContextInit")
public class ContextInit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        String copyright = context.getInitParameter("copyright");
        String title = context.getInitParameter("title");
        context.setAttribute("copyright",copyright);
        context.setAttribute("title",title);
        resp.getWriter().println("init success");
    }
}
