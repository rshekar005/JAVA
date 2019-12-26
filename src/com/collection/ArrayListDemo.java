package com.collection;

import java.util.ArrayList;

/**
 * 
 * @author Shekhar
 * Collection is an interface. It is used when objects are growable in nature.It is used to represent a group of individual as a single entity.
 * For memory point of view collections are recommended because size is growable in nature.
 * For retrieval purpose, Arrays are recomended because of limited size.
 * 
 * List:
 * ===============
 * List is a child interface of collection.
 * If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion is preserved then we should go for list interface.
 * Datastructure is Resizable Array or Growable Array.
 * For Retrieval purpose ArrayList is recommended.
 * For Insertion or deletion purpose ArrayList is not recommended because it requires several shift operations. 
 * Objects in ArrayList is not safe as multiple threads executes simultaneously at a time. Hence objects in ArrayList is not thread-safe and it is synchronization.
 * Non-Synchroniztion -- Multiple Threads can access at a same time. Hence synchronization is not thread-safe.Performance is high.
 * All methods are non-synschronized.
 */
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(null);
		System.out.println(al);
		
		//Removing element from 0th index
		al.remove(0);
		System.out.println(al);
		//Adding element to 0th index
		al.add(0, 10);
		System.out.println(al);
		
       
	}

}
