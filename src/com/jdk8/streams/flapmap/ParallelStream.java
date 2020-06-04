package com.jdk8.streams.flapmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		
		// 1. 
		Stream stream = Stream.of("Rajashekar","Manoj","Chimpi","Amar","Rajendar","Anil");
		System.out.println("-------Sequentail Order-----------");
		stream.forEach(System.out:: println);
		Stream stream2 = Stream.of("Rajashekar","Manoj","Chimpi","Amar","Rajendar","Anil");
		System.out.println("----------Parallel order -----Random order");
		stream2.parallel();
		stream2.forEach(System.out::println);
		
		//Using parallelStream() for collection
		System.out.println("------------------Parallel Stream method for collection api----------------");
		Arrays.asList("Sachin","David","Sehwag","Dhoni","Kohli").parallelStream().forEach(System.out::println);
		
		//Range 1 to 10
		System.out.println("Numbers in Parallel (Random)");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		
		// characters from a to z
		System.out.println("Characters in normal form");
		System.out.println(getAlphabets());
		System.out.println("Characters in normal form using streams");
		getAlphabets().stream().forEach(System.out:: println);
		System.out.println("-----------------Parallel streams----------------------");
		getAlphabets().parallelStream().forEach(System.out:: println);
		
		//Check stream is running in parallel
		IntStream range=IntStream.rangeClosed(10, 20);
		System.out.println(range.isParallel());
		
		IntStream range1=IntStream.rangeClosed(10, 20);
		range1.parallel();
		System.out.println(range1.isParallel());

	}
	
	public static List<String> getAlphabets()
	{
		List<String> alpha = new ArrayList<String>();
		int n=97;
		while(n<=122)
		{
			char c= (char) n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}

}
