<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Librarian Portal</title>
<style>
body {
	 font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        padding: 20px;
}

form {
	max-width: 400px;
        margin: auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

input[type="submit"] {
	 display: block;
        width: 100%;
        padding: 10px 15px;
        margin-bottom: 10px;
        border: none;
        background-color: black;
        color: #fff;
        font-size: 16px;
        cursor: pointer;
        border-radius: 5px;
}

input[type="submit"]:hover {
 background-color: grey;
}
</style>
</head>
<body>
<h2 align="center">Librarian Portal</h2>
	<form action="libportal" method="post">
		<input type="submit" value="Add Book" name="addbook"><br>
		<br>
		<input type="submit" value="Remove Book" name="removebook"><br>
		<br>
		<input type="submit" value="List of Book" name="listbook"><br>
		<br>
		<input type="submit" value="List of Student" name="liststudent"><br>
		<br>
		<input type="submit" value="History Of Student" name="history">
	</form>

</body>
</html>