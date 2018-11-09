package com.java.collections.set;

import java.time.LocalDate;
import java.util.*;

public class QueueExample {
   public static void main(String[] args) {
		
//	Queue<String> queue = new LinkedList<>();
//	queue.add("one");
//	queue.add("two");
//	queue.add("three");
//	queue.add("four");
//	System.out.println(queue);
//		
//	queue.remove("three");
//	System.out.println(queue);
//	System.out.println("Queue Size: " + queue.size());
//	System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));
//
//	// To empty the queue
//	queue.clear();
	   
	   PriorityQueue<Employee> queue = new PriorityQueue<>();
	   queue.add(new Employee(12L,"Steve",LocalDate.now()));
	   queue.add(new Employee(11L,"Mike",LocalDate.now()));
	   queue.add(new Employee(124L,"Paul",LocalDate.now()));

	   queue.add(new Employee(12L,"Smith",LocalDate.now()));
	   while(true)
	   {
		   Employee e = queue.poll();
		   System.out.println(e);
		   if(e==null)
			   break;
		   
	   }

	
	
   }
}