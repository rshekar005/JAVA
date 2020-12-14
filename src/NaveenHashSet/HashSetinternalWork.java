package NaveenHashSet;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author rajasekhar
 *	By default it maintains hashmap concept.
 *  Values will insert based on hashing.
 *  There is no get method in set interface. We need to use iterate or foreach to fetch the data.
 */
public class HashSetinternalWork {
	public static void main(String args[]){
		Set<String> set= new HashSet<>();
		set.add("java");
		set.add("python");
		set.add("javascript");
		set.add("ruby");
		set.add("csharp");
		
		System.out.println(set);

	}

}
