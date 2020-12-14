package NaveenMapConcepts;

import java.util.HashMap;
import java.util.Map;

/*
 * HashMap contains keys and values
 * It will get store in the form Hashcode --> Hashing
 * Hap internally uses linked list for storing keys
 * Map default size is 16.
 * If we are going to store any key & value. first it will calculate hashcode for key and then index. 
 * Then that will value will get store in the form of bucket. 
 * Each index will be a bucket and it contains has node (key,value) , hashcode, value and next node
 * When we insert any value in map it will not directly store in index.
 * To get clarity put a debugger for Naveen key and check that naveen will get store in index 3.
 * 
 * It will store like Naveen, hashcode, value , nextnode .
 * Next it will insert Tom, for Tom also index is 3 and Hashcode also same. it will point to next node of Naveen.
 * Put a debugger for better clarity.
 * Hashcode of null keys is zero and its index is zero.
 * 
 * In case , if the particular index reaches threshold value (8). Then retrieval time complexity is O(n).
 * like for index 4 -- It contains 8 (k, v) pairs. Retrieval purpose it takes O(n).
 * But in Java 8 , balanced tree came into picture if threashold value is greater than 8 and time complexity will reduce to log(n).
 * If threshold value is less than 8 then it will work normally.
 */
public class HashMapIntenalWork {
	public static void main(String args[]){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Naveen", 100); // index 3
		map.put("Tom", 101); // index 3 but to the next node of Naveen. It means it will be in the form of LinkedList
		map.put("Manoj", 102);
		map.put("Narayana", 103);
		map.put("Tom", 104);
		map.put("Lisa", 105);
		map.put(null, 106); // zero position
		
		System.out.println(map);//output {null=106, Narayana=103, Naveen=100, Tom=104, Manoj=102, Lisa=105}
	}

}
