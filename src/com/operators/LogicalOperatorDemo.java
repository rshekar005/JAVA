package com.operators;

public class LogicalOperatorDemo 
{
	
	//Logical Operators (&&,||,!). It returns true or false.
	// Works between boolean
	/* x       y      x&&y     x||y    !x
	 * true   true    true    true     false
	 * false  true    false   true     true
	 * true   false   false   true     false
	 * false  false   false   false    true
	
	*/
	public static void main(String args[])
	{
		boolean a= true;
		boolean b= false;
		
		System.out.println(a&&b);
		System.out.println(a||b);
		System.out.println(!a);
	}

}
