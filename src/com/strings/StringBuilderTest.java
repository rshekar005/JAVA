package com.strings;
/**
 * 
 *
 * @author Shekhar
 * String Builder -- StringBuilder is same as StringBuffer but it is non-synchronized that is multiple threads will execute simultaneously.
 * It is not thread-safe.
 * 
 * Main Difference btn StringBuffer & StringBuilder as follows.
 * 
 * StringBuffer -- It is a class. StringBuffer is mutable in nature (It can be modified).
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. It is synchronized.
 * So it is safe and will result in an order.
 * 
 * String Builder -- StringBuilder is same as StringBuffer but it is non-synchronized that is multiple threads will execute simultaneously.
 * It is not thread-safe. Order may varies.
 * 
 * StringBuilder is more efficient than StringBuffer it means Performance wise StringBuilder is good.
 * 
 * 
 */
public class StringBuilderTest {

	public static void main(String[] args) 
	{
		StringBuilder builder = new StringBuilder("Raja");
		System.out.println(builder);
		
		builder.append("shekar");
		System.out.println(builder);
		
		System.out.println(builder.charAt(9));
		
		System.out.println(builder.replace(0, 1, "shekar"));
		
		System.out.println(builder.capacity());
		
		System.out.println(builder.reverse());
		
		System.out.println(builder.lastIndexOf("a")); // Here it will find the index value of last 'a' string.
		
		System.out.println(builder.indexOf("s", 6)); // It will find the string s after 6th index.
		

	}

}
