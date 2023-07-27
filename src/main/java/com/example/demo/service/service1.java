package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Models1;
import com.example.demo.repository.repository1;

@Service
public class service1 {
	@Autowired
	repository1 prepo;
	
	public Models1 saveDetails(Models1 e)
	{
		return prepo.save(e);
	}
	public List<Models1> getDetails()
	{
		return prepo.findAll();
	}
	public Models1 updateDetails(Models1 s)
	{
		return prepo.saveAndFlush(s);
	}

}
