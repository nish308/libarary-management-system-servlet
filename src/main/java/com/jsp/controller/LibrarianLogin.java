package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.service.LibrarianService;

@WebServlet("/liblogin")
public class LibrarianLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String libname = req.getParameter("email");
		String libpass = req.getParameter("password");

		LibrarianService librarianService = new LibrarianService();
		boolean res = librarianService.loginLibrarian(libname, libpass);

		if (res == true) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("sessionname", libname);
			httpSession.setAttribute("sessionpassword",libpass);
	
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarianportal.jsp");
			requestDispatcher.include(req, resp);
		} else {
			out.println("<h3>Invalid LogIn</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarianlogin.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
