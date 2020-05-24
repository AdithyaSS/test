package com.wolken.student.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {
	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello, good afternoon...! Adithya";
	}

	@ResponseBody
	@RequestMapping(value = "/pinNumber", method = RequestMethod.GET)
	public Integer getPinCode() {
		return 571111;
	}

	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String homePage(Model model) {
		model.addAttribute("studFName", "Adithya");
		model.addAttribute("studLName", 'S');
		System.out.println("\"display\" is a void method");
		return "home";
	}

	@RequestMapping(value = "/myView", method = RequestMethod.GET)
	public ModelAndView getModelAndView() {
		return new ModelAndView("myPage");
	}
}
