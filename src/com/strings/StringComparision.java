package com.strings;
/**
 * 
 * @author Shekhar
 * String Comparision -- It is used in authentication( equals() ) , sorting (by compareTo() ) and by reference matching ( == Operator)
 * 
 */
public class StringComparision {

	public static void main(String[] args)
	{
		String s1= "Raja";
		String s2= "Raja";
		String s3= "RAJA";
		String s4= "Shekar";
        String s5 ="Zebra";
        String s6= new String("SHEKAR");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3)); // Pre-defined method in strings package to avoid case censitives
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s6));
		
		System.out.println("**************************************");
		
		//compareTo() returns 0 if both are equal and returns some value based on the string comparision.
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4)); // Here S characters value is greater than R by 1. Hence returning -1
		System.out.println(s1.compareTo(s5));
		System.out.println(s4.compareTo(s1));
		System.out.println(s4.compareTo(s6));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		System.out.println("*****************************************");
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	

	}

}
