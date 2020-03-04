package edu.miu.cs.cs425.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: lamhotjmsigian
 * 
 */
 
@Controller
public class HomeController {


 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "Spring MVC for eRegistrar";
		return new ModelAndView("welcome", "message", message);
	}
}