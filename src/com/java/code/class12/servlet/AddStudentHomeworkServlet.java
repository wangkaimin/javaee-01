package com.java.code.class12.servlet;

import com.java.code.class12.jdbc.StudentHomeworkJdbc;
import com.java.code.class12.model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * AddStudentHomeworkServlet
 *
 * @author wangkm
 * @date 2020-03-05
 * @since 0.0.1
 */
@WebServlet("/add")
public class AddStudentHomeworkServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StudentHomework sh = new StudentHomework();
        /**
         * 赋值
         */
        sh.setStudentId(Long.valueOf(req.getParameter("student_id")));
        StudentHomeworkJdbc.addStudentHomework(sh);

        resp.sendRedirect("list");
    }
}
