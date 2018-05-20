<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Basico</title>
</head>
<body>
	<label>Hola Mundo desde Spring MVC</label>
	
	<form action="/springmvc1/addPersona" method="POST">
		<input type="text" name="id" />
		<input type="text" name="nombre" />
		<input type="text" name="apellidos" />
		<button type="submit">Enviar</button>
	</form>
</body>
</html>