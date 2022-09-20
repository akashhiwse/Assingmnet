package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Employee;
import com.yash.service.HomeService;

@RestController
public class HomeController {     
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/postemployeedata")
	public Employee setdata(@RequestBody Employee e){
		return hs.savedata(e);
		
	}
	
	@GetMapping("/getemployeedata")
	public List<Employee> getdata()
	{
		return hs.getdata();
		
	}
	
	@PutMapping("/updateempdata/{id}")
	public Employee updatedata(@PathVariable int id, @RequestBody Employee e)
	{
		return hs.updatedata(id,e);	
	}
	
	@DeleteMapping("/deletemployeedata/{id}")
	public String deletedata(@PathVariable int id)
    {
		return hs.deletedata(id);
    }
	
}
