package com.interfacedemo;

public class Test 
{
	public static void main(String args[])
	{
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.threadSafety();
		System.out.println(b.wheels);
		
		System.out.println("********************************");
		//runtime Polymorphism
		Car c = new BMW();
		c.refuel();
		c.start();
		c.stop();
		
	}

}
