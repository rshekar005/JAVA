package com.superdemo;

public class Dog extends Animal
{
	//Used to achieve super() to call a parent constructor
	Dog()
	{
		super();//Super method is used to run parent class constructor
	}
	String color="Black";
	//Used to achieve super for instance variable of parent class
	void color()
	{
		System.out.println("Child class color "+color);// Prints Black
		System.out.println("Parent class color "+super.color);// Prints white
	}
	//Used to achieve super for parent method
	void run()
	{
		System.out.println("Dog is running");
	}
	void work()
	{
		super.run();// It wll call parent class method
	}
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.color();
		d.work();
		
	}

}
