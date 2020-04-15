package com.instanceofDemo;
/**
 * 
 * @author Shekhar
 * InstanceOf --> The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
The instanceof in java is also known as type comparison operator because it compares the instance with type. It returns either true or false. 
If we apply the instanceof operator with any variable that has null value, it returns false.
 */
public class Animal {

	public static void main(String[] args) 
	{
		Animal a = new Animal();
		System.out.println(a instanceof Dog); //It will print false because Dod is not refered a reference object
		System.out.println(a instanceof Animal);

	}

}
