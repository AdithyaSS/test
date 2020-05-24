package com.wolken.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "/myView", method = RequestMethod.GET)
	public ModelAndView getModelAndView() {
		return new ModelAndView("myPage");
	}

	@RequestMapping(value = "/studentDetails")
	public String getParameterValues(@RequestParam("studId") int studId, @RequestParam("studName") String studName,
			@RequestParam("branchName") String streamBelongTo, @RequestParam("cgpa") double cgpa) {
		StringBuilder builder = new StringBuilder();
		builder.append(String.valueOf(studId)).append("\t").append(studName).append("\t").append(streamBelongTo)
				.append("\t").append(cgpa);
		return builder.toString();
	}

	// New rest methods will come here.
}
