package com.java8;

import java.util.Arrays;
import java.util.List;
/**
 *  Here Predicate function will return only boolean value
 */
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateInterfaceConcept {
	
	public static void main(String args[])
	{
		Predicate<Integer> func= x -> x >5;
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> list2=list.stream().filter(func).collect(Collectors.toList());
		System.out.println(list2);
		
		//predicate with &&
		List<Integer> ll=list.stream().filter(x -> x>5 && x <8).collect(Collectors.toList());
		System.out.println(ll);
		
		//predicate with negate
		
		List<String> names= Arrays.asList("Rajashekar", "Naveen" , "Narayana" , "Nishanth");
		Predicate<String> func2= x -> x.startsWith("Na");
		
		List<String> output=names.stream().filter(func2.negate()).collect(Collectors.toList());
		System.out.println(output);
		
	}

}
