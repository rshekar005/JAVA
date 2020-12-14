package NaveenListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * 
 * @author rajasekhar
 *	
 * Collection is an interface. It is used when objects are growable in nature.It is used to represent a group of individual as a single entity.
 * For memory point of view collections are recommended because size is growable in nature.
 * For retrieval purpose, Arrays are recomended because of limited size.
 * 
 * List:
 * ===============
 * List is a child interface of collection.
 * If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion is preserved then we should go for list interface.
 * Insertion will be preserved by means of index.
 * We can differentiate duplicate objects with the help of index. Hence index places a very important role.
 * Datastructure is Resizable Array or Growable Array.
 * ArrayList internally uses a dynamic array to store the elements.	
 * For Retrieval purpose ArrayList is recommended because it implements RandomAccess Interface. So that any random element can be access with the same speed
 * For Insertion or deletion purpose ArrayList is not recommended because it requires several shift operations. 
 * Objects in ArrayList is not safe as multiple threads executes simultaneously at a time. Hence objects in ArrayList is not thread-safe and it is synchronization.
 * Non-Synchroniztion -- Multiple Threads can access at a same time. Hence synchronization is not thread-safe.Performance is high.
 * All methods are non-synschronized.
 * 
 */

public class ArrayListMethods {
	public static void main(String args[]){
		ArrayList<String> ar1= new ArrayList<>();
		ar1.add("java");
		ar1.add("python");
		ar1.add("Javascript");
		
		System.out.println(ar1);
		ArrayList<String> ar2= new ArrayList<>();
		ar2.add("Devops");
		ar2.add("Testing");
		
		System.out.println(ar2);
		
		/*//It adds arraylist2 to arraylist1
		System.out.println("Add array2 to array1 "+ar1.addAll(ar2));
		System.out.println(ar1);
		//It adds arraylist2 to arraylist1 from index 2
		System.out.println("Add array2 from 2 index to array1 "+ar1.addAll(1, ar2));
		System.out.println(ar1);
		ar1.clear();
		System.out.println(ar1); // It prints empty array
*/		
		//It clones array 1 to clone list array
		ArrayList<String> clonelist = (ArrayList<String>)ar1.clone();
		System.out.println(clonelist);
		
		//Contains returns true or false
		System.out.println(ar1.contains("python"));
		System.out.println(ar1.contains("c"));
		System.out.println(ar1.indexOf("java")>=0);
		
		ArrayList<String> list= new ArrayList<>(Arrays.asList("Naveen","Tom","Jerry","Steve","Lissa","Naveen"));
		System.out.println(list);
		
		int i= list.lastIndexOf("Naveen");
		int j= list.lastIndexOf("test");
		System.out.println("Last index of naveen is "+i);
		System.out.println("Last index of test is "+j); //It returns -1 because it test is not present
		
		list.remove(0); // It removes 0th index object
		System.out.println(list);
		
		list.remove("Lissa"); // It removes based on Object.
		System.out.println(list);
		
		//removeif() will work based on the condition
		ArrayList<Integer> number= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		number.removeIf(num -> num%2!=0);
		System.out.println(number);
		
		// It retains/ prints all the elements in a list which are passed in a method and append it to list
		ArrayList<String> nameslist= new ArrayList<>(Arrays.asList("Naveen","Tom","Jerry","Steve","Lissa","Peter","Tom"));
		nameslist.retainAll(Collections.singleton("Tom"));
		System.out.println(nameslist);
		
		//sublist() will print required listdata from Array1
		ArrayList<Integer> number1= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ArrayList<Integer> sublist= new ArrayList<>(number1.subList(1, 10));
		System.out.println(sublist);
		
		//toArray() 
		ArrayList<String> newlist= new ArrayList<>(Arrays.asList("Naveen","Tom","Jerry","Steve","Lissa","Peter","Tom"));
		Object a[]=newlist.toArray();
		System.out.println(Arrays.toString(a));
		for(Object o:a){
			System.out.println((String)o);
		}
		
	}
}
