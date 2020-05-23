package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class StreamFilterCollect {
	
	public static void main(String args[])
	{
		List<String> productlist = Arrays.asList("Macbook", "Dell" , "Shoes" , "Battery" , "iPhone" , "MI");
		//System.out.println(productlist); // It return as list of array
		
		//productlist.forEach(ele -> System.out.println(ele)); // Returns one by one
		
		//It will print arrays list with out shoes as we are filtering without shoes
		List<String> list= productlist.stream().filter(ele -> !ele.equals("Shoes")).collect(Collectors.toList());
		list.forEach(System.out :: println);
		
	}

}
