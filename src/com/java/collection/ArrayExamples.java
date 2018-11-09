package com.java.collection;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ArrayExamples {
	public static void main(String[] args) {
		
		String array[]=new String[] {"First","Second"};
		System.out.println(Arrays.toString(array));
		
		
		String[] arr1=new String[] {"Fifth","six"};
		String[] arr2=new String[] {"seven","eight"};
//		To declare 2 dimensional array or a matrix
		String[][]arrayofArray = new String[][] {arr1,arr2};
//		
		System.out.println(Arrays.toString(arrayofArray));
		System.out.println(Arrays.deepToString(arrayofArray[1]));
		System.out.println(Arrays.deepToString(arrayofArray));

//		To copy one variable to other we use clone method
		String[] names = {"Alex","Brain","Kedir"};
		String[] cloneofnames=names.clone();
		System.out.println(Arrays.toString(cloneofnames));
		String[] copyOfNames = Arrays.copyOf(names, names.length);
		String[] partialNames = Arrays.copyOfRange(names, 0,2);
		System.out.println(Arrays.toString(copyOfNames));
		System.out.println(Arrays.toString(partialNames));
//		
		String str = "How to code in java";
		String[] words = null;
		words= str.split(",");
		Pattern pattern = Pattern.compile("");
		words=pattern.split(str);
		System.out.println(Arrays.toString(words));
//		//don't 
		String newStr = String.join("", words);
		System.out.println(newStr);
//		
		String strOne = "alex,brian,charles,david";
		String[] word = null;
		//word= strOne.split(",");
		Pattern pattern1 = Pattern.compile(",");
		word=pattern1.split(strOne);
		System.out.println(Arrays.toString(word));

		
	}

}
