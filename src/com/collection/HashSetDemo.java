package com.collection;

import java.util.HashSet;
import java.util.ListIterator;

/**
 * 
 * @author Shekhar
 * Set -- it is an Inteface
 *     -- Insertion order is not preserved.
 *     -- If we want to represent a group of objects as a single entity where insertion order is not preserved then we should go for Set.
 *     -- Duplicates are not allowed.
 *     -- Underlying data structure is Has table"
 *     -- Insertion will happen based on hashing.
 *     -- Null insertion is possible only once because fuplicate values are not allowed.
 *     -- when we add duplicate objects it won't throw C.E and R.E add() simply returns false
 *     
 *
 */
public class HashSetDemo {

	public static void main(String[] args)
	{
		HashSet<String> hashset= new HashSet<>();
		hashset.add("Rajashekar");
		hashset.add("Rajashekar");//It will not throw any compile time or runtime error.
		System.out.println(hashset);
		hashset.add("Pillalamarri");
		hashset.add("shekar");
		hashset.add("sdsd");
		hashset.add("Nishant");
		System.out.println(hashset);//Insertion order is not preserved.
	}

}
