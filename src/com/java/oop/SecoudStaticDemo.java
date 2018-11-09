package com.java.oop;

public class SecoudStaticDemo {
	
	static int i = 120;
	static String book  = "java class";
	
	long l1;
	
	static void disply() {
		System.out.println(i);
		System.out.println(book);
	}
	
	void function() {
		disply();
	}
	
	public static void main(String[] args) {
		SecoudStaticDemo st = new SecoudStaticDemo();
		st.function();
		// static method directly call without creating object.
		disply();
		
	}

}
