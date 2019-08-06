package com.instanceofDemo;

public class Dog extends Animal
{
	public static void main(String args[])
	{
		Animal a = new Dog();
		System.out.println(a instanceof Dog);// It will return true because dog is a sub type of Animal(Parent Class)
		
		Dog d= null;
		System.out.println(d instanceof Dog); // It will return false because it is not referring to any class.
	}

}
