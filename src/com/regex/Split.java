package com.regex;

import java.util.regex.Pattern;

public class Split {
	public static void main(String args[]){
		
		System.out.println("Split based on space");
		Pattern p = Pattern.compile("\\s");
		String[] s=p.split("Teqsar private limited");
		for(String s2:s)
		{
			System.out.println(s2);
		}
		
		System.out.println("=======Split based on 'a' character=========");
		Pattern p2 = Pattern.compile("a");
		String[] s2=p2.split("Teqsar private limited");
		for(String s3:s2)
		{
			System.out.println(s3);
		}
		
		System.out.println("====Split based on '.'=====");
		Pattern p3 = Pattern.compile("\\."); //It is same as //"[.]"
		String[] s3=p3.split("www.teqsar.com");
		for(String s4:s3)
		{
			System.out.println(s4);
		}
	}

}
