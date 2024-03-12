package com.programmingapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to home";
	}
}
