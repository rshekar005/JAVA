package com.starPatterns;

public class Demo1 {
	public static void main(String[] args) {
		/*
		 	*
            **
            ***
            ****
            *****
		 */
				
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
