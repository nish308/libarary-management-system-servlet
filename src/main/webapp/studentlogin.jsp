<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student LogIn</title>
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

input[type="email"], input[type="password"] {
	width: 95%;
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

a {
	text-decoration: none;
	color: black;
}

a:hover {
	color: #0056b3;
}
</style>
</head>
<body>
<h1 align="center">Student LogIn</h1>
	<form action="studentlogin" method="post">
		Email: <input type="email" id="user" 
			name="studentemail" required><br>
		<br> Password: <input type="password" id="pass"
			name="studentpassword" required><br>
		<br> <input type="submit"><br>
		<br> <a href="addstudent.jsp">Create a new account</a><br>
		<br>
	</form>


	</form>

</body>
</html>