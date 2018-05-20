package springmvc1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Persona {
	
	@RequestMapping(value="/")
	public String index(Model model) {
		return "home";
	}
	
}