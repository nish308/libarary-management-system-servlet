package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.LibrarianService;

@WebServlet("/updatelib")
public class LibrarianUpdate extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("libid");
		String pass = req.getParameter("newpass");

		int lid = Integer.parseInt(id);

		LibrarianService librarianService = new LibrarianService();
		librarianService.updateLibrarian(lid, pass);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarianportal.jsp");
	}

}
