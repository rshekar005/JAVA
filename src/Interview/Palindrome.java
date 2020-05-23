package Interview;

import java.util.Scanner;

public class Palindrome 
{
	//Palindrome: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
	//It can also be a string like LOL, MADAM etc.
	
	public static void isPalindrome(int num)
	{
		int reverse=0;
		int sum=0;
		int temp;
		
		temp=num;
		while(num>0)
		{
			reverse=num%10; //Get the remainder
			sum=(sum*10)+reverse;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println(" It is not a palindrome number");
		}
		
		
	}
	public static void main(String args[])
	{
		isPalindrome(121);
	}

}
