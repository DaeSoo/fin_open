package com.fintech.openbangking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class FinController {


	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		return "hello";
	}
}
