package com.strings;
/**
 * 
 * @author Shekhar
 * Strings -- Generally, strings are a group of characters. But in JAVA , string is an object that represent a group of characters.
 *            
 * Strings Creations:
 * 1. By String literal.(String constant pool)
 * 2. By New Key word(Heap memory)
 * 
 */
public class StringExample 
{
	
	public static void main(String args[])
	{
		//String literal -- Here we are creating two strings with the same instances. But JVM Creates single instance with different references.
		    // String literals mainly used for memory efficient.
		// String Objects are stored in memory location called String constant pool.
		
		String s= "Rajashekar";
		String s1= "Rajashekar";
		
		System.out.println(s);
		System.out.println(s1);
		char ch[]={'s','h','e','k','a','r'};
		
		//New keyword
		String s2= new String(ch);
		System.out.println(s2);
	}

}
