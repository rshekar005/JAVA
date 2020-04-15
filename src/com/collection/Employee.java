package com.collection;

public class Employee 
{
	String name;
	String address;
	
	public Employee(String name, String address)
	{
		this.name=name;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

}
