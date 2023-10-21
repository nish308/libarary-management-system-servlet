<%@page import="com.jsp.dto.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.BookService"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Of Book</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        text-align: center;
        margin: 20px auto;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }

    tr:hover {
        background-color: #f9f9f9;
    }
</style>
</head>
<body>
<h1>List of Books</h1>
<%! BookService bookService=new BookService();
List<Book> books=bookService.getAllRes();
%>
<table border="1px" cellspacing="0px" cellpadding="4px">
<tr>
<th>Id</th>
<th>Author</th>
<th>Book name</th>
<th>Issue date</th>
<th>Status</th>
<th>Librarian id</th>
<th>Student Id</th>
<th>Issue book</th>

</tr>

<% for(Book b:books){ %>
<tr>
<td><%= b.getId() %></td>
<td><%= b.getAuthor() %></td>
<td><%= b.getBook_name() %></td>
<td><%= b.getIssueDate() %></td>
<td><%= b.getStatus() %></td>
<td><%= (b.getLibrarian()!=null)? b.getLibrarian().getId():" " %></td>
<td><%= (b.getStudent()!=null)? b.getStudent().getStudent_id():" " %></td>
<td><a href="issuebook.jsp?id=<%= b.getId()%>">Issue</a></td>
</tr>
<%} %>

</table>

</body>
</html>