package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
// Arraylist isnt give guaranted to display the element in sorted order.
//Linked list takere the order of element
public class ListClass {
	
	public static void main(String[] args) {
		
		List<Integer> listone = new ArrayList<>();
		listone.add(12);
		listone.add(14);
		listone.add(56);
		listone.add(76);

		System.out.println(listone);
        List<Integer> listTwo = new LinkedList<>(listone);
		System.out.println(listTwo);
		listTwo.add(34);
		System.out.println(listTwo);
		//Vector allows to read each trade one by time
		List<Integer>listThree = new Vector<Integer>(listTwo);
		System.out.println(listThree);
		
		
		




	}

}
