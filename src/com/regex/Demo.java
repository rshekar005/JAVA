package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author rajasekhar
 * Regular Expression: It is a group of string according to a particular forms
 * 
 * Pattern is a class, compile is method in pattern which is used to find based on string and return type is Pattern
     public static Pattern complile(String s);
     Matcher object, matcher method is in pattern class. It is used to find required pattern in a string.		
 * 
 */
public class Demo {
	
	public static void main(String args[])
	{
		String x= "ababaaaab";
		int count=0;
		
		Pattern p = Pattern.compile("ab");
		
		Matcher m = p.matcher(x);
		//It will search. Return type is boolean if it is true. It will go to condition
		while(m.find())
		{
			//ababaaaab
			//012345678
			//Here ab occurs on 0,2,7 index.
			count++;
			//Returns the start index of the previous match.The index of the first character matched
			//m.start() -- Starting index
			//m.end() -- ending index. It will return end index+1;
			//m.group -- exact match and return type is String
			System.out.println(m.start()+"----"+m.end()+"----"+m.group());	
		}
		System.out.println("The total number of occurences is "+count);
		
	}

}
