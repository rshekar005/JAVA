package com.collection.cursor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Shekhar
 * Iteration is one of the cursors in JAVA. Iteration can be used for any universal collection like Legacy classes(vector,stack, list,set and Map)
 * By using Iteration we can traverse objects in forward direction not in b-direction.
 * By using Iteration we can perform only Read and Remove options but not add, update etc.
 * 
 * hasNext() -- Returns a true value if the more number of elements are encountered during iteration.
 * next() -- Returns the next specified element during the iteration
 * remove() -- Removes the last element from the collection as provided by the iterator.
 * 
 * To Overcome above 2 limitations ListIterator is introduced.
 */
public class IterationDemo 
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> itr= al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println("After removing last elemet using remove() "+al);
	}

}
