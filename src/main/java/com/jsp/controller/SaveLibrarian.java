package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Librarian;
import com.jsp.service.LibrarianService;

@WebServlet("/libregistration")
public class SaveLibrarian extends HttpServlet {
	LibrarianService librarianService = new LibrarianService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String libname = req.getParameter("nameofuser");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		Librarian librarian = new Librarian();
		librarian.setName(libname);
		librarian.setUsername(email);
		librarian.setPassword(pass);
		librarian.setStatus("authorized");

		Librarian librarian1 = librarianService.saveLibrarian(librarian);
		if (librarian1 != null) {
			out.println("<h3>Librarian SignUp successfully!!1</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarianlogin.jsp");
			requestDispatcher.include(req, resp);
		} else {
			out.println("<h3>SignUp failed!!1</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("libregistration.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
