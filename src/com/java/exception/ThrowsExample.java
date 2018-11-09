package com.java.exception;

import java.io.IOException;

public class ThrowsExample {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ThrowsDemo obj = new ThrowsDemo();
	 obj.myMethod(10);
		
	}
	

}

class ThrowsDemo{
	void myMethod(int num)throws IOException,ClassNotFoundException {
		if(num==1)
	        throw new IOException("IOException Occurred");
	     else
	        throw new ClassNotFoundException("ClassNotFoundException");
		
	}

}
