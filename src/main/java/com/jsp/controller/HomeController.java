package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String admin = req.getParameter("admin");
		String librarian = req.getParameter("librarian");
		String student = req.getParameter("student");

		if (admin != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.forward(req, resp);
		} else if (librarian != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarianlogin.jsp");
			requestDispatcher.forward(req, resp);
		} else if (student != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("studentlogin.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
