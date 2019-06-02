package com.staticdemo;
/**
 * 
 * @author Shekhar
 * Restrictions for Static .
 *  ===============================
 *  1. The static method can not use non static data member or call non-static method directly.
 *  2. this and super cannot be used in static context.
 */
public class StaticRestrictions 
{
	int i=10;
  public static void main(String args[])
  {
      System.out.println("Hi");
	  //System.out.println(i);// Here we cannot call non static variable inside static method. It is an object level variable. we need to call that variable using object
  }
}
