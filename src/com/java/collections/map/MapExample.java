package com.java.collections.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		
		Map<Integer,String> hmap = new HashMap<>();
		hmap.put(120, "Test121");
		hmap.put(121, "Test121");

		hmap.put(349, "Test349");

		System.out.println(hmap);
		System.out.println(hmap.get(349));
		System.out.println(hmap.remove(120));
		System.out.println(hmap);
		
		Iterator<Integer> itr = hmap.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = hmap.get(key);
			System.out.println("This is key"+key+"This is value"+value);
			
		}
		
		Iterator<java.util.Map.Entry<Integer, String>> itr1 = hmap.entrySet().iterator();
		while(itr1.hasNext())
		{
			
			
			
			
		java.util.Map.Entry<Integer, String> en=itr1.next();
		System.out.println("This is key"+en.getKey()+"This is value"+en.getValue());
		}
		
		
		

	}

}