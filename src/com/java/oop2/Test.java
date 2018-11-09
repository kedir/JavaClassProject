package com.java.oop2;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(findTheSmallest(24.99, 21.78, 74.98));
		System.out.println(findTheMiddle("CUTT1234"));
		System.out.println(count_Vowels("javafordeveloper"));
		
	}
	
	public static double findTheSmallest(double a, double b, double c) {
		
		return Math.min(Math.min(a, b),c);
		
	}
	
	public static String findTheMiddle(String str) {
		
		int position;
		int length;
		
		if (str.length() % 2 == 0) {
			position = str.length()/2 -1;
			length = 2;
		}
		else {
			position = str.length()/2;
			length = 1;
			
		}
		
		return str.substring(position, position + length);
		
		
	}
	
	public static int count_Vowels(String str) {
		
		int count = 0;
		for (int i = 0; i < str.length(); i ++ ) {
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'|| str.charAt(i) == 'u') {
				count++;
			}
			
		}
		
		return count;
	}

}
