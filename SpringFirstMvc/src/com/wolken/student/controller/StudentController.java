package com.wolken.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello, good afternoon...!";
	}

	@ResponseBody
	@RequestMapping(value = "/pinNumber", method = RequestMethod.GET)
	public int getPinCode() {
		return 571111;
	}
}
