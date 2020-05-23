package com.jdk8.streams.flapmap;

import java.util.Arrays;
import java.util.stream.Stream;
/**
 * 
 * @author rajasekhar
 * In Java 8, Stream can hold different data types, for examples:
Stream of String[]
Stream of Set of String
Stream of List of String
Stream of List of Object

But, the Stream operations (filter, sum, distinct…) and collectors do not support it.
so, we need flatMap() to do the Stream conversion.
 */
public class StreamsWithStringArrayWithFlapMap {

	public static void main(String[] args) {
		
		String data[][]= new String[2][2];
		data[0][0]="a";
		data[0][1]="b";
		data[1][0]="c";
		data[1][1]="d";
		
		//Here if we don't use filtermap then output willnot come becuase filter() will not apply for Stream<String> as mentioned above notes.
 	Stream<String> datacollection=	Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x-> "a".equals(x.toString()));
		datacollection.forEach(x -> System.out.println(x));
		

	}

}
