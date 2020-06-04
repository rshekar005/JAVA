
package com.strings;

public class ReverseEachWord 
{
	public static void main(String args[])
	{
		String str="This is string constant pool";
		System.out.println("Original String is "+str);
		String w[]=str.split("\\s"); //It will remove spaces in between in string and form an array.
		String rev="";
		for(int i=w.length-1;i>=0;i--)
		{
			rev=rev+w[i]+" ";
		}
		System.out.println("Reversing of string with respective to word");
		System.out.println(rev);
		
		System.out.println("Length of the string is "+str.length());
		String reverse="";
		String w1[]=str.split("\\s");
		System.out.println("Number of words in string is "+w.length);
		
		
	}

}
