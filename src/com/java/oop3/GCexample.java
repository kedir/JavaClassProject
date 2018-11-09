package com.java.oop3;

public class GCexample {
	
	final int num = 10;
	static int numOne = 12;
	
	
	
	public static void main(String[] args) {
		
		
		numOne = 24;
		GCexample obj = new GCexample();
		obj = null;
		
		GCexample a = new GCexample();
		GCexample b = new GCexample();
		a = b;
		
		System.gc();
		
		a = null;
	}
	
	protected void finalize() throws Throwable{
		System.out.println("system GC the object");
		
	}

}
