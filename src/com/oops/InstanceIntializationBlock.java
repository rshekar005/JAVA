package com.oops;
/**
 * 
 * @author Shekhar
 * Instance Instialization block called immediate after creating an object. 
 * It will execute each time when an object is created.
 */
public class InstanceIntializationBlock 
{
	int speed;
	
	public InstanceIntializationBlock() 
	{
		System.out.println("Bike speed is " +speed);
 	}
	//Instance Initialization block. Here speed value is assigned to construtor. Compiler internally assigns this speed value
	{
		speed=100;
	}
	public static void main(String args[])
	{
		InstanceIntializationBlock i= new InstanceIntializationBlock();
		InstanceIntializationBlock i2= new InstanceIntializationBlock();
		
	
	}

}
