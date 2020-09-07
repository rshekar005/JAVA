package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author rajasekhar
 * \s -- searching for space character
 * \S -- except space character it holds any character
 * \d -- any digit from [0-9]
 * \D -- except digit any character
 * \w -- any word character(aplanumeric [a-zA-Z0-9]
 * \W -- except alphanumeric i.e accept special character
 * . --> Any character
 * 
 * If we write \s or \d or \w then we will get compile time error then we get illegal escape character because java does'nt know about '\'. 
 * Inorder to solve we need to use '\\s'
 */
public class PreDefinedCharacterClauses {
	
	public static void main(String args[])
	{
		Pattern p = Pattern.compile("\\s"); // searching for space
		Pattern p2= Pattern.compile("\\d"); // search for digits
		Pattern p3= Pattern.compile("\\w"); // search for words (i.e [a-zA-z0-9]
		Matcher m = p.matcher("ab@A 12#,A");
		Matcher m2 = p2.matcher("ab@A 12#,A9");
		Matcher m3 = p3.matcher("ab@A 12#,A9");
		while(m.find())
		{
			System.out.println("only space");
			System.out.println(m.start()+".."+m.group());
		}
		System.out.println("only digits");
		while(m2.find())
		{
			
			System.out.println(m2.start()+".."+m2.group());
		}
		System.out.println("It includes a-zA-Z0-9");
		while(m3.find())
		{
			
			System.out.println(m3.start()+".."+m3.group());
		}
	}
	

}
