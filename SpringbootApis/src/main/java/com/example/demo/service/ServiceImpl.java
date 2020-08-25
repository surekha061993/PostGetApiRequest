package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private EmployeeDao ee;
	
	@Override
	public void addEmployee(Employee e) {
		System.out.println("Employee Data: "+ e.getId()+" "+e.getName()+" "+e.getMobile()+" "+e.getAddress()+" "+e.getGender());
		ee.save(e);
		System.out.println("Employee Data Store into database");
	}

	@Override
	public Employee getEmployee(int id) {
		Employee e=ee.findById(id).get();
		return e;
	}

}
