package com.accessmodifiers;

public class Test{

	public static void main(String[] args) 
	{
		Access p = new Access();
		
	//	System.out.println(p.msg()); throws compile time error when we call private variables or methods outside of the class
		System.out.println(p.getA());
		
		System.out.println(p.def);
		System.out.println(p.used);

	}

}
