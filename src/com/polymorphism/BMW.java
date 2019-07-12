package com.polymorphism;

public class BMW extends Car
{
	public void run()//overiden method of car class. If a child class contains same method as a parent class then it is called a method overriding 
	{
		System.out.println("BMW is running");
	}
    public void theftSafety() // Own Method of BMW Class
    {
    	System.out.println("BMW Threadsafety");
    }

	
}
