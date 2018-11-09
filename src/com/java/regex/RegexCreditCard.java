package com.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCreditCard {
	
	/*
	 * The format for each company is:

  Visa : 13 or 16 digits, starting with 4.
MasterCard : 16 digits, starting with 51 through 55.
Discover : 16 digits, starting with 6011 or 65.
American Express : 15 digits, starting with 34 or 37.
Diners Club : 14 digits, starting with 300 through 305, 36, or 38.
JCB : 15 digits, starting with 2131 or 1800, or 16 digits starting with 35.
	 */
	public static void main(String[] args) {
		String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" +
		        "(?<mastercard>5[1-5][0-9]{14})|" +
		        "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" +
		        "(?<amex>3[47][0-9]{13})|" +
		        "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" +
		        "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";
		
		List<String> cards =new ArrayList<>();
		cards.add("2345-986-9870-0779");
		cards.add("3434-5678901-2345");
		
		Pattern pattern = Pattern.compile(regex);
		for(String card:cards) {
			card=card.replaceAll("-", "");
			Matcher matcher = pattern.matcher(card);
			System.out.println(card+""+matcher.matches());
		}

	}

}
