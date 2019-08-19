package com.strings;
/**
 * 
 * @author Shekhar
 *
 *A part of string is called substring. In other words, substring is a subset of another string. 
 *In case of substring startIndex is inclusive and endIndex is exclusive.
 */
public class StringSubstring 
{
	public static void main(String args[])
	{
		String s= "Rajashekar";
		System.out.println(s.substring(0));//Here Staring Index starts with 0 then it prints all characters present for a string.
		System.out.println(s.substring(0, 5)); // Here starting index is 0 means it start with R and endswith 5 means(5-1) upto 5.
		System.out.println(s.substring(4, 6));
	}

}
