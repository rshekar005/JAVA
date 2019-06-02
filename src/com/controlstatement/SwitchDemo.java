package com.controlstatement;

public class SwitchDemo 
{
	public static void main(String args[])
	{
		/*
		 * If we didn't break statement, if condition satisfied in any case then it will execute next statement also
		 * If we use break statement then it will execute statement which satisfied the condition the it will break the statement
		 */
		int a=2;
		switch(a/2)
		{
		case 1:
			System.out.println("dsdsd");
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		case 4:
			System.out.println(4);
		case 5:
			System.out.println(5);
		case 6:
			System.out.println(6);
		case 7:
			System.out.println(7);
			break;
		default:
			System.out.println("Not in this range");
		}

	}

}
