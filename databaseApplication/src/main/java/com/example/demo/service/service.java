package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.day5.carModel;
import com.example.demo.repo.carRepository;

@Service
public class service {
	@Autowired
	public carRepository obj;
	//Post
	public carModel saveInfo(@RequestBody carModel obj1)
	{
		return obj.save(obj1);
		
	}
	//Get
	public List<carModel> getInfo()
	{
		return obj.findAll();
	}
	//Put
	public carModel UpdateInfo(carModel in)
	{
	   return obj.saveAndFlush(in);
	}
	//Delete
	public void deleteInfo(int id)
	{
		obj.deleteById(id);
	}

}
