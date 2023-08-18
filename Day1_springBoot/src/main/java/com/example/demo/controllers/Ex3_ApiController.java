package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3_ApiController {
	@Value("${color}")
	private String YourFavColor;
	@GetMapping("/color")
	public String getMyFav()
	{
		return "My favorite color is "+YourFavColor;
	}

}
