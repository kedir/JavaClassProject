package com.java.collection;

import java.util.Arrays;
import java.util.LinkedList;
//import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		String[] str = {"A","B","c","D"};
		System.out.println(Arrays.toString(str));		
		//System.out.println(str);		

		LinkedList<String> linkedlist = new LinkedList<>(Arrays.asList(str));
		System.out.println(linkedlist);		
	}

}
