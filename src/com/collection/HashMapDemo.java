package com.collection;


import java.util.HashMap;
import java.util.Map.Entry;

/**
 * It Stores key value pairs.
 * key contains unique elements and values can be duplicate.
 * Insertion is preserved based on hashing technology.It maintains no order.
 * Only one null key and multiple null values.
 * It is non-synchronized -- Not thread Safe --Multiple threads can be accessed simultaneously. It is very fast.
 * It makes some issues for an example Single object is accessing by multiple threads. 
 * Suppose Thread 1 updating one value in an object and Thread t2 trying to access old value then it will throw concurrent exception(fail fast).
 * In Order to avoid above case then concurrent hash map is used.
 */
public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplte");
		
		System.out.println(hm);
		
		System.out.println(hm.get(4)); // here it will not print any error instead it will throw null
		System.out.println(hm.get(1));
		
		for(Entry e: hm.entrySet())// Iterate and print both keys and values
		{
			System.out.println(e.getKey()+ "  "+e.getValue());
		}
 
		hm.remove(3); // It removes 3rd index row
		System.out.println(hm);
		
		Employee emp= new Employee("Raja", "PTC");
		Employee emp2 = new Employee("Dwaraka", "Sec");
		Employee emp3 = new Employee("Shiva", "Gachibowli");
		
		HashMap<Integer, Employee> hmemp= new HashMap<>();
		hmemp.put(1, emp);
		hmemp.put(2, emp2);
		hmemp.put(3, emp3);
		System.out.println(hmemp);
		
	}

}
