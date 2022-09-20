package com.yash.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Employee;
import com.yash.repository.HomeRepository;
import com.yash.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService  {

	@Autowired
	HomeRepository hr;

	@Override
	public Employee savedata(Employee e) {
		
		return hr.save(e);
	}

	@Override
	public List<Employee> getdata() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public Employee updatedata(int id, Employee e) {
		e.setId(id);
		
		return hr.save(e);
	}

	@Override
	public String deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		
		return "deleted";
	}
	
	
}
