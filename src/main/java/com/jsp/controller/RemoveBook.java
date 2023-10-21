package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.BookDao;
import com.jsp.service.BookService;

@WebServlet("/removebook")
public class RemoveBook extends HttpServlet {
	BookService bookService = new BookService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String libid = req.getParameter("libid");

		int id = Integer.parseInt(libid);

		BookDao bookDao = new BookDao();
		boolean res = bookDao.deleteData(id);
		if (res == true) {
			out.println("<h3>Book deleted successfully</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarianportal.jsp");
			requestDispatcher.include(req, resp);

		} else {
			out.println("<h3>Not deleted successfully!!!</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("removebook.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}
