package com.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 
 * @author rajasekhar
 * Similar to hash map but it contains only unique elements. No null key and Null values
 * Hash Table is synchronized. Thread Safe
 * Multiple threads cannot access same object at a time.
 * Second thread wait for a thread 1 to complete task.(one by one)
 * Stores values on the basis of key value pairs.
 * Stores values on the basis of hashcode where as hash map not
 * key --Key will store has an object -- It will store on basis of Hashing(hashcode).
 * 
 * Hashcode -- 
 * Class object is created (Test t1= new Test). for this object JVM will give a hashcode number of 32 bit integer.
 * hashcode is a unique number.
 * 
 * To increase the performance hashmap is recommended.
 * 
 */
public class HashTableDemo {

	public static void main(String[] args) {
	
		Hashtable h1= new Hashtable<>();
		h1.put(1, "Raja");
		h1.put(2, "Shekar");
		h1.put(3, "Shiva");
		//h1.put(null,  null);//It gives null pointer exception
		h1.put(null,"values");//It gives null pointer exception
		
		Hashtable h2= new Hashtable<>();
		h2=(Hashtable<Integer, String>) h1.clone();// Cloning(Duplicate) means storing h1 objects in h2
		
		System.out.println("Values from h1 "+h1);
		System.out.println("Values from h1 "+h2);
		
		h1.clear(); //here h1 objects are removing but h2 will print h1 objects
		System.out.println("Values from h1 "+h1);
		System.out.println("Values from h1 "+h2);
		
		
		Hashtable h3= new Hashtable<>();
		h3.put("A", "Naveen");
		h3.put("B", "Manager");
		
		if(h3.contains("Naveen"))
		{
			System.out.println("Value is found");
		}
		
		//print all the value. Here concept used in enumeration.
		Enumeration e=h3.elements();
			System.out.println("Print values from h3");
			while(e.hasMoreElements())
			{
				System.out.println(e.nextElement());
			}
			
			//get value from key
			System.out.println(h3.get("B"));
			
			//get hascode value
			System.out.println("Hascode of h3 object is "+h3.hashCode());
	}

}
