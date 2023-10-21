package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/libportal")
public class LibrarianController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String addbook = req.getParameter("addbook");
		String removebook = req.getParameter("removebook");
		String listofbook = req.getParameter("listbook");
		String listofstudent = req.getParameter("liststudent");
		String allhistory = req.getParameter("history");

		if (addbook != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("addbook.jsp");
			requestDispatcher.forward(req, resp);
		} else if (listofbook != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("listbook.jsp");
			requestDispatcher.forward(req, resp);

		} else if (removebook != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("removebook.jsp");
			requestDispatcher.forward(req, resp);
		} else if (listofstudent != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("liststudent.jsp");
			requestDispatcher.forward(req, resp);

		} else if (allhistory != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("historytable.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
