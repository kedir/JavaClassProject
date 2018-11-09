package com.java.collections.set;

import java.util.HashMap;
import java.util.Map;

//Following are few key points to note about HashMaps in Java -
//
//A HashMap cannot contain duplicate keys.
//
//Java HashMap allows null values and the null key.
//
//HashMap is an unordered collection. It does not guarantee any specific order of the elements.
//
//Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap.
//
public class CreateHashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put(null, 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);
    }
}

