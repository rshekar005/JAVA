package com.Abstraction;

public abstract class Vehicle {
	
	public Vehicle getObject() {
		return this;
	}
	
	public void drive() {
		System.out.println("Driving from vehicle");
	}

}
