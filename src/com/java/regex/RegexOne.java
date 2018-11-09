package com.java.regex;

import java.util.regex.Pattern;

public class RegexOne {


public static void main(String[] args) {
	
	String content = "This is java book"+"this is not javabook";
	String pattern =".*book.*";
	
	boolean isMatch = Pattern.matches(pattern, content);
	System.out.println(isMatch);
	
	String str = "This is java tutorial class and demo Tutorial";
	String patternStr=".*tuToRial.";
	
	
//	Pattern pattern2=Pattern.compile(patternStr,Pattern.CASE_INSENSITIVE);
//	boolean match = pattern2.matcher(patternStr);
//	System.out.println(pattern2);

	
	
}


}
