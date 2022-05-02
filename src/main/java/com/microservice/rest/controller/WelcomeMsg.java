package com.microservice.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		return "Welcome To Eureka Client Rest API-01";
	}
}
