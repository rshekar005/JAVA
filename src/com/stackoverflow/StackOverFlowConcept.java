package com.stackoverflow;

/**
 * Stack Over flow concept is based on stack memory allocation / deallocation
 * for methods Whereas heap memory is for object allocation.
 * 
 * Stack -- LIFO Stack Overflow is an error not an exception. When methods
 * allocated/deallocation is happened and memory is completely used then this
 * exception will occurs
 * 
 */
public class StackOverFlowConcept {

	public static void m1() {
		m2();
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		int i=10;
		System.out.println(i);
	}

	public static void main(String[] args) {
		m1();
	}

}
