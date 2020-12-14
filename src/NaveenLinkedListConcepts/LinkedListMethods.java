package NaveenLinkedListConcepts;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
	
	public static void main(String args[]){
		// 1. Constructors
		
		LinkedList<String> ll= new LinkedList<String>();
		System.out.println(ll.size());
		ll.add("Tom");//0
		ll.add("Naveen"); // 1 This node points to next of first node. Put a debugger to get know more details internally.
		ll.add("Raja"); // 2
		ll.add("Shekar"); // 3
		System.out.println(ll.size());
		System.out.println(ll);
		System.out.println(ll.get(0));
		
		Iterator<String> itr= ll.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		ll.add(3,"Manoj"); // Here it will add 3 index and Shekar will move to 4th position. Shift operation done very easily/
		System.out.println(ll);
		
		LinkedList<String> users = new LinkedList<>();
		users.add("Peter");
		users.add("Tom");
		users.addAll(ll); // It will add ll collection list to users list
		
		System.out.println(users);
		users.addFirst("Kamala");
		System.out.println(users);
		users.addLast("Saroja");
		System.out.println(users);
		
		users.removeIf(user -> user.contains("Manoj"));
		System.out.println(users);
		
		LinkedList<String> lang= new LinkedList<>();
		lang.add("Java");
		lang.add("Python");
		lang.add("Javascript");
		lang.add("Ruby");
		
		//print in reverse order
		Iterator<String> itr1= lang.descendingIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		// sort
		Collections.sort(lang);
		System.out.println(lang);//[Java, Javascript, Python, Ruby]
		
		
	}

}
