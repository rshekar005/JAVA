package com.oops;

public class WrapperClassConcept 
{
	public static void main(String args[])
	{
		String s= "100";
		System.out.println(s+200);// It will not add 100+200 = 300
		
		//Inorder to achieve we use wrapper classes.Integer Wrapper classes
		int i= Integer.parseInt(s);
		System.out.println(i+200);
		
		//String to double
		double d= Double.parseDouble(s);
		System.out.println(d+100.25);
		
		//String to boolean
		boolean b= Boolean.parseBoolean(s);
		System.out.println(b);
		
		//int to String
		int i2=10;
		System.out.println(10+20);
		String st=String.valueOf(i2);
		System.out.println(st+"Raja");
		
		String s3="100A";
		int i3=Integer.parseInt(s3);
		System.out.println(i3);// Throws number format exception. for converting string to number then string should contains pure integres.
	}

}
