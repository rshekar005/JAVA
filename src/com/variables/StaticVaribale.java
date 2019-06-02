package com.variables;

/**
 * Static Variable can be called any where in the program.
 * Static variables are also known as class variable because they are associated with the class and common for all the instances of class.
 * In this example, i have changed thevalue of  static variable inside the method, that value will reflect for all the instances
 */
public class StaticVaribale 
{
	public static String myClassVaribale="Class or Static Variable";  //Static varibale

	
	public static void main(String args[])
	{
		//static String myvar3="Done";  We cannot create static variable inside method.
		StaticVaribale obj1= new StaticVaribale();
		StaticVaribale obj2= new StaticVaribale();
		StaticVaribale obj3= new StaticVaribale();
		
		System.out.println(obj1.myClassVaribale);
		System.out.println(obj2.myClassVaribale);
		System.out.println(obj3.myClassVaribale);
		
		obj2.myClassVaribale="Changed Value";
		System.out.println(obj1.myClassVaribale);
		System.out.println(obj2.myClassVaribale);
		System.out.println(obj3.myClassVaribale);
		
	
		
	}
	

	
}
