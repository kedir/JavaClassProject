package com.java.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
Set<String> hset = new HashSet<>();
		
		hset.add("Red");	
		hset.add("Green");
		hset.add("Black");
		hset.add("White");
		hset.add("Pink");
		
//		String str="Green";
//		java.util.Iterator<String> it = hset.iterator();
//		while(it.hasNext()) {
//			if(it.next()==str) {
//			System.out.println("Color is present"+str);
//			break;
//			}
//			}
//		//System.out.println("Color isn't present"+str);
		
		if(hset.contains("Green")) {
			System.out.println("Color Green is present");
		}else {
			System.out.println("Color Green isn't present");

		}

		}
		
		
	

}
