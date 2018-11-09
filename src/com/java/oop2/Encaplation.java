package com.java.oop2;

public class Encaplation {

	private int num;
	private String str;
	private double d1;
	private long l1;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public double getD1() {
		return d1;
	}

	public void setD1(double d1) {
		this.d1 = d1;
	}

	public long getL1() {
		return l1;
	}

	public void setL1(long l1) {
		this.l1 = l1;
	}

}

class Child extends Encaplation {

	public void getOne() {
		Child c1 = new Child();
		c1.setNum(10);
		c1.getNum();

	}

}
