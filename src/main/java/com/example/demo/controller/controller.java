package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Models;
import com.example.demo.service.service;

@RestController
public class controller {
	@Autowired
	service eser;
	@PostMapping("/added")
	
	public Models addDetails(@RequestBody  Models e)
	{
		return eser.saveDetails(e);
	}
	@GetMapping("/show")
	
	public List<Models> fetchDetails()
	{
		return eser.getDetails();
	}
	

}
