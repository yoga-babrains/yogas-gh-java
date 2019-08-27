package com.javacodegeeks.example;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello! Welcome To Guide-Rails®";
	}

	public String sayHi() {
		return "Hi";
	}

	public void lintError() {
		Map<String, ?> emptyMap;
	}
}
