package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;

@RestController
public class PAH1_ApiController {

	@GetMapping("/hello")
	public List<Student> getWelcomeMessage()
	{
		return Arrays.asList(new Student("Taemil","Wecome"));
	}
	
}
