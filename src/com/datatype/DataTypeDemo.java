package com.datatype;

public class DataTypeDemo 
{
	/*Data types -- Data type defines the values that a variable can take.
	 * There are two types of data types 
	 * 1) Primitive Data types --> There are 8 types of primitive data types (byte, char, short, int, double, float,boolean and long.
	 * 2) Derived Data types --> Arrays, String etc 
	 * byte, short, int and long data types are used for storing whole numbers.
	 * float and double are used for fractional numbers.
	 * char is used for storing characters(letters).
	 * boolean data type is used for variables that holds either true or false.
	 */
	
	public static void main(String args[])
	{
		//byte is a type of primitive data type --> Size of byte is one byte (-128 to +127)
		byte num1= 120;
		System.out.println(num1);
		// byte num2= 128;  --> 128 is greater than the size 
		//System.out.println(num2);
		
		// Short is greater than byte and less than Int. Size of short is 2 byte and range between -32,768 to 32767
		short num2 =100;
		System.out.println(num2);
		//short num3 = 32768; --> 32768 is not in a range
		
		//Int is greater than Short. Size of int is 4 bytes and range is in between -2,147,483,648 to 2,147,483,647
		int num3 = 1000000000;
		System.out.println(num3);
		
//Used when int is not large enough to hold the value, it has wider range than int data type, ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.	
		// SIze of long is 8 bytes
		long l= 1000000000000000000L;
		System.out.println(l);
		
		//Size of double is 8 bytes.It Can store upto 15 decimals
		double d=-3243243434.054543545d;
		System.err.println(d);
		
		//size of float is 4 bytes and it can store upto 7 to 7 decimals
		float f=-12333.324344444344f;
		System.out.println(f);
		
		//boolean can store only true and false values
		boolean b=false;
		System.out.println(b);
		
		//char size is 2 bytes and can be represent by single quotes
		char c='d';
		System.out.println(c);
	}

}
