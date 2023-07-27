package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Models;
import com.example.demo.repository.repository;

@Service
public class service {
	@Autowired
	repository prepo;
	
	public Models saveDetails(Models e)
	{
		return prepo.save(e);
	}
	public List<Models> getDetails()
	{
		return prepo.findAll();
	}
	

}
