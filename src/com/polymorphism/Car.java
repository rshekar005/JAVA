package com.polymorphism;
/**
 * 
 * @author Shekhar
 * Polymorphism -- It is a concept in which we can perform a single action in many forms.
 *                 "Poly" means "many" and "morphism" means "forms".
 *                 There are two kinds of polymorphisms in JAVA.
 *                 1. Compile time polymorphism
 *                 2. Run time polymorphism
 *                 Polymorphsim can be achieved in two ways i.e method overloading and method overriding.
 * Compile Time Polymorphism --Example:1. If we overload a static method it will throw error message at compile time is called compile time polymorphism
 *                                     2. If Parent Class and Child class as some methods then at time compile time java will decide which method to execute.
 * Run Time Polymorphism -- Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
 *                          In this process, an overridden method is called through the reference variable of a superclass. 
 *                          
 * Upcasting -- If a parent class reference variable calling child class object is called Upcasting.
 *  
 * Polymorphism will applied on overriden method not data members which are not overriden
 *              
 */
public class Car 
{
	public void run()
	{
		System.out.println(" Car is running");
	}
	public void refuel()
	{
		System.out.println("Car Refuel");
	}
	public void stop()
	{
		System.out.println("Car Stops");
	}

}
