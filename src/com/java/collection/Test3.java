package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
//		List<String> listone = new ArrayList<>();
//		
//		listone.add("A");
//		listone.add("C");
//		listone.add("B");
//		listone.add("D");
	//	System.out.println(listone);
		List<String> strList = new LinkedList<>(Arrays.asList("A","C","B","D"));
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		Collections.sort(strList, Collections.reverseOrder());
		//Collections.reverse(strList);
		System.out.println(strList);

//		listone.remove("B");
//		System.out.println(listone);
//		listone.add(1, "B");
//		//listone.add(2, "c");
//		System.out.println(listone);
//		
	}

}
