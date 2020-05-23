package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {
	public static void main(String args[])
	{
		// Represents an operation on a single operand/argument that produces a result of
		// the same type as its operand. This is a specialization of Function
		// for the case
		// where the operand and result are of the same type.
		// Here x is in integer both of same type
		UnaryOperator<Integer> func= x -> x * 7;
		System.out.println(func.apply(10));
		
		Function<Integer, Integer> func2= x -> x*20;
		System.out.println(func2.apply(20));
		
		List<String> list= new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("javascript");
		
		//replaceall is unaryoperator holds a single operand
		list.replaceAll(ele -> ele + " Rajashekar");
		System.out.println(list);
	}
}
