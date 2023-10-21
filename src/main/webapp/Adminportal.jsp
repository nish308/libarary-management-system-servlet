<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Portal</title>
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
<jsp:include page="navbar.jsp" />
<h2 align="center">Admin Portal</h2>
    <form action="adminportal" method="post">
        <label for="getlibrarian"></label>
        <input type="submit" id="getlibrarian" value="Get Librarian" name="getlibrarian"><br><br>
        
        <label for="delete"></label>
        <input type="submit" id="delete" value="Delete Admin" name="delete"><br><br>
        
        <label for="update"></label>
        <input type="submit" id="update" value="Update Admin" name="update"><br><br>
        
        <label for="authorize"></label>
        <input type="submit" id="authorize" value="Authorize Librarian " name="authorize">
    </form>
</body>
</html>