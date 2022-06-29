package com.variables;

public class InstanceVariable 
{
	
	//A Variable which is declared inside a class but outside a method is called instance variable. Instance Variable cannot be static
	String myVar="Instance Varibale";

	public static void main(String[] args)
	{
		InstanceVariable obj1=new InstanceVariable();
		InstanceVariable obj2=new InstanceVariable();
		InstanceVariable obj3=new InstanceVariable();
		
		System.out.println(obj1.myVar);
		System.out.println(obj2.myVar);
		System.out.println(obj3.myVar);
		

		obj2.myVar="Changed Instance Variable Value";// when we change instance variable, it will affect that particular object instance unlike static variable
		
		System.out.println(obj1.myVar);
		System.out.println(obj2.myVar);
		System.out.println(obj3.myVar);
		

		

		
		
	}
}
