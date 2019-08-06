package com.instanceinitializationblock;

/**
 * 
 * @author Shekhar
 * From Below Example: B extends A class. B as super() and contains initializer block. 
 * Whenever we are creating object of sub-class if sub-class contains super() constructor then it will call
 * parent contructor and then instance block and after it will call b contructor and it's method.
 * 
 */
public class B extends A{

	public B() 
	{
		super();
		System.out.println("B Constructor");
 	}
	{
		System.out.println("Instance Initializer block");
	}

	public static void main(String[] args) 
	{
		B b= new B();
	}

}
