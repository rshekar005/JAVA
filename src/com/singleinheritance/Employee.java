package com.singleinheritance;
/**
 * 
 * @author Shekhar
 * Inheritance -- It used to extract the properties and behaviour of parent class to child class.
 *                Extends is a keyword which is used to acquire the properties and behaviour of parent class to child class
 *                Inheritance maintains IS-A relationship i.e parent-child relationship.
 *                
 * Usage of Inheritance:
 *       1. Used in Method Overriding(So runtime polymorphism can be achieved).
 *       2. Code re-usability.
 * Multiple and hybrid inheritance is not supported in JAVA .
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. 
If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.
 *  */
public class Employee 
{
	int salary= 5000;
}

