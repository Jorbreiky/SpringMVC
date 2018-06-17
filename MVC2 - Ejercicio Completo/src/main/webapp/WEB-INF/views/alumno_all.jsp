<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Alumnos</title>
	</head>
	<body>
	<h1>Lista de Alumnos</h1>
	<a href="/jje/Alumno/add">Agregar</a><br>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NOMBRE</th>
			<th>APELLIDOS</th>
			<th>ACCION</th>
		</tr>
		<c:forEach items="${alumnos}" var="alumno">
			<tr>
				<td>${alumno.getAlumnoId()}</td>
				<td>${alumno.getNombre()}</td>
				<td>${alumno.getApellidos()}</td>
				<td>
					<a href="/jje/Alumno/edit/${alumno.getAlumnoId()}"> Editar</a><br>
					<a href="/jje/Alumno/deleteAlumno/${alumno.getAlumnoId()}"> Eliminar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	</body>
</html>
