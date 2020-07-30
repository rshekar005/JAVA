package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo{
	
	public static void main(String args[]) throws IOException
	{
		File f= new File("xyz1.txt");
		FileInputStream fis= new FileInputStream(f);
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
		fis.close();
	}

}
