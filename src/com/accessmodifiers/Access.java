package com.accessmodifiers;
/**
 * 
 * @author Shekhar
 * Private AccessModifiers --> The access level of a private modifier is only within the class. 
 * It cannot be accessed from outside the class, outside of package.
 * It can be access with the help of getters and setters method
 * 
 * Default Access Modifiers --> The access level of a default access modifier is within the class and outside the class
 * 
 * Protected Access Mofifiers --> The access level of Protected access modifier is within the class, outside the class , 
 *                                outside the package but using inheritance concept.
 */
public class Access 
{
	private int a=100;
	private void msg()
	{
		System.out.println("Hello");
	}
	String def= "Shekar";// Default access modifiers
	
	protected String used="Raja";

}
