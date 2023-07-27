package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Models2;
import com.example.demo.repository.repository2;

@Service
public class service2 {
	@Autowired
   repository2 prepo;
	
	public Models2 saveDetails(Models2 e)
	{
		return prepo.save(e);
	}
	public List<Models2> getDetails()
	{
		return prepo.findAll();
	}
	public Models2 updateDetails(Models2 s)
	{
		return prepo.saveAndFlush(s);
	}

}


