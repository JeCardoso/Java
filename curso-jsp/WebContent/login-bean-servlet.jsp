<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login usando servlet bean</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		<input type="text" id="login" name="login" placeholder="login" />
		<br>
		<input type="text" id="senha" name="senha" placeholder="senha" />
		<br>
		<input type="submit" value="Logar" />
		<br>
	</form>
</body>
</html>