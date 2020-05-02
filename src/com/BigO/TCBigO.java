package com.BigO;

/*
 * Big O is a technique which is used to check time complexity of a program
 * 
 * O(n)
 * O(1)
 * O(n)^2
 * O(n)^3 etc these are the time complexities
 */
public class TCBigO {
	
	public static void main(String args[])
	{
		int n=1; //O(1)
		System.out.println(n);
		
		//Odd | even
		int num=21; //O(1) if condition pass or fail only one statement will execute so time complexity is one
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
		int s=10; 
		for(int i=1;i<=s;i++)
		{
			System.out.println(i);//O(n)  because it can repeat any times based on length
		}
	}

}
