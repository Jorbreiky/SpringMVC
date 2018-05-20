package springmvc1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc1.models.PersonaDAO;

@Controller
public class Persona {
	
	@RequestMapping(value="/")
	public String index(Model model) {
		return "home";
	}
	
	@RequestMapping(value="/addGET", method=RequestMethod.GET)
	public String addGET(Model model, @RequestParam("nombre") String nombre ) {
		model.addAttribute("nombre",nombre);
		return "add";
	}
	
	@RequestMapping(value="/addPOST", method=RequestMethod.POST)
	public String addPOST(Model model, @RequestParam("nombre") String nombre ) {
		model.addAttribute("nombre",nombre);
		return "add";
	}
	
	@RequestMapping(value="/add")
	public String add(Model model, @RequestParam("nombre") String nombre) {
		model.addAttribute("nombre",nombre);
		return "add";
	}
	
	@RequestMapping(value="/addPersona")
	public String addPersona(Model model, PersonaDAO persona) {
		model.addAttribute("nombre", persona.toString());
		return "add";
	}
	
	@RequestMapping(value="/addVariable/{nombre}/{apellidos}/")
	public String addVariable(Model model, @PathVariable String nombre, @PathVariable String apellidos) {
		model.addAttribute("nombre", nombre+" - "+apellidos);
		return "add";
	}
}