<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Sign Up</title>
<link rel="stylesheet" href="exstyle/style.css">

</head>
<body>
	<h2>Register new admin</h2>

	<form action="adminregister" method="post">


		<div class="wrapper">

			<h2>Admin SignUp</h2>
			<div class="input-field">
				<input type="text" name="nameofadmin"> <label>Enter
					your name</label>
			</div>
			<div class="input-field">
				<input type="email" name="email"> <label>Enter your
					email</label>
			</div>
			<div class="input-field">
				<input type="password" name="password"> <label>Enter
					your password</label>
			</div>
			<button type="submit">Sign Up</button>
		</div>
	</form>

</body>
</html>
