package com.programacion.jje.controllers;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.programacion.jje.models.AlumnoDao;

@Controller
@RequestMapping(value="/Alumno")
public class Alumno {
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
	private AlumnoDao alumnoDao = (AlumnoDao) context.getBean("AlumnoDAO");
	
	@RequestMapping(value="/")
	public String index(Model model) {
		List<com.programacion.jje.models.Alumno> alumnos = alumnoDao.getAll();
		model.addAttribute("alumnos", alumnos);
		return "alumno_all";
	}
	
	@RequestMapping(value="/add")
	public String add(Model model) {
		return "alumno_add";
	}
	
	@RequestMapping(value="/edit/{alumnoId}")
	public String edit(Model model, @PathVariable String alumnoId) {
		com.programacion.jje.models.Alumno alumno = alumnoDao.getById(alumnoId);
		model.addAttribute("nombre", alumno.getNombre());
		model.addAttribute("apellidos", alumno.getApellidos());
		model.addAttribute("alumnoId", alumno.getAlumnoId());
		
		return "alumno_edit";
	}
	
	@RequestMapping(value="/addAlumno")
	public String addAlumno(Model model,com.programacion.jje.models.Alumno alumno) {
		String mensaje = alumnoDao.insert(alumno);
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("url", "/jje/Alumno/");
		return "mensaje";
	}
	
	@RequestMapping(value="/editAlumno")
	public String editAlumno(Model model,com.programacion.jje.models.Alumno alumno) {
		String mensaje = alumnoDao.update(alumno);
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("url", "/jje/Alumno/");
		return "mensaje";
	}
	
	
	@RequestMapping(value="/deleteAlumno/{alumnoId}")
	public String deleteAlumno(Model model, @PathVariable String alumnoId) {
		String mensaje = alumnoDao.delete(alumnoId);
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("url", "/jje/Alumno/");
		return "mensaje";
	}

}
