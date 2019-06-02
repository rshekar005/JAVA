package com.superdemo;
/**
 * 
 * @author Shekhar
 *Super -- Super is a keyword which is used to refer immediate parent class object. As the word suggest it uses inheritance concept.
 *
 *Usage:
 *1. Super keyword can be used to call parent class instance variable.
 *2. Super keyword is used to call parent class method.
 *3. Super keyword is used to call parent class constructor
 */
public class Animal 
{
	String color="White";
	
	void run()
	{
		System.out.println("Animal is running");
	}
	Animal()
	{
		System.out.println("Parent Constructor");
	}

}
