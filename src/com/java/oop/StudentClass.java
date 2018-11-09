package com.java.oop;

public class StudentClass {
	int rollNum;
	String stuName;
	Address address;
	public StudentClass(int rollNum, String stuName, Address address) {
		super();
		this.rollNum = rollNum;
		this.stuName = stuName;
		this.address = address;
	}
	
	public static void main(String[] args) {
		StudentClass stu1 = new StudentClass(10, "Josh", new Address(120, "falls church", "va", "USA"));
		System.out.println(stu1.toString());
		System.out.println(stu1.address.city);
	}

	@Override
	public String toString() {
		return "StudentClass [rollNum=" + rollNum + ", stuName=" + stuName + ", address=" + address + "]";
	}
	

}

class Address {
	int streetNum;
	String city;
	String state;
	String country;

	public Address(int streetNum, String city, String state, String country) {
	
		this.streetNum = streetNum;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

	
}
