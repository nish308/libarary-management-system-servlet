package com.jsp.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.BookHistoryDao;
import com.jsp.dto.Book;
import com.jsp.dto.BookHistory;
import com.jsp.service.LibrarianService;

@WebServlet("/issue")
public class IssueBook extends HttpServlet {
	LibrarianService librarianService = new LibrarianService();
	BookHistory bookHistory = new BookHistory();
	BookHistoryDao bookHistoryDao = new BookHistoryDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int bookid = Integer.parseInt(req.getParameter("bid"));
		int libid = Integer.parseInt(req.getParameter("lid"));
		int studentid = Integer.parseInt(req.getParameter("sid"));

		Book book = librarianService.issueBookById(bookid, libid, studentid);
		if (book != null) {
			bookHistory.setBook_id(bookid);
			bookHistory.setLibrarian_id(libid);
			bookHistory.setStudent_id(studentid);
			bookHistory.setIssueDate(LocalDate.now());
			bookHistoryDao.issueBook(bookHistory);
		}
		if (book != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("librarianportal.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
