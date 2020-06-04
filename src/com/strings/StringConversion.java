package com.strings;

public class StringConversion {
	public static void main(String args[])
	{
		// From String to int
		String s="200";
		int i = Integer.parseInt(s);
		System.out.println(s+200);//200200 becuase + operator is concatenate  operator
		System.out.println(i+300); // 500 becuase + is a binary operator
		
		//int to String
		int j=100;
		String s2=String.valueOf(j);
		System.out.println(s2+100);
		System.out.println(j+200);
	}

}
