package com.io;

import java.io.File;
import java.io.IOException;

public class FileMethods 
{
	
	public static void main(String args[]) throws IOException
	{
		File f= new File("shekarfolder");
		f.mkdir();//Creates a directory
		File f2= new File(f, "abc.txt");
		f2.createNewFile(); //creates a file in specified directory
		System.out.println(f2.exists());//It returns whether file exits in cwd.
		System.out.println(f2.isFile());
		System.out.println(f.isDirectory());
		File f3= new File(f, "abc1.txt");
		f3.createNewFile(); 
		File f4= new File(f, "abc2.txt");
		f4.createNewFile(); 
		File f5= new File(f, "abc3.txt");
		f5.createNewFile(); 
		File f6= new File(f, "abc4.txt");
		f6.createNewFile(); 
		
		String s[]=f.list();
		int count = 0;
		System.out.println("Files inside "+f.getName()+ " are ");
		for(String s2 : s)
		{
			count++;
			System.out.println(s2);
		}
		
		System.out.println("");
		System.out.println("Number of files are "+count);
		System.out.println(f6.length());//It prints the character count in console
	}
	
	

}
