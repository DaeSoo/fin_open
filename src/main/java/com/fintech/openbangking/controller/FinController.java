package com.fintech.openbangking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "daesoo");
		return "web/hello";
	}
	
	@GetMapping("/home")
	public String home() {
		return "web/001";
	}

}
