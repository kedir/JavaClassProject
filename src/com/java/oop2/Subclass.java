package com.java.oop2;

public class Subclass extends ParentClass {

	public Subclass() {
		super();
		System.out.println("This is contructor of sub class");
	}

	public Subclass(int num) {
		super(10);
		System.out.println("Sub class " + num);

	}

	void display() {
		super.display();
		System.out.println("this is method from sub class");
	}

	public static void main(String[] args) {

		Subclass obj = new Subclass();
		obj.display();
		Subclass obj2 = new Subclass(10);
		obj2.display();
		obj2.getAll();
	}

}

class ParentClass {

	ParentClass() {
		System.out.println("This is contrsuctor of perent class");
	}

	ParentClass(int num) {
		System.out.println("Super class " + num);
	}

	void display() {
			System.out.println("This is method from parent class");
	}
	
	void getAll() {
		System.out.println("This is get all");
	}

}
