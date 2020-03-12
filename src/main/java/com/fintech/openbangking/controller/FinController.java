package com.fintech.openbangking.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fintech.openbangking.model.LoginVo;

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
	
	@PostMapping("/test/ajax")
	@ResponseBody
	public Map<String, Object> testAjax(LoginVo loginVo){
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		System.out.println(loginVo.getUserid());
		
		System.out.println(loginVo.getPassword());
		
		result.put("code", "0000");
		
		return result;
	}


}
