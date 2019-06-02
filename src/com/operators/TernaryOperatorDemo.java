package com.operators;

public class TernaryOperatorDemo 
{
	
	/*
	 * This operator evaluates a boolean expression and assign the value based on the result.
       Syntax: variable num1 = (expression) ? value if true : value if false
       If the expression results true then the first value before the colon (:) is assigned to the variable num1 else the second value is assigned to the num1.
	 */
	public static void main(String args[])
	{
		int num=21;
		/*num=(num==20) ? 100 :200;
		System.out.println(num);//Here num is not equal to 20, hence it returing false statement
*/		
		num=(num==21)? 100:200;
		
		System.out.println(num);// Here it will return 100 because it is returning true
	}

	

}
