package NaveenMapConcepts;

import java.util.Hashtable;
import java.util.Map;

/**
 * 
 * @author rajasekhar
 *	1. HashMap is not synchronized but HashTable is synchronized
 *  2. HashMap is not Thread safe but hash table is thread safe
 *  3. Hash map performs very fast but hash table is very slow
 *  4. HashMap contains one null key and multiple null values but HashTable wont allow null key and null values
 *  5. HashMap contains 16 segment whereas HashTable contains 11 segments but load factor is same 0.75
 *  6. HashTable also stores data in the form key, value pairs but it is a legacy class
 *  
 *  It stores values same as HashMap and reteival also same
 */
public class HashTableDemo {

	public static void main(String[] args) {
		Map<String, Integer> hashtable= new Hashtable<>();
		
		hashtable.put("Naveen", 2000);
		hashtable.put("Tom", 200);
		hashtable.put("Lisa", 1000);
		hashtable.put("Peter", 1000);
		hashtable.put("Roby", 1000);
		
		//hashtable.put(null, 3000); // Throws runtime error
		//hashtable.put("Raja", null); // throws runtime error
		
		System.out.println(hashtable);
		System.out.println(hashtable.get("Naveen"));
		
	}

}
