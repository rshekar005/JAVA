package com.operators;

public class ArithmeticDemo 
{
	/*
	 * Operators are used to represent an action.
	 * There are seven types of Operators
	 * 1. Arithmetic Operators(+,-,*,%,/)
	 * 2. Assignment Operators(=,+=,-=,*=,/=,%=)
	 * 3. Auto Increment and decrement operators ( ++, --)
	 * 4. Logical Operators (&&,||,!)
	 * 5. Comparision Operatos(==,!=,>,<,>=,<=)
	 * 6. Bitwise Operator(&, |, ^, ~, <<, >>)
	 * 7. Ternary operator
	 */
	
	public static void main(String args[])
	{
		int num1 = 10;
		int num2 =3;
		
		/*System.out.println("Sum of two numbers " + (num1 + num2));
		System.out.println("Substraction of two numbers " +(num1 - num2));
		System.out.println("Mutiplication of two numbers " +(num1 * num2));
		System.out.println("Module of two numbers "+(num1 % num2));*/
		System.out.println("Division of two numbers " +(num1 / num2));
		
		int temp;
		
		num1 =num2;
		temp =num2;
		num1= num2;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
