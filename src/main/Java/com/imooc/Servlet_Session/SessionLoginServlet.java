package com.imooc.Servlet_Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

    @WebServlet("/SessionLoginServlet")
    public class SessionLoginServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("用户登录成功！");
            //获取到用户会话Session对象
            HttpSession session = req.getSession();
            session.setAttribute("name","张3");
            req.getRequestDispatcher("/SessionIndexSession").forward(req,resp);
        }
    }
