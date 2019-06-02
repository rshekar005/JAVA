package com.variables;

public class LocalVariable 
{
	String myVar="Instance Varibale";  //Instanace Varible
	static String myVar2="Static Varibale";
	public void myMethod()
	{
/*
 * These variables are declared inside method of the class. 
 * Their scope is limited to the method which means that You can’t change their values and access them outside of the method.
   In this example, I have declared the instance variable with the same name as local variable, this is to demonstrate the scope of local variables.
 */
		String myVar="local Variable";  //Local Variable
		System.out.println(myVar);
	}
	public static void main(String args[])
	{
		LocalVariable local= new LocalVariable();
		System.out.println("calling Method");
		local.myMethod(); // We Cannot directly access local variable. We can access by calling method
		System.out.println(local.myVar);//We Cannot directly access Instance Varible. We can access instance variable by creating object.
		System.out.println(myVar2); // We Can directly call static variable without creating an object
		
	}

}
