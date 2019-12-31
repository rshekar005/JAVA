package com.collection.cursor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * @author Shekhar
 * Cursor -- If we want retrieve objects one by one then cursor concept was introduced.
 * Three types of cursor
 *   1. Enumeration
 *   2. Iterator
 *   3. ListIterator
 * 
 * Enumeration -- It is application only for legacy classes like vector,stack etc.
 *             -- Using Enumeration we can do only read operations.
 *             -- Enumeration is not applicable for universal interfaces/classes.
 *             -- Enumaration traverse objects in forward direction
 */
public class EnumerationDemo {

	public static void main(String[] args) 
	{
       Vector<Integer> v = new Vector<>();
       for(int i=0;i<=10;i++)
       {
    	   v.addElement(i);
       }
       System.out.println("With Out enumeration is "+v);
       Enumeration<Integer> e= v.elements();
       while(e.hasMoreElements())
       {
    	   System.out.println(e.nextElement());
    	   
       }
       
       
       
       
       

	}

}
