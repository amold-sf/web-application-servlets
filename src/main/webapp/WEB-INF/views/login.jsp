<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Servlet Login Page</title>
</head>
<body>
	<p>${errorMessage}</p>
 	<form action="/login" method="post">
 	Name: 	  <input type="text" name="name"/>
 	Password: <input type="password" name="password"/>
 	<input type="submit" value="login">
 	</form>
</body>
</html>