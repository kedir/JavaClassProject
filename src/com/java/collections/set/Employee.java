package com.java.collections.set;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {

	
	private Long id;
	private String name;
	private LocalDate dob;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	public Employee(Long id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}


	public Employee(long id2, String name2, LocalDate now) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		//return this.
		return this.getId().compareTo(emp.id);
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public void setId(Long id) {
		this.id = id;
	}


	private LocalDate getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
