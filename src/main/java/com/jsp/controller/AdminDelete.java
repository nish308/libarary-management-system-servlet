package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dao.AdminDao;
import com.jsp.service.AdminService;

@WebServlet("/admindelete")
public class AdminDelete extends HttpServlet {

	AdminService adminService = new AdminService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String admin_id = req.getParameter("admin_id");

		int a = Integer.parseInt(admin_id);

		AdminDao adminDao = new AdminDao();
		boolean res = adminDao.deleteAdmin(a);

		if (res == true) {

			out.println("<h3>Admin account deleted successfully</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminlogin.jsp");
			requestDispatcher.include(req, resp);

		} else {

			out.println("<h3>Unable to delete account!!!</h3>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("admindelete.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
