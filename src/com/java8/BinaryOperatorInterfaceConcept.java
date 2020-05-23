package com.java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// Represents an operation upon two operands of the same type, producing
				// a result of the same type as the operands. This is a specialization
				// of BiFunction for the case where the operands
				// and the result are all of the same type.
		//Binary means two operators
	
		BinaryOperator<Integer> b= (x1,x2) -> x1+x2;
		System.out.println(b.apply(10, 20));
		
		BiFunction<Integer, Integer, Integer> b2= (x1,x2) -> x1+x2;
		System.out.println(b2.apply(10, 60));

	}

}
