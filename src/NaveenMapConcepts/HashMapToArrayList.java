package NaveenMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ComponentInputMap;

// Question: we want to write company name in one array list and number of employees in one array list

public class HashMapToArrayList {

	public static void main(String[] args) {

		// This map contains String -- company name , integer -- number of
		// employees in a company.
		// Now we want to store company name in one array list and number of
		// employees in one array list
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Walmart", 10000);
		compMap.put("ThoughtWorks", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 50000);
		compMap.put("Google", 60000);

		Iterator itr = compMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pairs = (Map.Entry) itr.next();
			System.out.println("Company name is " + pairs.getKey() + " number of employees are " + pairs.getValue());
		}

		// convert Hashmap keys to ArrayList<String>
		List<String> companyList = new ArrayList<String>(compMap.keySet());
		System.out.println("Number of companies "+companyList.size());
		for (String name : companyList) {
			System.out.println("names of the company " + name.toUpperCase());
		}

		// convert Hashmap values to ArrayList<String>
		List<Integer> numberofEmployees = new ArrayList<Integer>(compMap.values());
		System.out.println("Number of employees "+numberofEmployees.size());
		for (Integer i : numberofEmployees) {
			System.out.println("names of the company " + i);
		}
		
		
		compMap.forEach((k,v)-> System.out.println("key is "+k+" value is "+v));
	}

}
