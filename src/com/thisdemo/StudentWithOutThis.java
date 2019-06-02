package com.thisdemo;
/**
 * 
 * @author Shekhar
 * This -- this is a reference variable which is used to refer a current object
 * 
 * usage of this keyword.
 * 1. this can be used to refer current class instance variable.
   2. this can be used to invoke current class method (implicitly)
   3. this() can be used to invoke current class constructor.
   4. this can be passed as an argument in the method call.
   5. this can be passed as argument in the constructor call.
   6. this can be used to return the current class instance from the method.
 */
public class StudentWithOutThis 
{
	//Without this keyword.
	int rollno;// Instance Variables
	String name;
	
	public StudentWithOutThis(int rollno,String name)
	{
		rollno=rollno;// local variable: A varibale which is declared inside a method called local variable
		name= name;
	}
	
	void display()
	{
		System.out.println(rollno + " " + name);
	}
	
	public static void main(String args[])
	{
		StudentWithOutThis s = new StudentWithOutThis(1,"Shekar");
		s.display();// It will return null values becuase instance variable and local variable are same. hence it will return null values.
	}

}
