package com.example.demo.service;

import com.example.demo.model.Employee;

public interface ServiceI {

	void addEmployee(Employee e);
	
	Employee getEmployee(int id);
}
