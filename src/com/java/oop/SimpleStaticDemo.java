package com.java.oop;

public class SimpleStaticDemo {

	static int num;
	static String str;
	int number;

	/*
	 * Static Block 1 Static Block 2 Value of num: 98 Value of mystr: Block2
	 */
	static {
		System.out.println("Static Block 2");
		num = 98;
		str = "Block2";
		
	}
	static {
		System.out.println("Static Block 1");
		num = 12;
		str = "some value";
		
		SimpleStaticDemo demo = new SimpleStaticDemo();
		demo.number = 12;

	}

	public static void oneMethod() {
		System.out.println("this is static method");
		
	
	}

	public void secoundMethod() {
		System.out.println("this is non static method");
		number=10;
		
		//oneMethod();
	}

	public static void main(String[] args) {
		
		System.out.println(num);
		System.out.println(str);
		SimpleStaticDemo demo = new SimpleStaticDemo();
		demo.number = 12;
		demo.num = 13;
		SimpleStaticDemo.oneMethod();
		demo.secoundMethod();
		//oneMethod();
		SimpleStaticDemo.str ="Test";
	}

}
