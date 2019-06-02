package com.MethodOverloading;

/**
 * 
 * @author Shekhar
 * Can we Overload a main method:
   Yes by using method overloading. But JVM Calls main method which contains String array arguments.
 */
public class MainMethodOverloading 
{
	{
		System.out.println("Main Method which contains String[]");
	}

	public static void main(String args)
	{
		System.out.println("Main Mathod with out atring array arguments");
	}
	public static void main()
	{
		System.out.println("Main Method with out arguments");
	}
}
