package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Models2;
import com.example.demo.service.service2;

@RestController
public class controller2 {
	@Autowired
	service2 eser;
	@PostMapping("/addeddetails")
	
	public Models2 addDetails(@RequestBody Models2 e)
	{
		return eser.saveDetails(e);
	}
	
	@GetMapping("/showdetails")
	public List<Models2> FetchDetails()
	{
		return eser.getDetails();
	}
	@PutMapping("/updatedetails")
	public Models2 updateInfo (@RequestBody Models2 s)
	{
		return eser.updateDetails(s);
	}


}
