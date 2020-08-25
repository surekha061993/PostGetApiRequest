package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@DataJpaTest
public class EmployeeTest {

	@Autowired
	public EmployeeDao repo;
	
	@Test
	public void createEmployee()
	{
		Employee employee=new Employee(22,"surekha","pune","female","888888888");
		repo.save(employee);
	}
}
