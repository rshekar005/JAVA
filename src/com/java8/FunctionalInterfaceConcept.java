package com.java8;

import java.util.function.Function;

/**
 * 
 * @author rajasekhar
 *	/**
		 * Interface Function<T,R> Type Parameters: 
		 * T - the type of the input to
		 * the function R - the type of the result of the function
		 */

public class FunctionalInterfaceConcept {
	
	public static void main(String args[])
	{
		//Here Function is an interface and hold two parameters.
		//Example : here String(T) is an input paramete
		//Integer(R) is the result of the function.
		//apply is the method which present in function interface
		//Here x is nothing but a String input and x.length is result in integer
		
		
		Function<String, Integer> func= x -> x.length();
		int result=func.apply("This is Rajashekar and i am learning java 8");
		
		System.out.println(result);
		
		//Chaining function
		
		//Here x holds a integer value and that value takes from func
		//apply method below will return lenght of the string (func) and it is will multiply with 2(func2)
		Function<Integer, Integer> func2 = x -> x*2;
		int result2=func.andThen(func2).apply("This is Rajashekar");
		System.out.println(result2);
		
	}

}
