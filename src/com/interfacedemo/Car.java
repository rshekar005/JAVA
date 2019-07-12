package com.interfacedemo;
/**
 * 
 * @author Shekhar
 * Interface -- Blue print of a class
 *           -- It contains only abstract methods but we are not using any abstract keyword.
 *           -- No method body.
 *           -- 100% abstarction
 *           -- Java Interface also represents the IS-A relationship.
 *           -- data members by default static and final in nature
 *           -- Implements is keyword
 *           -- We Cannot create an object of interface
 * Usage -- Abstraction
 *       -- Multiple Inheritance is possible.
 *       -- It can be used to achieve loose coupling.
 */
public interface Car 
{
	int wheels=4;// Java compiler  it adds public, static and final keywords before data members
	public void start();// Java compiles adds public and abstract keywords before the interface method
	public void stop();
	public void refuel();
	//public void park();

}
