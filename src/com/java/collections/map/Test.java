package com.java.collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
//Hashmap is non synchronized.Hashtable is synchronized
//hashmap allows one null key and multiple null values.hashtable doesn't allow any null key or value.
// hashmap is fast . hashtable is slow due to added synchronization.
//hash map is traversed by aterator.hash table is traversed by aterator and enumerator.
//Iterator in hashmap is fail-fast

public class Test {

	public static void main(String[] args) {
		
		Map<Integer,String> htable = new Hashtable<>();
		htable.put(1, "A");
		htable.put(2, "B");
		htable.put(3, "C");
		System.out.println(htable);
		System.out.println(htable.get(1));
		
		Iterator<Integer> itr = htable.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = htable.get(key);
			
			if(key==2 || key==1)
			System.out.println(" key: "+key+" value: "+value);
			
			
		}

		//Q: So Mr.Hash Map, 
		//how can I find if a particular key has been assigned to you?
		
		System.out.println(htable.containsKey(2));
		
		
		//Q: How do I find all the available keys that are present on the Map?
		
		System.out.println(htable.keySet());
		//Q: How do I find all the available values that are present on the Map?
		
		System.out.println(htable.values());
		
		//Q: Suppose, I need to remove only a particular key from the Map, 
		//do I need to delete the entire Map?
		System.out.println(htable.remove(1));
		
		//How can we check if you actually contain some key-value pairs?
		System.out.println(htable.isEmpty());


		
	}
}
