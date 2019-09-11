package com.collection;

import java.util.LinkedList;

/**
 * 
 * @author Shekhar
 * Underlying data structure of linked list is Double Linked list.
 * If we want to represent a group of elements as a single entity then we should go for list.
 * It is suitable when operation is insertion or deletion.
 * Duplicates are allowed.
 * Insertion order is preserved and null insertion is allowed.
 * worst choice if operation is retrieval.
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(100);
		ll.add("Shekar");
		ll.add(null);
		ll.add("Shekar");
		System.out.println(ll);
	    ll.set(1, "Raja");//set() replace the value of specified index with the new value.
	    System.out.println(ll);
	    ll.add(0, "Pillalamarri");// It adds element to the 0th index then previous value moved to next index i.e 1
	    System.out.println(ll);
	    
	    ll.remove(0);//It will remove the object which is in 0th index.
	    System.out.println(ll);
	    
	    ll.addLast("*&&*&&");//It will add extra object at last.
	    System.out.println(ll);
	    
	    ll.addFirst("djkjiuiw");//It will add object at first index.
	    System.out.println(ll);
	
        System.out.println(ll.get(4));// It will return object which present at 4th index.
        
        System.out.println(ll.getClass().getName()); //It will return the package of LinkedList
        
        LinkedListDemo demo = new LinkedListDemo();
        System.out.println(demo.getClass().getName()); // It will return the package of LinkedListDemo
       
        
	}

}
