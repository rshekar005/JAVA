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
		
        //The String equals() method compares the original content of the string. 
        //It compares values of string for equality. String class provides two methods:
        	/*public boolean equals(Object another) compares this string to the specified object.
        	public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.*/
        
/*        Main difference between .equals() method and == operator is that one is method and other is operator.
        		We can use == operators for reference comparison (address comparison) and .equals() method for content comparison. In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
        		If a class does not override the equals method, then by default it uses equals(Object o) method of the closest parent class that has overridden this method. See this for detail*/
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3)); // Pre-defined method in strings package to avoid case censitives
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s6));
		
		System.out.println("**************************************");
		
		//compareTo() returns 0 if both are equal and returns some value based on the string comparision.
		/**
		 * s1 == s2 :0
		   s1 > s2   :positive value
		   s1 < s2   :negative value
		 */
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4)); // Here S characters value is greater than R by 1. Hence returning -1
		System.out.println(s1.compareTo(s5));
		System.out.println(s4.compareTo(s1));
		System.out.println(s4.compareTo(s6));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		System.out.println("*****************************************");
		
		//The = = operator compares references not values. (address comparison)
		System.out.println(s1==s2);//true (because both refer to same instance)  
		System.out.println(s2==s3);// false (becuase s3 refers to instance created in nonpool)
		System.out.println(s1==s3);
	

	}

}
