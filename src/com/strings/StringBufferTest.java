package com.strings;
/**
 * 
 * @author Shekhar
 * StringBuffer -- It is a class. StringBuffer is mutable in nature (It can be modified).
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. It is synchronized.
 * So it is safe and will result in an order.
 * 
 * Java StringBuffer class is used to create mutable (modifiable) string. 
 * The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
 */
public class StringBufferTest {

	public static void main(String[] args) 
	{
	  StringBuffer b = new StringBuffer();
	  System.out.println(b.capacity()); // Default capacity is 16
      StringBuffer buffer = new StringBuffer("Raja");
      System.out.println(buffer.capacity());//16+4=20
      buffer.append("shekar");
      System.out.println(buffer);
      
      System.out.println(buffer.charAt(9));
      buffer.insert(3, "Pillalamarri");
      System.out.println(buffer);
      
      buffer.delete(3, 15);
      System.out.println(buffer);
      
      buffer.replace(0, 10, "Pillalamarri");
      System.out.println(buffer);
      
      buffer.deleteCharAt(0);
      System.out.println(buffer);
      
      buffer.reverse();// With the help of StringBuffer we can reverse a string using reverse() but for string we cannot. 
      System.out.println(buffer);
      
	}

}
