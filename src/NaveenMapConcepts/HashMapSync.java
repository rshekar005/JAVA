package NaveenMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * By default HashMap is not synchronized it means multiple threads will execute at a time.
 * 
 * In order to achieve synchronization we can use 
 * 1. HashTable  -- legacy class, Thread Safe , Slow Performance, Null key and values are not allowed
 * 2. SynchronizedMap -- Thread Safe, Slow Performance, null key and multiple null values are allowed
 * 3. ConcurrentHashMap -- Thread Safe, Fast Performance, Null key and values are not allowed
 * 
 * 	  In ConcurrentHashMap --> By default 16 segments are there. Whenever operations is performed like Read or write then it will apply at segment level not for object level.
 *                         --> If thread 1 is using segment one  for writing then it will lock that particular segment not for object level. Thread t2 cannot be used for segment 1 because it is locked by thread t1.
 *                         --> Thread t2 can be used for other segments
 *                         
 *    In HashTable --> By default 16 segments are there. Whenever operations is performed like Read or write then it will apply at segment level but wait operation will apply at object level.
 *    			   --> So thread t2 can be run at a same time. It will wait untill t1 is done.
 * 
 */
public class HashMapSync {

	public static void main(String[] args) {
		
		//synchronizedMap() in collection class
		Map<String, String> map1= new HashMap<String, String>();
		map1.put("1", "Naveen");
		map1.put("2", "Mukesh");
		map1.put("3", "Raghav");
		
		System.out.println(map1 + " HashMap");
		//Above it is not synchronized it means multiple write operations where performed
		
		//1. create synchronizedMap()
		Map<String, String> map2=Collections.synchronizedMap(map1);
		System.out.println(map2 + " synchronizedMap ");
		
		
		// 2. ConcurrentHashMap -- It doesnot throw ConcurrentModificationException
		ConcurrentHashMap<String, String> concurrent= new ConcurrentHashMap<String, String>();
		concurrent.put("1", "Naveen");
		concurrent.put("2", "Mukesh");
		concurrent.put("3", "Raghav");
		System.out.println(concurrent +  " concurrent ");
		
		
		
		
	}

}
