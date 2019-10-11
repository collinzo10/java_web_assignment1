<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
<title>Assignment 1</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="styles.css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>
<div class="wrapper">
	<form class="form-signin" action="AdminAuth" method="post">
	<h1>LOGIN</h1>
		<div class="form-group">
			<label for="username">Username</label>
			<input type="email" name="username" class="form-control">
		</div>
		<div class="form-group"">
			<label for="password">Password</label>
			<input type="password" name="password" class="form-control">
		</div>
		<div class="g-recaptcha" data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI"></div>
		<div id ="buttons">
			<button type="submit" name="login" class="btn btn-primary">Login</button>
			<button class="btn btn-secondary" name="register">Register</button>
		</div>
	</form>
</div>
</body>
</html>