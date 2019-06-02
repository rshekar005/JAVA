package com.thisdemo;
/**
 * 
 * @author Shekhar
 * this() is used to invoke constructor
 */
public class ThisConstrictorDemo 
{
	// When we declare a construtor without parameters is called as default construbtor
	public ThisConstrictorDemo() 
	{
		System.out.println("Default Constructor");
	}
    ThisConstrictorDemo(int x)
    {
    	this();// Here calling default constructor and then parameterized constructor
    	System.out.println(x);
    }
    public static void main(String args[])
    {
    	ThisConstrictorDemo t = new ThisConstrictorDemo(5);
    	
    }

}
