
 package com.java.oop;

public class Sample {
	
	public static void main(String[] args) {
		
		Constructors cont = new Constructors();
		cont.getAll();
		cont.numOne = 10;
		cont.str = "test";
		
		
		
		Constructors cont1 = new Constructors(12, 13, "test");
		cont1.numOne = 12;
		cont1.getAll();
		
		HelloContructors hs = new HelloContructors("test");
		System.out.println(hs.toString());
		
		
		
		Lunch ln1 = new Lunch("csalad", "brown", "soup");
		System.out.println(ln1);
		
		
	}

}
