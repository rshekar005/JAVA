package com.MethodOverriding;
/**
 * 
 * @author Shekhar
 * Can we override a main method and Static method: NO
 */
public class Test 
{
	public static void main(String args[])
	{
       SBI s= new SBI();
       HDFC h = new HDFC();
       
       System.out.println(s.getRateOfInterest());
       System.out.println(h.getRateOfInterest());
	}

}
