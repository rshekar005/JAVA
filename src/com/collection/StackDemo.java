package com.collection;
/**
 * Stack is a child class of Vector.
 * Concept -- Last In First Out(LIFO)
 * push -- insertion, pop -- removal , peek -- top
 */
import java.util.Stack;

public class StackDemo 
{
	public static void main(String args[])
	{
		Stack<String> s= new Stack<>();
		s.push("z");
		s.push("A");
		s.push("B");
		s.push("c");
		s.push("A");
		
		System.out.println(s.capacity());
		System.out.println(s);
		System.out.println(s.search("c"));//It will search from top.
		System.out.println(s.peek());
	}

}
