package com.instanceinitializationblock;
/**
 * 
 * @author Shekhar
 * 
 * Definition: Instance Initialization block involved for instance data member and it run each time when an object of a class is created.
 * 
 * Use: We  have to perform some operations while assigning value to instance data member 
 *      e.g. a for loop to fill a complex array or error handling etc. 
 *      
 *  In the below example, it seems that instance initializer block is firstly invoked but NO. 
 *  Instance initializer block is invoked at the time of object creation. 
 *  The java compiler copies the instance initializer block in the constructor after the first statement super(). 
 *  So firstly, constructor is invoked. Let's understand it by the figure given below:
 *
 */
public class Bike 
{
	int speed;
	public Bike() 
	{
		System.out.println("Speed is "+speed);
		System.out.println("Parent Constructor");
	}
	public Bike(int i)
	{
		super();
		System.out.println("Child Constructor");
	}

	{
	  speed =100; //Instance Initializer block
	}
	public static void main(String args[])
	{
		Bike b1= new Bike();//Here Object is created. Instance Initializer is invoked at the time of object creation . Then java compiler calls this instance block in the constructor after super(). If Super() is invoked then this block is called after super().
		Bike b2= new Bike();
		Bike b3= new Bike(1);
	}
}
