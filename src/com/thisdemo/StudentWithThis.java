package com.thisdemo;
/**
 * 
 * @author Shekhar
 * this is a reference variable which is used to refer a current instance variable.
 * 
 * 1st usage: this keyword can be used to refer current class instance variable
 * 
 * In below example: Constructor-- ReightHand side Variable refers to instance variable and left hand side variable refers to local variable.
 *                                 Here local variable and instance vaiable names are same. So used this keyword to differentiate.
 *                                 If both are different then there is no need to use this keyword.
 *                              
 *                   hence when we pass any varaible vale it will link that value to instance variable .  
 *                   
 *    It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use this keyword.
 */
public class StudentWithThis 
{
	int rollno;// Instance Variable: Variable which is declared at class level without static is called instance variable
	String name;
	 // Static variable: A variable which is declared a static is called static variable. Variable called at class level. 
	//when we declare any mthod or variable as static then no need to call that variable or method by using object reference variable.
	// Mainly Static is used to memory management.It saves memory.
	//static String college = "DVR";
	
	
	public StudentWithThis(int rollno, String name) 
	{
		//Here right hand side roll name refers to instance variable and left hand side variable refers to local variable.
		this.rollno=rollno;
		this.name=name;
		
		
	}
	void display()
	{
		System.out.println(rollno + " " + name );
	}
	public static void main(String args[])
	{
		StudentWithThis s= new StudentWithThis(100, "Shekar");
		s.display();
	}
	

}
