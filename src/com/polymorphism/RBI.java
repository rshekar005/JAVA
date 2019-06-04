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
 * Compile Time Polymorphism -- If we overload a static method it will throw error message at compile time is called compile time polymorphism
 * Run Time Polymorphism -- Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
 *                          In this process, an overridden method is called through the reference variable of a superclass. 
 *                          
 * Upcasting -- If a parent class reference variable calling child class object is called Upcasting.
 * 
 * Here RBI is a parent class and SBI, HDFC etc are child class. We are calling child class object with the help of reference varibale of parent class. So,Method invocation is called by JVM not a compiler.
 * 
 * Polymorphism will applied on overriden method not data members which are not overriden
 *              
 */
public class RBI 
{
	public int getRateOfInterest()
	{
		return 0;
	}

}
