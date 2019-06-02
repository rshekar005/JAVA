package com.staticdemo;

/**
 * 
 * @author Shekhar
 * Static -- It is a keyword which is mainly used for memory management.It saves memory.
 *           when we declare any variable,method as static then memory get's allocated at the time of class loading.
 *           We cannot change the value of static variable. If we change the static variable then it will effect for all the objects.
 *           We cannot overload a static method. It will throw compile time error.
 *           In Below example used static keyword for college because college name for all students are same, so used static keyword for that variable.
 *           So memory get's allocated at the time of class loading.
 *           The static variable can be used to refer to the common property of all objects 
 *           Objects will store in Stack memory.
 *           Variable's will store in Heap Memory where static variable's store in heap memory but at class area
 *          
 */
public class StaticVariableDemo 
{
	int rollno;
	String name;
	static String college="DVR";
	
	public StaticVariableDemo(int i,String n)
	{
		rollno=i;
		name=n;
	}
	void display()
	{
		System.out.println(rollno +" "+ name + " " + college);
	}
	public static void main(String args[])
	{
		StaticVariableDemo s = new StaticVariableDemo(100, "Shekar");
		StaticVariableDemo s2= new StaticVariableDemo(200, "Narayana");
		s.display();
		s2.display();
// Changed static variable name, it will not not affect for an object level. It will affect at class level. Because static memory get's allocated at the time of class loading
		s.college="RRS";//Here we changed college name for s object but it is effecting other objects also.
		s.display();
		s2.display();
	}

}
