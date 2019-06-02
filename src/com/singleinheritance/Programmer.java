package com.singleinheritance;

public class Programmer extends Employee {

	int bonus=1000;
	public static void main(String[] args) 
	{
		Programmer p = new Programmer();
		System.out.println("Programmer salry is  "+p.salary);
		System.out.println("Bonus is "+p.bonus);
       
	}

}
