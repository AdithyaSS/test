package com.cricket.team;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CricketController {
	@RequestMapping(value = "/teamName", method = RequestMethod.GET)
	public String teamName() {
		return "Australia";
	}

	@ResponseBody
	@GetMapping
	public String sayHello() {
		return "Hello";
	}
}
