package com.yash.service;

import java.util.List;

import com.yash.model.Employee;


public interface HomeService {

	Employee savedata(Employee e);

	List<Employee> getdata();

	Employee updatedata(int id, Employee e);

	String deletedata(int id);

	
}
