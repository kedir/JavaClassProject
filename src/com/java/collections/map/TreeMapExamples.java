package com.java.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExamples {
	
	public static void main(String[] args) {
		//TreeMapExamples obj = new TreeMapExamples();
		//obj.treemapInfo();
		treemapInfo();
		getTheColor();
		subMap();
		
	}
	
	public static void treemapInfo() {
		
		
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(23, "Data23");
		tmap.put(3, "Data3");
		tmap.put(34, "Data2");
		tmap.put(67, "Data34");
		tmap.put(98, "Data67");
//		System.out.println(tmap.keySet());
//		System.out.println(tmap.values());
		
		Set set = tmap.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
       Map.Entry entry = (Entry)it.next();
       System.out.println("key is: "+entry.getKey()+""+"Value is: "+entry.getValue());

		
		}
		
		
	}
	
	public static void getTheColor() {
		
		
		TreeMap<String,String>tree_map1=new TreeMap<String,String>();
		
		tree_map1.put("C1", "Red");
		tree_map1.put("C2", "Green");
		tree_map1.put("C3", "Black");
		tree_map1.put("C4", "White");
		
		//Set<String> set=tree_map1.keySet();
		
		
		System.out.println("Greatest Key"+tree_map1.firstKey());
		System.out.println("Least Key"+tree_map1.lastKey());
		System.out.println("Highest Key"+tree_map1.higherKey(""));
		//System.out.println(set);

	
		if(tree_map1.containsValue("Green")){
			System.out.println("The system contains value Green");
		}
		else {
			System.out.println("The system doesn't contains  Green");
		}
		if (tree_map1.containsValue("pink")){
			System.out.println("The system contains value pink");
		}else {
			System.out.println("The system doesn't contains  pink");
		}

		
		
	}
	public static void subMap() {
		
		TreeMap<Integer,String>tree_map=new TreeMap<Integer,String>();
		SortedMap<Integer,String>sub_tree_map=new TreeMap<Integer,String>();
		
		tree_map.put(10, "Red");
		tree_map.put(20, "Green");
		tree_map.put(40, "Black");
		tree_map.put(50, "White");
		tree_map.put(60, "pink");

		System.out.println("orginal Treemap content"+tree_map);
		sub_tree_map=tree_map.subMap(20,true,40,true);
		System.out.println("orginal sub tree map content"+sub_tree_map);
		
		System.out.println("keys greater than or equal to 20"+tree_map.ceilingKey(20));
		
		

	}

}
