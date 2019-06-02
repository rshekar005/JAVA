package com.controlstatement;

public class IfDemo 
{
	
	public static void main(String args[])
	{
		/*int num=25;
		if(num>=21)
		{
			System.out.println("Num is less than or equal to "+num);
			if(num<30)
			{
				System.out.println("Num is less than "+num);
			}
		}
		else
		{
			System.out.println("Num is less than "+num);
		}*/
		
		int num1=100; int num2=200; int num3=400;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Greatest of 3 numbers is "+num1);
		}
		else if(num2>num1 && num2>num3 )
		{
			System.out.println("Greatest of 3 numbers is "+num2);
		}
		else
		{
			System.out.println("Greatest of 3 numbers is "+num3);
		}
	}

}
