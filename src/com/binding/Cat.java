package com.binding;

public class Cat extends Animal{

	void eat()
	{
		System.out.println("Cat is eating");
	}
	public static void main(String[] args) {
        Animal a = new Cat();//Upcasting when parent class reference variable is pointed to child class object then it is called as "Upcasting"
        a.eat();
	}

}
