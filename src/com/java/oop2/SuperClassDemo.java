package com.java.oop2;

public class SuperClassDemo  extends A{
	
	/*
	 what is super key word in java?
	 1. When you have super class and sub class and both class has same name of variable. if
	 	so when you use super key word it will refer to super class variable.
	 	
	 2. when you want to call explicitly super class constructor you need use word super.
	 
	 3. To access method from super class when child class has overridden the method.
	
	
	 */
	
	int num = 111;
	
	 void printNumber() {
		 System.out.println(num);
		 System.out.println(super.num);
	 }
	 
	 public static void main(String[] args) {
		SuperClassDemo obj = new SuperClassDemo();
		obj.printNumber();
	}

}

class A {
	
	int num = 100;
	
	
}


