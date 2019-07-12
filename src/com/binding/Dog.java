package com.binding;
/**
 * 
 * @author Shekhar
 *  Static binding -- When type of an object is determined at compile time is called as static binding9Early binding)
 *  If there is any private, final or static method in a class, there is static binding.
 */
public class Dog 
{
	private void eat()
	{
		System.out.println("Eating");
	}
    public static void main(String args[])
    {
    	Dog d = new Dog();
    	d.eat();
    }
}
