package com.java.oop3;

import com.java.oop2.Encaplation;
import com.java.oop2.SuperClassDemo;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("Dog sound");

	}

	@Override
	public void move() {
		System.out.println("Dog move");

	}

	@Override
	public void eat() {
		System.out.println("Dog eat");

	}
	
	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.eat();
		obj.move();
		
		Encaplation e1 =new Encaplation();
		SuperClassDemo s1 = new SuperClassDemo();
	}

}

class cat extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Animal {
	
	

	// we can not create and instance of an abstract class.
	// you can not provide body of the method in abstract class.
	// In abstract class you can declare method as abstract method as well.
	// you can create normal method with body in abstract class.

	public abstract void sound();

	public abstract void move();

	public abstract void eat();

	public void getInfo(int num, int num2) {
		System.out.println(num + num2);
	}

	public static void getName(String name) {

	}

}
