package com.constructor;

public class ParameterizedConstructor 
{
/**
 * A Constructor which has parameters is called parameterizedconstructor.
 * The Parameterized constructor is used to set different values to an object.
 */
	int id;
	String name;
    ParameterizedConstructor(int i, String n)//Parametarized constructor
    {
		id=i;// Here we are setting object values to a variable.
		name=n;
	}
    public void display()
    {
    	System.out.println(id +"  "+ name);
    }

   public static void main(String args[])
   {
	  // ParameterizedConstructor p = new ParameterizedConstructor(); We cannot created default constructor for the constructor which is parametrized .
	   
	   ParameterizedConstructor para= new ParameterizedConstructor(100, "Shekar");
	   para.display();
   }
}
