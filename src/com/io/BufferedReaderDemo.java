package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author rajasekhar
 *  Filereader is used to read data character by character. In order to overcome this problem we should go for BufferedReader
 *  In BufferedReader we can read data line by line with the help of readLine(). Return type is String
 */
public class BufferedReaderDemo {
	
	public static void main(String args[]) throws IOException
	{
		// Here we can't read text file name / folder name directly. In order
		// to achieve we need to use FileReader constructor
		// It can't communicate with the file directly.
		//BufferedReader br= new BufferedReader("xyz2.txt")
		
		BufferedReader br= new BufferedReader(new FileReader("xyz3.txt"));
		br.read();
		//Using below method we can read data line by line. return type of readLine() is String
		String line=br.readLine();
		//It will loop until it finds null
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		//Automatically it will close FileReader().
		br.close();
		
		
		
	}

}
