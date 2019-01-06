package com.st.spring.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	@CrossOrigin(origins = "*")
	public String sayHelloTo(@RequestParam String name) {
		return "Hello " + name;
	}
}
