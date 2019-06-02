package com.finaldemo;
/**
 * 
 * @author Shekhar
 * Final is a variable which is used to restrict the user.
 * 
 * Final Keyword can be used in : Variables -- Compile time error
 *                                Classes   --Parent class Cannot be inherited to child class when we declare a class as final.
 *                                Method    -- Parent method cannot be override to child class when we declare a parent method as final.
 * 
 * FInal keyword cannot be used for constructor because constructor cannot be inherited.
 */
public class FinalVariable 
{
	final int speedlimit=100;
	
	void run()
	{
		 //speedlimit=400; //It will throw compile time. We cannot change the value of final varibale.
	}
	public static void main(String args[])
	{
		FinalVariable f= new FinalVariable();
		System.out.println(f.speedlimit);
	}
	
	

}
