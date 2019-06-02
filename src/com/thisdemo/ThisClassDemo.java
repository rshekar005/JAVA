package com.thisdemo;
/**
 * 
 * @author Shekhar
 * 2nd Usage: this keyword can be used to call class method. If we didn't use this keyword compiler will internally calls this keyword.
 */
public class ThisClassDemo 
{
	void m()
	{
		System.out.println("m method");
	}
	void n()
	{
		System.out.println("n method");
		m();
	}
	public static void main(String args[])
	{
		ThisClassDemo t= new ThisClassDemo();
		t.n();// here we calling only n() but it will internally calls m() by compile 
		
	}

}
