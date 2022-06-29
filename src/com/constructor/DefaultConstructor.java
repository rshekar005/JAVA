package com.constructor;

public class DefaultConstructor 
{
/**
 * A constructor is called default constructor when there is no parameters.
 * Default constructor is used to provided null values to an object at the time of creation
 * Here we are not initialized variable. Just created an instance variable with respective data type.
 * Here we are not creating any constructor so compiler provides you a default constructor. 
 * Here 0 and null values are provided by default constructor.
 */
	int id;
	String name;
	
	public void display()
	{
		System.out.println(id +" " +name);
	}
	public static void main(String args[])
	{
		DefaultConstructor def= new DefaultConstructor();
	//Here we are not set any value to a variables . Default constructor will set null values to a varaible.
	
		def.display();
   //Here we are instialized variable and set's that value to a variable.
		def.id=100;
		def.name="Shekar";
		def.display();
		
	}

}
