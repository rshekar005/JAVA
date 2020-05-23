package com.jdk8.streams.flapmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSetFilterMap {
	
	public static void main(String args[])
	{
		Set<String> devices = new HashSet<>();
		devices.add("iPhone8");
		devices.add("Samsung10");
		devices.add("iPhoneXR");
		
		Employee emp = new Employee();
		emp.setName("Rajashekar");
		emp.setDevices(devices);
		
		
		Set<String> devices1 = new HashSet<>();
		devices.add("iPhone8");
		devices.add("Redmi");
		devices.add("Windows10");
		
		Employee emp1 = new Employee();
		emp1.setName("Narayana");
		emp1.setDevices(devices1);
		
		
		List<Employee> emplist= new ArrayList<Employee>();
		emplist.add(emp);
		emplist.add(emp1);
		
		List<String> deviceNames =emplist.stream()
		.map(x -> x.getDevices()) //Stream<Set<String>>
		.flatMap(x -> x.stream()) //Stream<String>
		.collect(Collectors.toList());
		
		deviceNames.forEach(x -> System.out.println(x));
	}

}
