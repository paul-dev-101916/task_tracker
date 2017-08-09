package io.tasktracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/login.do")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	

	
	@RequestMapping("/")
	public ModelAndView login() {
		System.out.println("before login"); 
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
}