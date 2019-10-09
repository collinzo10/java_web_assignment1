<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment 1</title>
</head>
<body>
<h1>LOGIN</h1>
<div id = "login">
	<form action="AdminAuth" method="post">
		<div id ="username">
			<label for="username">Username: </label>
			<input type="email" name="username" required>
		</div>
		<div id="password">
			<label for="password">Password: </label>
			<input type="password" name="password" required>
		</div>
		<div id ="buttons">
			<button type="submit">Login</button>
			<button>Register</button>
		</div>
	</form>
</div>
</body>
</html>