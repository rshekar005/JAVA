package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilerAndOrElse {

	public static void main(String[] args) {
		
		List<Customer> cust= Arrays.asList(
				new Customer("Raja", 20),
				new Customer("Narayana", 30),
				new Customer("Rajendar", 31)
				);
		
		// with filter find any
		Customer customer =cust.stream() // convert to stream
		.filter(ele -> "Raja".equals(ele.getName())) // filter for raja
		.findAny() // if it finds then return result
		.orElse(null);
		
		System.out.println(customer.getName()+ " " +customer.getAge());
		
		System.out.println("*****************");
		
		//Filter did not find any print orElse
		Customer customer1 =cust.stream() // convert to stream
				.filter(ele -> "Rajashekar".equals(ele.getName())) // filter for rajashekar
				.findAny() // if it finds then return result
				.orElse(null);
		System.out.println(customer1);
		System.out.println(customer1.getName());
		
		
		//Filter based on multiple condition
		
		
		

	}

}
