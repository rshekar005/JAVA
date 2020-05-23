package com.java8;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {
	
	public static void main(String args[])
	{
		// takes no argument and return a result:
		getText(()-> "java");
		getText( ()  -> "Rajashekar");
		
		
	}
	public static void getText(Supplier<String> name)
	{
		System.out.println(name.get().length());
	}

}
