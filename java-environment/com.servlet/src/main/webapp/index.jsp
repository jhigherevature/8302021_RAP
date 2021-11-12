<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h1>Welcome!</h1>
	<p>Check This out!</p>
	<a href="http://localhost:8080/check/hello">
		Click here to go to Hello page!
	</a>
	
	<h2>Login:</h2>
	<form action="login" method="POST">
		Name: <input type="text" name="login_name"><br />
		Pass: <input type="password" name="login_pass"><br />
		
		<input type="submit">
	</form>
</body>
</html>