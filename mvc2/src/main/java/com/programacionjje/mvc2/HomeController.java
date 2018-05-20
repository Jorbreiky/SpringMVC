package com.programacionjje.mvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("nombre", "Programacion JJE");
		return "home";
	}
	
	@RequestMapping(value="/addGET", method=RequestMethod.GET)
	public String addGET(Model model, @RequestParam("id") String id, @RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos) {
		model.addAttribute("nombre", "Programacion JJE");
		model.addAttribute("persona", id+" - "+nombre+" - "+apellidos);
		return "add";
	}
	
	@RequestMapping(value="/addPOST", method=RequestMethod.POST)
	public String addPOST(Model model, @RequestParam("id") String id, @RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos) {
		model.addAttribute("nombre", "Programacion JJE");
		model.addAttribute("persona", id+" - "+nombre+" - "+apellidos);
		return "add";
	}
	
	@RequestMapping(value="/add")
	public String add(Model model, @RequestParam("id") String id, @RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos) {
		model.addAttribute("nombre", "Programacion JJE");
		model.addAttribute("persona", id+" - "+nombre+" - "+apellidos);
		return "add";
	}
}
