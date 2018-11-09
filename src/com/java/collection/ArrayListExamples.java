package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
//import java.util.Collections.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		System.out.println(names);
		names.add("Alex");
		names.add(0,"Josh");
		names.add("kedir");
		names.add(1, "Hedra");
		
		System.out.println("Names after adding"+names);
		System.out.println(names.get(1));

    	//names.remove("Alex");
    	// or you can specify the position of index
    	//names.remove(0);
		//System.out.print("After remove method"+names);
    	names.set(0, "Brian");
		System.out.println(names);
		List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//		
//		// interms of performance iterator is better than all loops.also interms of memory
		java.util.Iterator<Integer> it = numbers1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		
		List<String>newNames = new ArrayList<>();
		newNames.add("Steve");
		newNames.addAll(names);
		System.out.print(newNames);
//		
		newNames.clear();
		System.out.println(newNames);
//		
		ArrayList<String> arrayListObject = new ArrayList<>();
		arrayListObject.add("A");
		arrayListObject.add("B");
		arrayListObject.add("C");
		arrayListObject.add("D");
//		
		System.out.println(arrayListObject);
//		
//		
		ArrayList<String> arrayListClone =  (ArrayList<String>)arrayListObject.clone();
//		
		System.out.println(arrayListClone.contains("A"));
		System.out.println(arrayListClone.contains("E"));
//		
		System.out.println(arrayListClone.indexOf("A")>2);
		
//		
		ArrayList<String>listOne = new ArrayList<>(Arrays.asList("a","b","c","d","f","z"));
		ArrayList<String>listTwo = new ArrayList<>(Arrays.asList("a","b","c","e","d"));
//
//		
		java.util.Collections.sort(listOne);
		java.util.Collections.sort(listTwo);
//
		boolean isEqual = listOne.equals(listTwo);
//		
		System.out.println(isEqual);
//		
		//listOne.removeAll(listTwo);
		System.out.println(listOne);
//		
		listTwo.retainAll(listOne);
		System.out.println(listTwo);
//		
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,6,6,6));
//
		ArrayList<Integer> SubListOfNumberList = new ArrayList<>(numberList.subList(3, 8));
		System.out.println(SubListOfNumberList);
//
		LinkedHashSet<Integer> hset = new LinkedHashSet<>(numberList);
		System.out.println(hset);
		
		
		

	}

}
