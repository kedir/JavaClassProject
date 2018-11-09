package com.java.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public  class  Products<L1,L2> {
	
	L1 itemOne;
	L2 itemTwo;
	public Products(L1 itemOne, L2 itemTwo) {
		super();
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
	}
	public Products() {
		// TODO Auto-generated constructor stub
	}
	public L1 getItemOne() {
		return itemOne;
	}
	public void setItemOne(L1 itemOne) {
		this.itemOne = itemOne;
	}
	public L2 getItemTwo() {
		return itemTwo;
	}
	public void setItemTwo(L2 itemTwo) {
		this.itemTwo = itemTwo;
	}
	@Override
	public String toString() {
		return "Products [itemOne=" + itemOne + ", itemTwo=" + itemTwo + "]";
	}
	
	public static void main(String[] args) {
//		ArrayList<String> fruit = new ArrayList<String>();
//		ArrayList<String> beverage = new ArrayList<String>();
//	
//		
//		fruit.add("Apple");
//		fruit.add("Mango");
//		fruit.add("Orange");
//		fruit.add("Grapes");
//		
//		beverage.add("water");
//		beverage.add("softdrink");
//		beverage.add("coffee");
//		
//		Products proOne = new Products(fruit,beverage);
//		proOne.setItemOne(fruit);
//		proOne.setItemTwo(beverage);
//		System.out.println("The first product is"+ proOne.getItemOne());
//  	System.out.println("The Second product is"+ proOne.getItemTwo());
		
		Products<String,String> listOfProduct = new Products<String,String>();
		listOfProduct.setItemOne("Google phone");
		listOfProduct.setItemTwo("Mobile phone");
		
		System.out.println(listOfProduct.getItemOne());
		System.out.println(listOfProduct.getItemTwo());
		Products<Integer,Integer> listOfProductNum = new Products<Integer,Integer>();

		listOfProductNum.setItemOne(23);
		listOfProductNum.setItemTwo(40);
		
		System.out.println(listOfProductNum.getItemOne());
		System.out.println(listOfProductNum.getItemTwo());
		getUnionOfSetValues();
	}
		
		
		private static <E> Set<E> unionOfSets(Set<E> mySetOne,Set<E> mySetTwo)
		{
			Set<E>resultSet = new TreeSet<>();
			resultSet.addAll(mySetOne);
			resultSet.addAll(mySetTwo);

			return resultSet;
		}
		
		public static void getUnionOfSetValues() {
			Set<String> mySet1 = new HashSet<>();
			mySet1.add("DC");
			mySet1.add("VA");
			mySet1.add("MD");
			
			Set<String> mySet2 = new TreeSet<>();
			
			mySet2.add("DC");
			mySet2.add("VA");
			mySet2.add("PA");
			mySet2.add("MD");


			Set<String> reSet = unionOfSets(mySet1,mySet2);
			System.out.println(reSet);
		}
	}




