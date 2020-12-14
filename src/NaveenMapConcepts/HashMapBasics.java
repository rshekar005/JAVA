package NaveenMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
	public static void main(String args[]){
		
		//No order
		//Unique keys but duplicate values
		//No indexing
		//No thread safe
		//If in map has multiple keys with same name but returns latest value
		//Only one null key but duplicate n number of null values
		HashMap<String ,String> map= new HashMap<String,String>();
		map.put("India", "New Delhi");
		map.put("US", "California");
		map.put("UK", "London");
		map.put("UK", "London1");
		map.put(null, "Berlin");
		map.put(null, "Berlin1");
		map.put("Russia", null);
		map.put("France", null);
		
		/*System.out.println(map.get("UK"));// latest value will fetch
		System.out.println(map.get(null));
		
		System.out.println(map.get("Russia"));
		System.out.println(map.get("France"));*/
		
		// 1st way to fetch data from map
		 Iterator<String> itr=map.keySet().iterator();
		 while(itr.hasNext()){
			String key= itr.next();
			String value= map.get(key);
			System.out.println("Key = " + key + " value = "+value);
		 }
		 System.out.println("*****************");
		 //2nd way
		 for(Entry e: map.entrySet()){
			 System.out.println("Key is "+e.getKey()+ " value is "+e.getValue());
		 }
		 
		 System.out.println(map.remove("France"));
		 System.out.println("*****************");
		 //3rd way using java8
		 map.forEach((k,v) -> System.out.println("key is "+k+ " value is "+v));
	}
}
