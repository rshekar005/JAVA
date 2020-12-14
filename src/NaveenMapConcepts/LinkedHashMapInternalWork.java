package NaveenMapConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author rajasekhar
 * 
 * 1. It maintains insertion order
 * 2. It stores the values in a node (Doubly linked list)
 * 3. It is also not a synchronized
 * 4. It can have one null key and multiple null values.
 * 5. Structure of Node is doubly linked list
 * 6. Number of segments in a map is 16. Each segment is a node
	  A node contains starting node, key, value , next node.
   7. In HashMap it uses internally linkedList.
 * 
 * DoublyLinkedList in LinkedHashMap
 * ==========================================================
 * 
 * map.put("Tom", 100);
 * map.put("Naveen" 200);
 * map.put("Jerry" 300);
 * 
 * From above first it will calculate hashcode for Tom and then it will module(Hashcode) which will return index.
 * Based on index value it will insert record in a node.Example node is 4. A node contains starting node, key, value , next node.
 * Next, it will check for Naveen and it will insert in 6th node. But Before point of 6th node will point to After node of 4th node.
 * Next, it will check for Jerry  and it will insert in 8th node. But Before point of 8th node will point to After node of 6th node.
 * 
 * In this manner all nodes are linked with each other and it maintains insertion order. For Reference please find the attachment(LinkedHashMapInternalWork)
 * 
 * How objects got inserted in the same order it will retrieve the data. But in HashMap it is different
 * 
 * Main difference between HashMap and LinkedHashMap is insertion order maintained by LinkedHashMap but in HashMap it won't
 */
public class LinkedHashMapInternalWork {
	
	public static void main(String args[]){

	Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	map.put("Lisa", 105);
	map.put(null, 106); // zero position
	map.put("Naveen", 100); 
	map.put("Manoj", 102);
	
	map.put("Tom", 104);
	
	map.put("Narayana", 103);
	
	System.out.println(map);//{Lisa=105, null=106, Naveen=100, Manoj=102, Tom=104, Narayana=103}
	
	}

}
