package NaveenLinkedListConcepts;

import java.util.Collections;
import java.util.Vector;

/**
 * 
 * @author Shekhar
 * Vector is a legacy class.
 * Underlying data structure is growable array.
 * Insertion Order is preserved and Duplicates are allowed.
 * Insertion order is preserved and null insertion is allowed.
 * Best choice if operation is retrieval.
 * Vector is synchronized and Hence it is thread-safe.
 * Default vector initial capacity can hold 10 objects.
 * New capcity= 2*Initial Capacity.
 *
 *Differences between list and vector. List is not synchronized where as vector is synchronized. 
 *                                     Multiple threads can access simultaneously in list where as in vector , single thread can access at a time.
 *                                     Performance is list is high and vector is low.
 */
public class VectorDemo {

	public static void main(String[] args) {
	  Vector<Integer> myVector= new Vector<>();
		myVector.add(11);
		myVector.add(5);
		myVector.add(80);
		myVector.add(9);
		myVector.add(110);
		myVector.add(12);
		myVector.add(17);
		
		System.out.println(myVector);
		
		//sorting
		Collections.sort(myVector);
		System.out.println(myVector);
		
		System.out.println(myVector.remove(2));
		

	}

}
