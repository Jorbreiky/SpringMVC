<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Alumnos</title>
	</head>
	<body>
	<h1>Agregar un nuevo Alumno</h1>
	<br>
	<form action="/jje/Alumno/addAlumno" method="POST">
		<label>Nombre: </label><input type="text" name="nombre" id="nombre" /><br>
		<label>Apellidos: </label><input type="text" name="apellidos" id="apellidos" /><br>
		<button type="submit">Agregar</button>
	</form>
	
	
	</body>
</html>
