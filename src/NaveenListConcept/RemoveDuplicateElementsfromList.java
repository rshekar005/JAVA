package NaveenListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsfromList {
	public static void main(String args[]){
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6));
		
		//1. Using LinkedHashSet
		LinkedHashSet<Integer> linkedhashset= new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> duplicatelist= new ArrayList<Integer>(linkedhashset);
		System.out.println("After removing duplicate elements "+duplicatelist);
		
		// 2 Java8 streams
		ArrayList<Integer> markslist= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6));
		List<Integer> duplicatemarks=	markslist.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicatemarks);
		
	}

}
