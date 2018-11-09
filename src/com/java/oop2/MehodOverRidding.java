package com.java.oop2;

public class MehodOverRidding extends ABC {
	
	/*
	1. Method Overriding only happens in another class
	2. Override method can be more limited then super class.
	 */

	public void getInfo() {
	
		System.out.println("This is get info method from sub class");
	}

	void newMethod() {
		super.getInfo();
		System.out.println("this is new method");
	}
	
	public static void main(String[] args) {
		MehodOverRidding obj = new MehodOverRidding();
		obj.getInfo();
		obj.newMethod();
		
		ABC obj2 = new MehodOverRidding();
		obj2.getInfo();
		
		ABC obj3 = new ABC();
		obj3.getInfo();
	}

}

class ABC {

	 public void getInfo() {
		System.out.println("This is get info method from super class");
	}

}
