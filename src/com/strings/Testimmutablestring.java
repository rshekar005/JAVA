package com.strings;
/**
 * 
 * @author Shekhar
 * In Java, Strings are immutable in nature it means we cannot change the value of String.
 * 
 * Why Strings are immutable in nature.
 * In Java Strings uses the concept of SCP, if there are 5 reference variable with the same instance then JVM creates a single instance by refering 5 instances. If we change any instance it will affect all the reference varibales.
 * Hence Strings are immutable in nature.
 * 
 * 
 * From below Example we created a string with the instance as "Raja" and we are appending Raja with shekar. But JVM creates a new instance with the name as "Shekar" instead of appending with "Raja".
 * Hence reference variable refers Raja instead of Rajashekar.
 * 
 * But if we explicitely assign it to the reference variable then it will return RajaRaju. Please notice that Raja still a single instance(Object).
 *  
 * 
 */
public class Testimmutablestring {

	public static void main(String[] args) 
	{
		String s= "Raja";
		s.concat("shekar");
		s=s.concat("Raju");// Here 
		System.out.println(s);

	}

}
