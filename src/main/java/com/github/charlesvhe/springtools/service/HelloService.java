package com.github.charlesvhe.springtools.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
    @GetMapping("/test")
	public String hello() {
		return "time: " + System.currentTimeMillis();
	}







	
    
}
