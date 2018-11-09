package com.java.oop3;

public class Employee extends Person {

	private int empId;

	public Employee(String nm, String gen, int empId) {
		super(nm, gen);
		this.empId = empId;

	}

	@Override
	public void work() {

		if (empId == 0) {
			System.out.println("Not working");
		} else {
			System.out.println("Employee is working");
		}

	}
	
	public static void main(String[] args) {
		
		Person emp1 = new Employee("Steve", "M", 0);
		Person emp2 = new Employee("Bob", "M", 123);
		
		emp1.work();
		emp2.work();
		
		emp1.changeName("Josh");
		System.out.println(emp1.toString());
	}
	

}
