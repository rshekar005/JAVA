package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author rajasekhar
 * 
 * We can use this to find number of occurences
 */
public class QuantifiesDemo {
	public static void main(String args[])
	{
		Pattern p = Pattern.compile("a+");//If a exactly one a 
		//If a+ atleast one a
		Matcher m = p.matcher("abaacaaadaaaa");
		while(m.find())
		{
			System.out.println(m.start()+".."+m.group());
		}
		
		System.out.println("Searching with a*");
		Pattern p2 = Pattern.compile("a*");//If a* any number of a including zero number of a
		Matcher m2 = p2.matcher("abaacaaadaaaa ");
		while(m2.find())
		{
			System.out.println(m2.start()+".."+m2.group());
		}
		
		System.out.println("Searching with a?");
		Pattern p3 = Pattern.compile("a?");//If a? atmost one a (means either one a or zero number of a's)
		Matcher m3 = p3.matcher("abaacaaadaaaa ");
		while(m3.find())
		{
			System.out.println(m3.start()+".."+m3.group());
		}
	}

}
