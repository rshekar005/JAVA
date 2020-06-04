package com.strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String s= "Hello";
		System.out.println(s.toUpperCase());
		String s2= "HELLO";
		System.out.println(s2.toLowerCase());
		
		//Trim method is used to remove space before and after string
		String s3= " Hello ";
		String s4 = "   Hello Jave   "; //Hello Jave
		System.out.println(s3.trim());
		System.out.println(s4.trim());
		
		
		System.out.println(s3.startsWith("e")); // It is false.Return true or false based on the condition
		
		//The string charAt() method returns a character at specified index.
		System.out.println(s3.charAt(3));
				
		//From s3 removed spaces before and after and then returning length of the string
		System.out.println(s3.trim().length());
		
		//The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
		int a =10;
		String s5= String.valueOf(a);
		System.out.println(s5);
		System.out.println(s5+10);//1010 because after string any thing will add as a concatenation
		
		//The string replace() method replaces all occurrence of first sequence of character with second sequence of character.
		String s6="Java is a programming language. Java is a platform. Java is a island";
		System.out.println(s6.replace("Java", "Kava"));
		
		//Removing spaces in a given string . Used replaceAll() with reg expression
		String remove=s6.replaceAll("\\s", "");
		System.out.println(remove);
		
		System.out.println(s6.indexOf("a",3));

		

	}

}
