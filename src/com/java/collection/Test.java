package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
	
	public static void main(String[] args) {
		//List<String> linkedOne = new ArrayList<>();
		LinkedList<String> linkedlist = new LinkedList<>();
		
		linkedlist.add("A");
		linkedlist.add("B");
		linkedlist.add("C");
		linkedlist.add("D");
		
		System.out.println(linkedlist);
		//Add element at specified position
		
		linkedlist.remove("A");// removes A
		linkedlist.remove(0);// removes B
		
		System.out.println(linkedlist);
		
		//Iterate
		
		ListIterator<String> iterator = linkedlist.listIterator();
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }

		
		
	}

}
