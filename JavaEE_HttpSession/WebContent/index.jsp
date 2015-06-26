<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HttpSession DEMO</title>
</head>
<body>
	<center>
		<h1>HttpSession DEMO</h1>
		<form action="SessionServlet" method="post">
			<label for="name">Name</label>
			<input id="name" type="text" name="name"/>
			<input type="submit" value="Submite"/>
		</form>
	</center>
</body>
</html>