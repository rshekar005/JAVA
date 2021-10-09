package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestElement {
	public static void main(String[] args) {
		Integer a[]= {10,20,1,6,19,25,40};
		//Using Collections
		List<Integer> list=Arrays.asList(a);
		Collections.sort(list);
		int length= a.length;
		System.out.println(list.get(length-2));
		
		int b[]= {10,20,1,6,19,25,40};
		//Using for loop
		int temp = 0;
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(a[i]>a[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println(b[b.length-2]);
	}

}
