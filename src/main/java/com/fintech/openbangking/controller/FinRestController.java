package com.fintech.openbangking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/test")
public class FinRestController {
	
	private Logger LOGGER = LoggerFactory.getLogger(FinController.class);
	
	@RequestMapping(value ="/authTest",method=RequestMethod.GET)
	public ResponseEntity<String> getUserAuthJson(){
	
		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders httpHeaders = new HttpHeaders();
		String url = "https://testapi.openbanking.or.kr/oauth/2.0/authorize";
		String response_type="code";
		String client_id="";
		String redirect_uri ="http://localhost:8081/hello";
		String scope="login inquiry transfer";
		String client_info ="hi";
		String auth_type="0";
		String lang = "kor";
		
		httpHeaders.add("Accept", "application/json");

		url=url+"?response_type="+response_type+"&client_id="+client_id+"&redirect_uri="+redirect_uri+"&scope="+scope+
				"&client_info="+client_info+"&auth_type="+auth_type+"&lang="+lang+"&state=12345678901234567890123456789012";
		System.out.println(url);
		return restTemplate.exchange(url, HttpMethod.GET, new HttpEntity(httpHeaders), String.class);
	}

}
