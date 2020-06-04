package com.strings;
/**
 * 
 * @author Shekhar
 * String Concatenation: It means adding multiple strings
 * 2 ways to add multiple strings
 * ======================
 * 1. Using + Operator. (Java string concatenation operator (+) is used to add strings. )
 * 2. Using concat(). (The String concat() method concatenates the specified string to the end of current string.)
 */
public class StringConcatination 
{
	public static void main(String args[])
	{
		String s="raja" + "shekar";
		System.out.println(s);	
		String s2 = "Bala";
		String s3 = "Krishna";
		System.out.println(s2.concat(s3));
		String s4 = 10-5+"Raja"+10+23; // After a string literal, all the + will be treated as string concatenation operator.
		System.out.println(s4);
		String s5= new String("Pillalamarri");
		System.out.println(s.concat(s5));
		
		
	}

}
