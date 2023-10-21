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
	background-image:
		url("https://www.bestdesignguides.com/wp-content/uploads/2018/11/feat-2.jpg");
	background-size: cover;
}

h1 {
	color: black;
}

.login-form {
	margin: 100px auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
	width: 300px;
}

.login-btn {
	width: 100%;
	padding: 10px;
	margin: 5px 0;
	background-color: black;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

.login-btn:hover {
	background-color: grey;
}
</style>
</head>
<body>
	<h1>Library Management System</h1>
	<form action="home" method="post" class="login-form">
		<input type="submit" value="Admin Login" name="admin"
			class="login-btn"> <br> <br> <input type="submit"
			value="Librarian Login" name="librarian" class="login-btn"> <br>
		<br> <input type="submit" value="Student Login" name="student"
			class="login-btn"> <br> <br>
	</form>
</body>
</html>
