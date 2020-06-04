package com.strings;

public class StringPalindrome {

	public static void main(String[] args) {
		isPalindrome("nitin");

	}
	
	public static void isPalindrome(String str)
	{
		System.out.println("Length of the string is "+str.length());
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println(str+ " is a palindrome String");
		}
		else
		{
			System.out.println(str+ " is not a palindrome string ");
		}
		
		
	}
}
