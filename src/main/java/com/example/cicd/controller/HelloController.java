package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String hello() {
		return "Hello CICD ith DOCKER and Github Actions";
	}
}

// build -> cicd.jar + Google Jib Tool -> container -> run
