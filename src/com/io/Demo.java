package com.io;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author rajasekhar
 * 
 * To Store Huge amount of data we recommend data base
 * To Store Small amount of data file is required.
 * 
 * To write text data then we go for FileWriter and for read then we go for FileReader.
 * 
 * Drawback of FileWriter we have to insert to line seperator (\n) manually. Inorder to jump to next line. So, BufferedWritter is preferable
 * By using FileReader we can read data character by character which is not convenient. So, BufferedReader is preferable.
 * 
 * But again some problems with BufferedReader and BufferedWritter -- PrintWriter.
 */
public class Demo {
	
	public static void main(String args[]) throws IOException
	{
		//File is a class. First it will check whether file with abc.txt is present or not. If present then performs actions on the file
		//f is a reference of File object
		//Here just create a java File Object
		File f= new File("abc.txt");//Here it is a file
		System.out.println(f.exists()); //Here it will print false. It is nothing but file is not created.
		f.createNewFile();//Here physical file will create
		System.out.println(f.exists());//It will create a file with abc.txt	
		
		// Here making a directory
		File f2= new File("shekar"); 
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.exists());
		
		
		//File contructors
		// 1.  Create a new file with demo.txt in current working directory
		File f3= new File("demo.txt");
		f3.createNewFile();
       
		
		//2. code to create a directoty named with shekar123 in current working directory and create a file named with abc.txt in that directory
		File f4= new File("shekar123");
		f4.mkdir();
		File f5= new File(f4, "abc.txt");
		f5.createNewFile();
		
		
		
	}
	

}
