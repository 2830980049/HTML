package com.imooc.EL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Student_Servlet")
public class Student_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String teacher = req.getParameter("teacher");
        Student stu = new Student();
        stu.setName("苏苏");
        stu.setMobile(null);
        String grade = "A";
        HttpSession session = req.getSession();
        session.setAttribute("age","20");
        req.setAttribute("student",stu);
        req.setAttribute("grade",grade);
        req.getRequestDispatcher("/student/info.jsp").forward(req,resp);
    }
}
