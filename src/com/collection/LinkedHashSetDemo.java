package com.collection;

import java.util.LinkedHashSet;

/**
 * 
 * @author Shekhar
 *  
 *  Linked Hash Set -- It is a child inteface of Set.
 *                  --  Underlying data structure is linked list and Hash table.
 *                  -- Insertion is preserved where as in HashSet insertion order is not preserved.
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lh= new LinkedHashSet<>();
		lh.add("S");
		lh.add("h");
		lh.add("e");
		lh.add("k");
		lh.add("a");
		lh.add("r");
		
		System.out.println(lh);
		

	}

}
