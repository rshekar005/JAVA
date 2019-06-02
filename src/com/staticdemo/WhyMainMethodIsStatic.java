package com.staticdemo;

/**
 * 
 * @author Shekhar
 *Why Java Main Method is Static:  Because the object is not required to call a static method. 
 *                                  If declared method as non static then need JVM created an object and calls a main method. It causes a memory problem means it requires extra memory location
 *
 *Can we execute a program without main method:  No, one of the ways was static method but it is decrated from JAVA 1.7 and above.
     We Cannot run a program with out main method.
 */

public class WhyMainMethodIsStatic 
{
	static{
		System.out.println("Hello");
		System.exit(0);
	}
	

}
