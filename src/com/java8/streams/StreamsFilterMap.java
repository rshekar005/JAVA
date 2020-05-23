package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsFilterMap {
	
	public static void main(String args[])
	{
		List<Customer> cust= Arrays.asList(
				new Customer("Raja", 20),
				new Customer("Narayana", 30),
				new Customer("Rajendar", 31)
				);
		
		String name =cust.stream() // convert to stream
				.filter(ele -> "Raja".equals(ele.getName())) // filter for raja
				.map(Customer :: getName)
				.findAny()
				.orElse(null);
		
		System.out.println(name);
		
		System.out.println("***************************");
		List<String> names =cust.stream()
		.map(Customer :: getName)
		.collect(Collectors.toList());
		
		names.forEach(custname -> System.out.println(custname));
	}

}
