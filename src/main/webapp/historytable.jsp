<%@page import="com.jsp.dto.BookHistory"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.dao.BookHistoryDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>History Table</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	text-align: center;
	margin: 20px auto;
}

h1 {
	color: black;
}

table {
	width: 80%;
	background-color: white;
	border-collapse: collapse;
	margin: 20px auto;
}

th, td {
	border: 1px solid #ddd;
	padding: 10px;
	text-align: left;
}

th {
	background-color: white;
}
</style>
</head>
<body>
	<h1>History Table</h1>
	<%!BookHistoryDao bookHistoryDao = new BookHistoryDao();
	List<BookHistory> bookHistories = bookHistoryDao.getAllBookHistory();%>
	<table border="2px" cellspacing="0px" cellpadding="1px">
		<tr>
			<th>Id</th>
			<th>Student Id</th>
			<th>librarian Id</th>
			<th>Book Id</th>
			<th>Issue Date</th>
			<th>Return Date</th>

		</tr>
		<%
		for (BookHistory b : bookHistories) {
		%>
		<tr>
			<td><%=b.getId()%></td>
			<td><%=b.getStudent_id()%></td>
			<td><%=b.getLibrarian_id()%></td>
			<td><%=b.getBook_id()%></td>
			<td><%=b.getIssueDate()%></td>
			<td><%=b.getReturnDate()%></td>

		</tr>
		<%
		}
		%>
	</table>

</body>
</html>