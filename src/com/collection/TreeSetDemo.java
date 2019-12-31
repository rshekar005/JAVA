package com.collection;

import java.util.TreeSet;

/**
 * 
 * @author Shekhar
 *  Tree Set -- Duplicates are not allowed.
 *           -- Insertion Order is based on Default Natural Sorting Order(Ascending Order) -- Comparable.
 *           -- Comparable is an interface.
 *           -- Comparable interface internally uses compareTo(). Based on the method objects will insert.
 *           -- Creates an empty treeset object when insertion order is D.N.S.O.
 *           -- Throws N.P.E when user tries to input null object
 */
public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet<String> treeset= new TreeSet<>();
		/*treeset.add(null);*/
		treeset.add("A");//Insert A
		treeset.add("a"); // a.compareTo(A) --> returns -ve becauase obj1(a) comes after obj2(A). ascii value of A is 65 and aci value of a is 97. 
		                  //65<97 it is +ve. So A will insert first based on ascending order.
		treeset.add("B");
		treeset.add("C");
		treeset.add("b");
		
		System.out.println(treeset);
	

	}

}
