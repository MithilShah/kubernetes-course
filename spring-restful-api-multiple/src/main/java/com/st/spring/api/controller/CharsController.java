package com.st.spring.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class CharsController {

	@RequestMapping("/advanced-hello")
	@CrossOrigin(origins = "*")
	public String countChars(@RequestParam String name) {
		string url = "http://spring-restful-api-service.default.svc.cluster.local:8080/hello?name="+name;
		
	}
}
