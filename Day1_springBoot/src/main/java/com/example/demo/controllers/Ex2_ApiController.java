package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex2_ApiController {

	@Value("${name}")
	private String studentName;
	@GetMapping("/")
	public String getName()
	{
		return "Welcome "+studentName+" !";
	}
}
