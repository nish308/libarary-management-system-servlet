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
	margin: 100px auto;
	width: 300px;
}

form {
	background-color: #ffffff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
}

input[type="number"] {
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
<jsp:include page="navbar.jsp" />
<h2>Authorize Librarian</h2>
	<form action="authorizelibrarian" method="post">
		Enter librarian id : <input type="number" name="libid"><br>
		<br> Enter admin id : <input type="number" name="adminid"><br>
		<br> <input type="submit">

	</form>

</body>
</html>