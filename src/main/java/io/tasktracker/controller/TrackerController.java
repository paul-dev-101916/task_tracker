package io.tasktracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrackerController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping("tracker/landing.do")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in TrackerController");

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
