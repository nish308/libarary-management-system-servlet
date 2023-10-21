package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.StudentService;

@WebServlet("/studentlogin")
public class StudentLogin extends HttpServlet {
	StudentService studentService = new StudentService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("studentemail");
		String password = req.getParameter("studentpassword");

		boolean res = studentService.loginStudent(username, password);
		if (res == true) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentportal.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentlogin.jsp");
			requestDispatcher.forward(req, resp);
		}

	}

}
