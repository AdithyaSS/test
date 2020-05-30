package com.cricket.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CricketController {

	@Autowired
	private CricketService cricketService;

	@ResponseBody
	@GetMapping(value = "/getPlayer")
	public String getTeam(@RequestParam short jersyeNumber) {
		return cricketService.getPlayerWrtJerseyNumb(jersyeNumber);
	}

	// APIs has to be developed here.
}
