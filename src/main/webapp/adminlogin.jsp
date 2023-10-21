<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin LogIn</title>
  <link rel="stylesheet" href="exstyle/style.css">
</head>
<body>
  <div class="wrapper">
    <form action="login" method="post">
      <h2>Admin Login</h2>
        <div class="input-field">
        <input type="email" id="user"  name="email" required>
        <label>Enter your email</label>
      </div>
      <div class="input-field">
        <input type="password"  id="pass"  name="password" required>
        <label>Enter your password</label>
      </div>
      <div class="forget">
        <label for="remember">
          <input type="checkbox" id="remember">
          <p>Remember me</p>
        </label>
        <a href="adminupdate.jsp">Forgot password?</a>
      </div>
      <button type="submit">Log In</button>
      <div class="register">
        <p>Don't have an account? <a href="adminregister.jsp">Register</a></p>
      </div>
    </form>
  </div>
</body>
</html>