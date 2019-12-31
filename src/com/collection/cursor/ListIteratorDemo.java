package com.collection.cursor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * @author Shekhar
 * 
 * ListIterator is a child interface of Iterator.
 * Using ListIterator we can traverse objects in both the directions(forward and backward).
 * Using ListIterator we can add, replace a object along with read and remove operations.
 * Among these three cursors, list iterator is more powerfull and it is applicable for only list.
 *
 */
public class ListIteratorDemo {

	public static void main(String[] args) 
	{
		LinkedList<String> al = new LinkedList<>();
		al.add("raja");
		al.add("shekar");
		al.add("manoj");
		al.add("Sai");
		al.add("Amar");
		al.add("velma");
		
		System.out.println("Before Iterating "+al);
		
		ListIterator<String> ll= al.listIterator();
		
		System.out.println("Traversing on forward direction");
		while(ll.hasNext())
		{
			System.out.println(ll.next());
		}
		
		System.out.println("Traversing in backward direction");
		while(ll.hasPrevious())
		{
			System.out.println(ll.previous());
		}
		
		


	}

}
