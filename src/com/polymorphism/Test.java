package com.polymorphism;

public class Test 
{
	public static void main(String args[])
	{
		//Compile time polymorphism -- Static polymorphism. when same
		//If Parent Class and Child class as some methods then at time compile time java will decide which method to execute.
		// Here methods 
		BMW b = new BMW();
		b.run();//Overriden method
		b.theftSafety();
		b.refuel();
		b.stop();
		
		System.out.println("*********************");
		Car c= new Car();
		c.stop();
		c.refuel();
		c.run();
		//Runtime Polymorphism -- Dynamic polymorphism.--> Child class object can be refered to parent reference variable
		System.out.println("*********************");

		//Top casting
		Car c2= new BMW();
		c2.stop();
		c2.refuel();
		c2.run();
		
	//	c2.theftSafety(); A parent cannot inherit some properties of child class.
		
		//Down Casting --> Degrading parent class to child class. At runtime it will throw class cast exception
		BMW b1 =(BMW)new Car();// Throws ClasscastException
	
	}

}
