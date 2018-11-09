package com.java.regex;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexThree {

	
	public static void main(String[] args) {
		
		List<String> emails = new ArrayList();
		List<String> credit = new ArrayList();
		
		emails.add("user@domain.com");	
		emails.add("user@domain.co.in");
		emails.add("user1/@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user#@domain.com");
		emails.add("user@domain.com");
		
		credit.add("1444222244446666");
		credit.add("xxxx-xxxx-xxxx-xxxx");
		


		//invalid emails
		emails.add("user#domain.com");	
		emails.add("@domain.com");	
		
		String regex ="^(.+)@(.+)$";
		String reString = "^[A-Za-z0-9+_.-]+@(.+)$";
		String regcr = "^4[0-9]{16}$";
		
		Pattern pattern = Pattern.compile(regex);
		Pattern pattern1 = Pattern.compile(reString);
		Pattern pattern2 = Pattern.compile(regcr);
		
		for(String crdit:credit) {
			//Matcher matcher = pattern.matcher(email);
			//Matcher matcher1 = pattern1.matcher(email);
			Matcher matcher2 = pattern2.matcher(crdit);
			
			//System.err.println(matcher.matches());//only print out the errro
			//System.out.println(email+matcher.matches());//only print out the errro
			//System.out.println(email+matcher1.matches());//only print out the errro
			System.out.println(crdit+matcher2.matches());//only print out the errro

		}
		
		
		
	}
}
