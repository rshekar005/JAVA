package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author rajasekhar
 *  Java FileOutputStream is an output stream used for writing data to a file. It will store values in the form of byte array
 */
public class FIleOutputStreamDemo {
	
	public static void main(String args[]) throws IOException
	{
		//If we use File class we need to write f.createNewFile to create a new file but with the help of FileOutputStream we can create a file without  f.createNewFile
		
		FileOutputStream f = new FileOutputStream("xyz1.txt");
		f.write(65);//Here it will store the ascii value of 65 -- A
		
		System.out.println("Sucess");
		
		//In FileOutputStream we cannot write string in file. We need to convert into byte and then need to write into a file
		String s= "Welcome to FileOutputconcept";
		byte[] b= s.getBytes();//which is used to convert string into byte array
		//Inorder to write String data then we need to convert into bytes
		f.write(b);
		f.close();
		System.out.println("success");
		
	}

}
