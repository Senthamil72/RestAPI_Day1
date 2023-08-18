package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.College;

@RestController
public class CY2_ApiControllers {

	@GetMapping("/clg")
	public List<College> getCollege()
	{
		return Arrays.asList(new College("SKCET","ECE",137));
	}
}
