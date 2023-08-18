package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Family;

@RestController
public class CY1_ApiControllers {

	@GetMapping("/fam")
	public List<Family> getFamilyDetails()
	{
		return Arrays.asList(new Family("Thiruselvam",50,"Appa"));
	}
}
