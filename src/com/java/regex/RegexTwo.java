package com.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTwo {

	
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("teSt12");
		names.add("Test123@");
		names.add("test123-");
		
		
		//Here in pattern class we define the pattern to accept what kind of password from the user
		// it accept only small and capital letter and number 
		String regex = "^[a-zA-Z0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		
		for(String name:names) {
			Matcher matcher = pattern.matcher(name);
			//System.err.println(matcher.matches());//only print out the errro
			System.out.println(matcher.matches());//only print out the errro

		}
		
	}
}
