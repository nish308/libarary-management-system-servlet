package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.AdminService;

@WebServlet("/updateadmin")
public class UpdateAdmin extends HttpServlet {
	AdminService adminService = new AdminService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String adminnewpassword = req.getParameter("adminnewpass");
		int id = Integer.parseInt(req.getParameter("adminid"));
		
		boolean res = adminService.updateadminpass(id, adminnewpassword);
		if(res == true) {
		out.println("<h3>Password updated successfully</h3>");

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Adminportal.jsp");
		requestDispatcher.include(req, resp);
		}else {
			out.println("<h3>Update fail!!!</h3>");

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminupdate.jsp");
			requestDispatcher.include(req, resp);
		}
	}
}
