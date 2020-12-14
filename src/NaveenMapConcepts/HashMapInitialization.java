package NaveenMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;
	
	static{
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	
	public static void main(String[] args) {
		// 1. Using HashMap
		
		HashMap<String, String> map1= new HashMap<>();
		          //or
		Map<String , String> map2 = new HashMap<>();
		
		// 2. using static block
		System.out.println(marksMap.get("A"));
		
		// 3. Immutable(cannot be change) Map with only one single entry
		Map<String, Integer> map3=Collections.singletonMap("test", 400);
		System.out.println(map3.get("test"));
		//map3.put("abc", 500); // It will get UnsupportedOperationException because immutable map will store only single key and value
		System.out.println(map3.get("abc"));
		
		// 4. JDK 8
		// creating one 2D array of Strings using Stream and collecting in the form of Map
		Map<String, String> map4= Stream.of(new  String[][]{
			{"Tom","A"},
			{"Raja","B"}
		}).collect(Collectors.toMap(data ->data[0], data ->data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A+ Grade");
		System.out.println(map4.get("Lisa"));
		
		// Using SimpleEntry
		Map<String, String> map6=Stream.of(
				new AbstractMap.SimpleEntry<>("Naveen","java"),
				new AbstractMap.SimpleEntry<>("Tom", "Pyton")
				).collect(Collectors.toMap(Map.Entry:: getKey, Map.Entry:: getValue));
		
		System.out.println(map6.get("Naveen"));
		map6.put("Narayana", "C#");
		System.out.println(map6.get("Narayana"));
	}

}
