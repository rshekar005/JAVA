package NaveenTreeMap;

import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author rajasekhar
 *	TreeMap is different from HashMap.
 *	It doesnot maintain any hashing technique.
 *	It's the implementation of SortedMap, which sorts the elements on the basis of Keys (By Default).
    It uses Red-Black Balanced Binary Search Tree to store the keys.
    Insertion order is not preserved. It insert based on sorting technique(ascending) as it implements SortedMap.
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap= new TreeMap<Integer, String>();
		treemap.put(500, "Raghav");
		treemap.put(100, "Naveen");
		treemap.put(200, "Mukesh");
		treemap.put(1100, "Rajashekar");
		treemap.put(50, "GC Reddy");
		
		System.out.println(treemap);
		
		treemap.forEach((k,v)->System.out.println("key is "+k+ " value is "+v));
	
		System.out.println(treemap.lastEntry());
		
		//Here headMap is a method which is same as less than equal to
		Set<Integer> lessthan500=treemap.headMap(500).keySet();
		System.out.println(lessthan500);
		
		//Here tailMap is a method which is same as greater than equal to
		Set<Integer> greaterthan200=treemap.tailMap(200).keySet();
		System.out.println(greaterthan200);
		
		
		

	}

}
