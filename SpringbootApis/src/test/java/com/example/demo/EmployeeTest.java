package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace =Replace.NONE)
public class EmployeeTest {

	@Autowired
	public EmployeeDao repo;
	
	@Test
	@Rollback(false)
	public void testCreateEmployee()
	{
		Employee employee=new Employee(22,"surekha","pune","female","888888888");
		Employee emp=repo.save(employee);
		assertNotNull(emp);
	}
	
	@Test
	public void testFindEmployeeByName()
	{
		String name="surekha";
		Employee employee=repo.findByName(name);
		assertThat(employee.getName()).isEqualTo(name);
	}
}
