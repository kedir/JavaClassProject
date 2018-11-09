package com.java.oop2;

public class MethodOverLoading {
	
	/*
	 * Method with same name and different parameters called method overloading
	 * Method Overloading only happens with same class
	 * 
	 */

	public void display() {
		System.out.println("this method with no args");
	}

	public void display(String str) {
		System.out.println("this method has one arg" + str);
	}

	public void display(String str, int num) {
		System.out.println("this method has two args " + str + " " + num);

	}

	public String display(String str, String str1) {
		System.out.println(str + " " + str1);
		return str1 +str;

	}
	
	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.display();
		obj.display("Test");
		obj.display("Test One", 10);
		obj.display("Test", "test");
	}

}
