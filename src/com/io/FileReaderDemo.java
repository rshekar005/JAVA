package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author rajasekhar
 * 
 * To Read data from the file then we should go for FileReader. It is used to read character data from the file.
 * It is very low recommended reader.
 * 
 * In FileReader we need to perform typecasting then it will return unicode(ascii) value of characters. So it compulsory to convert typecast.
 * 
 * By using FileReader we can read data character by character which is not convenient. So, BufferedReader is preferable.
 */
public class FileReaderDemo {
	
	public static void main(String args[]) throws IOException
	{
		//1st constructor. File has to created manually. It will not create automatically.
		FileReader fr= new FileReader("xyz3.txt");
		System.out.println(fr.read()); //Return type is int. It will print unicode value of first character which present in above file.Return type is int.
		int i= fr.read();
		
		//Inorder to print all the data from text file then we need to write below line.
		//Here -1 will check for the last character
		while(i!=-1)
		{
			char c= (char)i; //converting ascii value to character
			System.out.print(c);
			i=fr.read();
		}
		fr.close();
		
		System.out.println();
		//2nd constructor
		//This approach is better when character present in file is upto int range
		File f= new File("xyz.txt");
		FileReader fr2= new FileReader(f);
		int i2=(int)f.length();//Here type casting with int because f.lenght() return long.
		char[] c= new char[i2];
		fr2.read(c);
		for(char ch: c)
		{
			System.out.println(ch);
		}
		fr2.close();
		
		
	}

}
