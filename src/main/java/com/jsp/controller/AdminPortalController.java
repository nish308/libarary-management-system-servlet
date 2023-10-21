package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminportal")
public class AdminPortalController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String librariantable = req.getParameter("getlibrarian");
		String admin_delete = req.getParameter("delete");
		String admin_update = req.getParameter("update");
		String librarian_authorize = req.getParameter("authorize");

		if (librariantable != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("librariantable.jsp");
			requestDispatcher.forward(req, resp);

		} else if (admin_delete != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("admindelete.jsp");
			requestDispatcher.forward(req, resp);
		} else if (admin_update != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminupdate.jsp");
			requestDispatcher.forward(req, resp);
		} else if (librarian_authorize != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminauthorizelib.jsp");
			requestDispatcher.forward(req, resp);
		}

	}

}
