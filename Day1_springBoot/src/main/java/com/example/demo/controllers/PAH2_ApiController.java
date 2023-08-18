package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Address;

@RestController
public class PAH2_ApiController {

@GetMapping("/details")
	public List<Address> getAddress()
	{
	return Arrays.asList(new Address("Taemil",100,"N.S.K Nagar",641606,"Palladam","Tirupur","Tamilnadu","India"));
	}
}
