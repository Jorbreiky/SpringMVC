package com.programacion.jje.models;

public class Alumno {
	
	private String alumnoId, nombre, apellidos;

	public Alumno() {
		
	}

	public Alumno(String alumnoId, String nombre, String apellidos) {
		super();
		this.alumnoId = alumnoId;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(String alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Alumno [alumnoId=" + alumnoId + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
}
