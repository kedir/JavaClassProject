package com.java.oop3;

public class Demo implements MyInterface, myIntreface2 {

	@Override
	public void methodOne() {
		System.out.println("this is method one");

	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getNum() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		MyInterface obj = new Demo();

	}

	@Override
	public int methodOne(int num, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

interface myIntreface2 {
	void getNum();
}
