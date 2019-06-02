package com.constructor;
/**
 * 
 * @author Shekhar
 * Constrictor -- A constructor is a block of code same as a method. 
 *                When Constructor is called -- It is called when an instance of a class is created and memory is allocated for that object.
 *                Rules for creating Java constructor:
 *                Constructor name must be the same as its class name
A                 Constructor must have no explicit return type
A                 Java constructor cannot be abstract, static, final, and synchronized
 */
public class Bike 
{
	Bike()
	{
		System.out.println("Bike is running");
	}
	public static void main(String args[])
	{
/**Memory gets allocated to an object at runtime.We are creating an object. 
   When we create an object it will call a constructor and executes block of code inside a constructor.
   In this code we are created a constructor. SO when run a program internally it will create an object in stack memory and that object will call a contructor and executes a program based on a logic.
   Here new is a keyword which is used to allocate memory.
   b is a reference variable to an object Bike().
   Here it is a default constructor because there is no arguments(parameters)
		*/
		Bike b = new Bike();
	}

}
