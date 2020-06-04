package com.jdk8.streams.flapmap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {
		
		//Sequential stream
		Stream stream=Stream.of("Rajashekar","Manoj","Chimpi","Amar");
		stream.forEach(x -> System.out.println(x));
		System.out.println("************************");
		//Sequential stream
		Arrays.asList("a1","a2","a3","a4").stream().findFirst().ifPresent(System.out:: println);
		System.out.println("************************");
		//Range 1 to 5
		IntStream.range(1, 5).forEach(x -> System.out.println(x));
		
		System.out.println("************************");
		Arrays.stream(new int[] {1,2,3,4})
				.map(n -> 2*n+1)
				.average()
				.ifPresent(System.out:: println);
		System.out.println("************************");
		// String data objects (Here from string we are removing characters and finding the max digit from given string
		Stream.of("a1","a2","a3","a10").
		    map(s -> s.substring(1)).
		    mapToInt(Integer :: parseInt).
		    max().
		    ifPresent(System.out:: println);
		System.out.println("************************");
		// doubles to string object
		
		Stream.of(1.0,2.0,3.0).
		mapToInt(Double:: intValue).
		mapToObj(i -> "a" + i).
		forEach(System.out:: println);
		
		System.out.println("************************");
		//Limit 
		Stream.iterate(0, n->n+1).limit(10).forEach(System.out:: println);
		
		System.out.println("************************");
		
		//Print odd numbers
		Stream.iterate(0, n-> n+1)
		.filter(x -> x%2!=0)
		.limit(5).
		forEach(System.out:: println);
		
		
	}

}
