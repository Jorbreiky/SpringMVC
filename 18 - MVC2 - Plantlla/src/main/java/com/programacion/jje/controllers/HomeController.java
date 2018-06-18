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
public class HomeController {
	
	@RequestMapping(value="/")
	public String index(Model model) {
		
		return "plain_page";
	}
}