package com.programacion.jje.models;

import java.util.List;

public interface AlumnoDao {
	public List<Alumno> getAll();
	public Alumno getById(String alumnoId);
	public String insert(Alumno alumno);
	public String update(Alumno alumno);
	public String delete(String alumnoId);
}
