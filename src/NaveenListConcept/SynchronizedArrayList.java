package NaveenListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1 : Collections.synchronizedList
		List<String> list=Collections.synchronizedList(new ArrayList<String>());
		list.add("Java");
		list.add("Ruby");
		list.add("Python");
		list.add("javascript");
		
		//add, remove -- we don't need explicit synchronization
		//To Fetch the values we need to use explicit synchronization
		synchronized (list) {
			Iterator<String> it= list.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
		}
		
		System.out.println("*****************************************");
		//2. copyOnWriteArrayList -- its a class
		CopyOnWriteArrayList<String> employeeList= new CopyOnWriteArrayList<String>();
		employeeList.add("Rajashekar");
		employeeList.add("Narayana");
		employeeList.add("Madhu");
		employeeList.add("vasu");
		
		//Here we don't need explicit synchronization for any opertaion : add/remove/fetch
		Iterator<String> itr= employeeList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
