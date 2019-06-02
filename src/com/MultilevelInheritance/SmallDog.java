package com.MultilevelInheritance;

public class SmallDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
	
	public static void main(String args[])
	{
		SmallDog d= new SmallDog();
		d.weep();
		d.bark();
		d.eat();
	}

}
