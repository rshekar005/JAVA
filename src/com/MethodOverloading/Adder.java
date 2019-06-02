package com.MethodOverloading;
/**
 * 
 * @author Shekhar
 * If a class has same method with different parameters is called method overloading
 * Method Overloading Increases the readability of the program.
 * 
 * Different ways to overloading.
 * 1. By Changing Parameters.
 * 2. By Changing data  type.
 * 
 * We cannot overload a method by changing return type -- because it occurs ambiguity
 */
public class Adder 
{
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(double a,double b)
	{
		return a+b;
	}
	// Same method and paramters with different retun type.throws compile time error
/*	public double add(int a ,int b)
	{
		return a+b;
	}*/
	public static void main(String args[])
	{
		//Cahnging Parameters
		Adder add = new Adder();
		System.out.println(add.add(1, 2));
		System.out.println(add.add(1, 2, 3));
		//Changing Data type.
		Adder add2= new Adder();
		System.out.println(add2.add(10, 20));
		System.out.println(add2.add(100, 200.99));
		
	}

}
