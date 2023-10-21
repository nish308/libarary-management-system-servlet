
<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        text-align: center;
        margin: 20px auto;
    }

    table {
        width: 80%;
        border-collapse: collapse;
        margin: 20px auto;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 10px;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }

    a {
        text-decoration: none;
        color: #007BFF;
    }

    a:hover {
        color: #0056b3;
    }
</style>
</head>
<body>
<h1>List Of Student</h1>
<%! StudentService studentService=new StudentService();
List<Student> students=studentService.getAllRes();
%>

<table border="2px" cellspacing="0px" cellpadding="1px">
<tr>
<th>student id</th>
<th>student name</th>
<th>Degree</th>
<th>Stream</th>
<th>Year</th>
<th>Delete</th>
<th>Update</th>
</tr>

<% for(Student s:students){ %>
<tr>
<td><%= s.getStudent_id() %></td>
<td><%= s.getName() %></td>
<td><%= s.getDegree() %></td>
<td><%= s.getStream() %></td>
<td><%= s.getYear() %></td>
<td><a href="deletestudent.jsp?id=<%= s.getStudent_id()%>">Delete</a></td>
<td><a href="updatestudent.jsp?id=<%= s.getStudent_id()%>">Update</a></td>

</tr>
<% } %>
</table>

</body>
</html>