<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	text-align: center;
	margin: 100px auto;
	width: 300px;
}

form {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
}

input[type="text"], input[type="password"] {
	width: 90%;
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"] {
	width: 90%;
	padding: 10px;
	background-color: black;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: grey;
}
</style>
</head>
<body>
<h2 align="center">Enter Student Details</h2>
	<form action="addstudent" method="post">
		Student's name:<input type="text" name="stname"><br>
		<br> Student's degree:<input type="text" name="stdeg"><br>
		<br> Student's stream:<input type="text" name="ststream"><br>
		<br> Student's year:<input type="text" name="styear"><br>
		<br> Username:<input type="text" name="uname"><br>
		<br> Password : <input type="password" name="pass"><br>
		<br> <input type="submit">

	</form>

</body>
</html>