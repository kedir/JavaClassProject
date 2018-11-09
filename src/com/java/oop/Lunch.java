package com.java.oop;

public class Lunch {
	
	String salad;
	public String pitabread;
	String maincource;

	
	
	public Lunch(String salad, String pitabread, String maincource) {
	
		this.salad = salad;
		this.pitabread = pitabread;
		this.maincource = maincource;
	}
	
	
	
	public Lunch(String maincource) {
		super();
		this.maincource = maincource;
		System.out.println("The Lunch today is " + salad);
	}
	
	

	public Lunch(String salad, String pitabread) {
		super();
		this.salad = salad;
		this.pitabread = pitabread;
	}



	public  Lunch() {
		this.salad = "salata";
		this.pitabread = "dabo";
		System.out.println("Hello");
	}


	@Override
	public String toString() {
		return "Lunch [salad=" + salad + ", pitabread=" + pitabread + ", maincource=" + maincource + "]";
	}
	
	public static void main(String[] args)
	{
		Lunch obj = new Lunch("bread");
		//obj.toString();
				
	}
	
	

}
