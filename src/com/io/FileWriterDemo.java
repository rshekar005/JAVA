package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author rajasekhar
 * Java FileWriter class is used to write character-oriented data to a file. 
 * It is character-oriented class which is used for file handling in java.
 * 
 * Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
 * 
 * Drawback of FileWriter we have to insert to line seperator (\n) manually. Inorder to jump to next line.
 */
public class FileWriterDemo {
	
	public static void main(String args[]) throws IOException
	{
		//Below two constructors  performs overiding of existing data
		//1st constructor
		//Here it will create a file. But using File class will need to write fw.createNewFile().
		FileWriter fw= new FileWriter("abc.txt");
		
		//2nd constructor
		File f= new File("xyz.txt");
		f.createNewFile();
		FileWriter fw2= new FileWriter(f);
		
		//Below two constructors are used to append data to existing data
		
		//3rd constrctor
		FileWriter fw3= new FileWriter("xyz2.txt",true);
		
		
		//4th constructor
		File f2= new File("xyz.txt");
		f2.createNewFile();
		FileWriter fw4= new FileWriter(f, true );
		
		
		//Methods of FileWriters
		fw.write(100);// It will add d character in abc.txt 100 ascill value is d
		fw.write("urga\nsoftware solutions");
		fw.flush();// It is the method which will give guarantee that total data including last character will enter in the data 
		fw.close(); // It close the connection
		
		
		char ch[]={'a','b','c','d','e','f'};
		fw2.write(ch);
		fw2.flush();
		fw2.close();
		
		//If we run above 1st and 2nd constructor every time it will override a content
		
		//3rd and 4th contructors
		fw3.write("Durga soft");
		fw3.write("\n"); //Drawback of FileWriter we have to insert to line seperator (\n) manually.
		fw3.flush();
		fw3.close();
		
		
		
		
		
		
		
	}

}
