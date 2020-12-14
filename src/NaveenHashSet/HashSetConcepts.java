package NaveenHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Shekhar
 * Set -- it is an Inteface
 *     -- Insertion order is not preserved.
 *     -- If we want to represent a group of objects as a single entity where insertion order is not preserved then we should go for Set.
 *     -- Duplicates are not allowed.
 *     -- Underlying data structure is Hash table"
 *     -- Insertion will happen based on hashing.
 *     -- Null insertion is possible only once because duplicate values are not allowed.
 *     -- when we add duplicate objects it won't throw C.E and R.E add() simply returns false
 *     
 *     
 * Linked Hash Set -- It is a child inteface of Set.
 *                  --  Underlying data structure is linked list and Hash table.
 *                  -- Insertion is preserved where as in HashSet insertion order is not preserved.
 *                  
 * Tree Set -- Duplicates are not allowed.
 *           -- Insertion Order is based on Default Natural Sorting Order(Ascending Order) -- Comparable.
 *           -- Comparable is an interface.
 *           -- Comparable interface internally uses compareTo(). Based on the method objects will insert.
 *           -- Creates an empty treeset object when insertion order is D.N.S.O.
 *           -- Throws N.P.E when user tries to input null object
 */

public class HashSetConcepts {

	public static void main(String[] args) {
		
		Set<String> hashset= new HashSet<>();
		hashset.add(null);
		hashset.add("Testing");
		hashset.add("Alpha");
		hashset.add("Beta");
		hashset.add("Testing"); // It will not throw C.E or R.E but while printing it wont't print.
		
		System.out.println(hashset);

		System.out.println(hashset.contains("Alpha")); // true
		
		Iterator<String> itr= hashset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		hashset.remove("Beta");
		System.out.println(hashset);
		
		Set<Integer> first= new HashSet<>();
		first.addAll(Arrays.asList(1,6,0,2,6,8,9,4));
		
		Set<Integer> second= new HashSet<>();
		second.addAll(Arrays.asList(1,4,3));
		
		//union -- prints all the elements by eliminating duplicates
		Set<Integer> union= new HashSet<>(first);
		union.addAll(second);
		System.out.println(union);
		
		//intersection -- prints the common elements
		Set<Integer> intersection= new HashSet<>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		//Get the differences
		Set<Integer> difference= new HashSet<>(first);
		intersection.removeAll(second);
		System.out.println(difference);
		
	}

}
