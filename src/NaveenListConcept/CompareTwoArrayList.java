package NaveenListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {
	public static void main(String args[]){
		ArrayList<String> l1= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l3= new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		
		//1 .sort and then equals
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3)); //It returns false because l3 is not sorted.
		Collections.sort(l3);
		System.out.println(l1.equals(l3)); // It return true because l1 and l2 are equals
		
		//2. compare two list and print additional arrays
		ArrayList<String> l4= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l5= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		/*l4.removeAll(l5);//It removes all elements from l4 from l5 and prints E
		System.out.println(l4);*/
		
		// 3. find out the missing elements
		l5.removeAll(l4);//It removes all elements from l5 from l4 and prints F
		System.out.println(l5);
		
		// 4 Find out the common elements.
		ArrayList<String> lang1= new ArrayList<String>(Arrays.asList("JAVA","PYTHON","C#","RUBY","JS"));
		ArrayList<String> lang2= new ArrayList<String>(Arrays.asList("JAVA","PYTHON","C#","RUBY","REACT"));
		
		lang1.retainAll(lang2);// It prints the common elements
		System.out.println(lang1);
	}
}
