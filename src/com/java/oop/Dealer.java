package com.java.oop;

public class Dealer {
	public static void main(String[] args) {
		CRV crv = new CRV(4, "blue", "v6", "exl");
		System.out.println(crv);
		
	}
}

class Car {
	int wheels;
	String color;
	String engineType;
	String model;

	void run(int wheels, String color, String engineType, String model) {
		//super();
		System.out.println("driving");
	}

	public Car(int wheels, String color, String engineType, String model) {
		super();
		this.wheels = wheels;
		this.color = color;
		this.engineType = engineType;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", color=" + color + ", engineType=" + engineType + ", model=" + model + "]";
	}
}

class CRV extends Car {

	public CRV(int wheels, String color, String engineType, String model) {
		super(wheels, color, engineType, model);

	}
	void run() {
		//super(wheels, color, engineType, model);
	}

}
