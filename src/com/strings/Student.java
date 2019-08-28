package com.strings;
/**
 * 
 * @author Shekhar
 *
 *toString() -- If you want to represent an object as a string then toString() comes into existence.
 *           -- Java compiler by default calls toString() to represent an object which will return string representation of an object.
 *           -- If you want to print an object , java compiler will call internally toString() which returns classname + @ + hashcode which will not give desired output.
 *           -- To get desired output, we need to override toString() based on your requirement to get desired output.
 */
public class Student {

	int rollno;
	String name;
	
	public Student(int rollno, String name)
	{
		this.rollno= rollno;
		this.name = name;
		
	}
	public String toString()// Overiding toString method to get desired output.
	{
		return rollno +" " +name;
		
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(10, "shekar");
		Student s2 = new Student(20, "Manoj");
		
		System.out.println(s1); // Here java compiler calls internally toString() returns classname + @ + hashcode
		System.out.println(s2);

	}

}
