package com.java.exception;

public class TryCatchDemoOne {

	public static void main(String[] args) {
		demoOne();
		demoTwo();
		demoThree();

	}

	public static void demoOne() {
		int num1;
		int num2;

		try {
			String str = null;

			num1 = 0;
			num2 = 50 / num1;

		} catch (ArithmeticException e) {
			System.out.println("something went wrong!");
		} catch (NullPointerException e) {
			System.out.println("it's null pointer exceptions");
		}

		System.out.println("this is end of try-catch block");

	}

	public static void demoTwo() {

		try {
			int a[] = new int[5];
			a[40] = 30 / 2;
		}

		catch (ArithmeticException e) {
			System.out.println("this is Arithmatic exception");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("the value is out side of an array");

		} catch (Exception e) {
			System.out.println("something went wrong!");
		}

		System.out.println("Out of try catch block");

	}

	public static void demoThree() {
		try {
			int num = 120 /3;
			System.out.println(num);

		} catch (ArithmeticException e) {
			System.out.println("Math exceptions");

		} finally {
			System.out.println("this is finally block");

		}

	}

}
