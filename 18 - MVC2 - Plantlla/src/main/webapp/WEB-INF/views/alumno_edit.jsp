<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Alumnos</title>
	</head>
	<body>
	<h1>Editar un Alumno</h1>
	<br>
	<form action="/jje/Alumno/editAlumno" method="POST">
		<label>Nombre: </label><input type="text" name="nombre" id="nombre" value="${nombre}"/><br>
		<label>Apellidos: </label><input type="text" name="apellidos" id="apellidos" value="${apellidos}"/><br>
		<input type="hidden" name="alumnoId" id="alumnoId" value="${alumnoId}"/>
		<button type="submit">Guardar</button>
	</form>
	
	
	</body>
</html>
