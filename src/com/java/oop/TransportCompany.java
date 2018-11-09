package com.java.oop;

public class TransportCompany {
	public static void main(String[] args) {
		Driver obj = new Driver("Andy", "Ford", 1234);
		
	}
}

class CarClass {
	String carName;
	int carId;

	public CarClass(String carName, int carId) {
		super();
		this.carName = carName;
		this.carId = carId;
	}
}

class Driver extends CarClass {

	String driverName;

	public Driver(String driverName, String carName, int carId) {
		super(carName, carId);
		this.driverName = driverName;

	}

}
