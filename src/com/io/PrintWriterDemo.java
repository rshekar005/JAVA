package com.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 
 * @author rajasekhar
 * Where ever writing data into file, recommended one is PrintWriter. because it is the enhanced PrintWriter.
 * 
 * Problems:
 * 1. Using FileWriter we need to use explicitly (\n)
 * 2. Using BufferedWriter we need to write nextLine()
 * 
 * We have to use any of this. It makes some problem.
 * like - bw.write(100) --> It will write 'd' in file. In order to write 100 in file then we need to pass in the form of bw.write("100").
 *      - bw.write(10.5) --> Compiler throw error.
 *      - bw.write(true) --> boolean also not possible.
 *      
 *      1. Compulsory we need to write every thing in string insert character. In order to achieve this problem we use PrintWriter.
 *      2. PrintWritter has method pw.println() --> It will write in next line. But in FileWriter and BufferedWriter we need to write above mentioned methods (\n) in FileWriter and readLine() in BufferedWriter
 *      3. PrintWriter will directly communicate with the file unlike BufferedReader
 *    
 */
public class PrintWriterDemo {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		//Below constructor will create a new file with abc2.txt in cwd.If already exists it will write on the existing file
		PrintWriter pw= new PrintWriter("abc.txt");
		//Here it will write 100 in File
		pw.print(100);
		//Here it will write d in file but it will append to 100. 
		pw.write(100); 
		pw.println('c');//This will also add to 100d --> 100dc then it will point to next line
		pw.print(true);//This will add to new line
		pw.flush();
		pw.close();
		
		
	}

}
