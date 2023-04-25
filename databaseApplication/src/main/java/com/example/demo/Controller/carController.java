package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day5.carModel;
import com.example.demo.service.service;

@RestController
public class carController {
	@Autowired
	public service obj2;
	@PostMapping("/savecar1")                 
	public carModel addDetails(@RequestBody carModel obj3)
	{
		return obj2.saveInfo(obj3);
	
	}
	@GetMapping("/savecar")
	public List<carModel>getDetails()
	{
		return obj2.getInfo();
		
	}
	
	
	@PutMapping("/putCar")
	public carModel display(@RequestBody carModel obj4) 
	{	
		return obj2.UpdateInfo(obj4);
	}
	@DeleteMapping("/deleteCar/{cid}")
     public String deleteDetails(@PathVariable int cid)
     {
		obj2.deleteInfo(cid);
		return "cid "+cid+" deleted";
		
     }
	
	@DeleteMapping("/deleteByParam")
	public String deleteByparamas(@RequestParam("cid2") int cid)
	{
		obj2.deleteInfo(cid);
		return " cid number"+cid+"is deleted";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
