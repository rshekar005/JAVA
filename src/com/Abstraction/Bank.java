package com.Abstraction;
/**
 * 
 * @author Shekhar
 * Abstract -- When we declare any class has abstract then that class called as abstract class.
 * Abstraction --  Hiding the implementation details and showing only functionality is called Abstraction.
 * Example: for example, sending SMS where you type the text and send the message. 
 *          You don't know the internal processing about the message delivery.
 *          
 *          Cannot create an object of abstract class
 *          
 *          In abstract class we can have non static, static and final data memebers and we can create a constructor for an abstrarct class
 *          Data members can be public, private, protected and default
 *  In Abstraction: 1. We can have 100 % abstraction or partial abstraction
 *                  2. It can have abstract and non-abstract method
 *                  3. It cannot be instantiated.
 *                  4. It can have static and constructors also.
 *                  5. It can have final methods which is used to restrict end user do not change the value.
 */
public abstract class Bank 
{
	Bank()
	{
		System.out.println("Abstarct Constructor -- Bank");
	}
	int a=10;
	final int b=20;
	static int c=30;
   public abstract void loan();// abstract method -- No body. we cannot declare method body. 100% abstarction
   
   public void credit()// Non abstract method
   {
	   System.out.println("Bank -- Credit");
   }
   public void debit()
   {
	   System.out.println("Bank -- Debit");
   }
   
   
}
