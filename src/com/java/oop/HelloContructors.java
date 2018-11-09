package com.java.oop;

public class HelloContructors {
	
	String name;
	//static int x;

	public HelloContructors() {
		super();
	}

	public HelloContructors(String foo) {
		name=foo;
	
		System.out.println(foo);
	}

	@Override
	public String toString() {
		return "HelloContructors [name=" + name + "]";
	}
	
	

}
