<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learning jsp!</title>
</head>
<body>

	<form action="ServletLogin" method="post">
		
		<input type="hidden" value="<%= request.getParameter("url") %>" name="url">
		
		<label for="login">Login</label>
		<input type="text" name="login"><br><br>
		
		<label for="pwd">Password</label>
		<input type="password"name="pwd">
		
		<input value="<%= request.getParameter("session") %>">
		
		<input type="submit" value="Enter"><br><br>
		<span style="color: red;">${msg}</span>
		
	</form>
;
</body>
</html>