package com.java.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IterateHashSet {
	public static void main(String[] args) {
		Set<String> hset = new HashSet<>();
		
		hset.add("Kedir");	
		hset.add("Kedir");
		hset.add("Sam");
		hset.add("Rick");
		hset.add("Tim");
		
		// use iterator and for each loop and print every element
		// it isn't preserve order
		java.util.Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

//		for(String str:hset) {
//			System.out.println(str);
//		}
		
		//
		
		Set<String> tset = new TreeSet<>(hset);
		System.out.println("Sorted"+tset);

	}

}
