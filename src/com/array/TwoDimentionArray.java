package com.array;
/**
 * 
 * @author Shekhar
 * Two dimensional array means with multiple set of rows and columns
 *
 */
public class TwoDimentionArray {
	public static void main(String args[]) {
		int a[][] = new int[3][2];// Two Dimension array. here 3 represent rows
									// and 2 represent column
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		System.out.println("Number of rows :" + a.length);
		System.out.println("Number of columns :" + a[0].length);
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.println(a[i][j]);
			}

		}

		int b[][] = { { 100, 200 }, { 300, 400 } };// 2*2 Dimentional Array
		for (int i[] : b) {
			System.out.println(i);
		}

	}

}
