<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
<title>Register</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="styles.css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>
	<div class="wrapper">
		<form class="form-signin" action="RegiAuth" method="post">
			<h1>Registeration Page</h1>
			<div class="form-group">
				<label for="firstName">Firstname*</label>
				<input type="text" name="firstName" class="form-control">
			</div>
			<div class="form-group">
				<label for="lastName">Lastname*</label>
				<input type="text" name="lastName" class="form-control">
			</div>
			<div class="form-group">
				<label for="address">Address*</label>
				<input type="text" name="address" class="form-control">
			</div>
			<div class="form-group">
				<label for="email">Email*</label>
				<input type="email" name="email" class="form-control">
			</div>
			<div class="form-group">
				<label for="password">Password*</label>
				<input type="password" name="password" class="form-control">
			</div>
			<div class="form-group">
				<label for="confPassword">Confirm Password*</label>
				<input type="password" name="confPassword" class="form-control">
			</div>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value="" name="check">
				<label class="form-check-label" for="check">I agree to the <b><u>terms of service</u></b></label>
			</div>
			<div class="form-group">
				<button class="btn btn-primary" type="submit" name="register">Register</button>
				<button class="btn btn-secondary" name="cancel">Cancel</button>
			</div>
		</form>
	</div>
</body>
</html>