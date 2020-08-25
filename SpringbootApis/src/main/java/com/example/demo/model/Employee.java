package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {

	@Id
	private int id;
	
	private String name;
	
	private String address;
	
	private String gender;
	
	private String mobile;

	
	public Employee()
	{
		
	}
	public Employee(int id, String name, String address, String gender, String mobile) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.mobile = mobile;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", mobile="
				+ mobile + "]";
	}
	
	
	
	
}
