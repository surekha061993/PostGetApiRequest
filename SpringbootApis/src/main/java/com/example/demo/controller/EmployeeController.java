package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ServiceI;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private ServiceI s;
	
	@PostMapping("/empadd")
	public String addEmp(@RequestBody Employee employee)
	{
		System.out.println("Data Admin");
		s.addEmployee(employee);
		return "Data Added";
	}
	
	@GetMapping("/dataget/{id}")
	public Employee getEmp(@PathVariable("id") int id)
	{
		Employee e=s.getEmployee(id);
		return e;
	}
}
