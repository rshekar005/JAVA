package com.staticdemo;
/**
 * 
 * @author Shekhar
 * Static Method-- If we apply static to any method then it is called as "Static Method".
 *                 A Static Method belongs to class rather than object.
 *                 A Static method will invoke without need of object.
 *                 Static method can access static data member and can change the value of it.
 *                 
 * 
 */
public class StaticMethodDemo 
{
	int rollno;
	String name;
	static String college="DVR";
	
	static void change()
	{
		college="RRS";// If we are not declared variable as static then that variable cannot be called inside static method
	}
	public StaticMethodDemo(int r, String n) 
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno + " "+name + " "+college);
	}
  /* public static void main(String args[])
   {
	   change();
	   System.out.println(college);
	   StaticVariableDemo s= new StaticVariableDemo(100, "Shekar");
	   s.display();
   }*/
}
