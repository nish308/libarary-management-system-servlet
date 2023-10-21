<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login registration</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-image:
		url("https://media.istockphoto.com/id/611177968/photo/modern-interior-room-with-beautiful-furniture.jpg?s=612x612&w=0&k=20&c=gOqtglR3PCU6bqNuPUTkWjZH7fYhHT3A3Liv7ydx9sw=");
	background-size: cover;
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

input[type="text"], input[type="email"], input[type="password"] {
	width: 90%;
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"] {
	width: 100%;
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
	<h2 align="center">Librarian Registration</h2>
	<form action="libregistration" method="post">
		Name : <input type="text" name="nameofuser"><br>
		<br> Username : <input type="email" name="email"><br>
		<br> Password : <input type="password" name="password"><br>
		<br> <input type="submit">

	</form>

</body>
</html>