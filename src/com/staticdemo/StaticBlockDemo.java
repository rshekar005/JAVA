package com.staticdemo;

/**
 * 
 * @author Shekhar
 *  Static Block -- It is executed before main method becuase static block will load at class level
 */
public class StaticBlockDemo 
{

	static{
		System.out.println("Static block executed");
	}
	
	public static void main(String args[])
	{
		System.out.println("Main Method");
	}
}
