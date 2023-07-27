package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Models1;
import com.example.demo.service.service1;

@RestController
public class controller1 {
	@Autowired
	service1 eser;
	@PostMapping("/addeddetail")
	
	public Models1 addDetails(@RequestBody Models1 e)
	{
		return eser.saveDetails(e);
	}
	
	@GetMapping("/showdetail")
	public List<Models1> FetchDetails()
	{
		return eser.getDetails();
	}
	@PutMapping("/updatedetail")
	public Models1 updateInfo (@RequestBody Models1 s)
	{
		return eser.updateDetails(s);
	}

}
