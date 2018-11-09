package com.java.oop2;

public class ExampleOfEnscapulation  extends GetterSetter{
	
	public static void main(String[] args) {
		ExampleOfEnscapulation obj = new ExampleOfEnscapulation();
		obj.setNum(10);
		System.out.println(obj.getNum());
		obj.setNum(15);
		System.out.println(obj.getNum());
		
		ExampleOfEnscapulation obj1 = new ExampleOfEnscapulation();
		obj1.setNum(20);
		System.out.println(obj1.getNum());
		
	}
	

}

class GetterSetter{
	
	private int num = 50;
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
	@Override
	public String toString() {
		return "GetterSetter [num=" + num + ", str=" + str + ", d1=" + d1 + ", l1=" + l1 + "]";
	}
	
	
	
}
