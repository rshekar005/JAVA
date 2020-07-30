package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author rajasekhar
 * 
 *         Drawback: In FileWriter we need to write (\n) manually inorder to
 *         write data to the next line. In order to overcome FileWriter we
 *         should go for BufferedWriter. Here it has nextLine() is a method which is used to overcome this problem.
 */
public class BufferedWriterDemo {

	public static void main(String args[]) throws IOException {
		// Here we can't write text file name / folder name directly. In order
		// to achieve we need to use FileWriter constructor
		// It can't comunicate with the file directly.
		// Note: BufferedWriter bw= new BufferedWriter("xyz2.txt");

		// 1st contructor
		BufferedWriter bw = new BufferedWriter(new FileWriter("xyz3.txt", true));
		bw.write('r');
		bw.newLine();// This is recommended than (\n) which is used in
						// FileWriter. So, BufferedWriter is recommended
		bw.write(100); // It will write ascill value of 100 (d)
		//It is used instead of writing bw.write(\n). Overcome of FileReader
		bw.newLine();
		char ch[] = { 's', 'h', 'e', 'k', 'a', 'r' };
		bw.write(ch);
		bw.flush();
		// here whenever we are closing bufferedwriter it will automatically
		// close FileWriter also
		bw.close();
	}

}
