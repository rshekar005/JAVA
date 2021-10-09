package com.strings;

public class StringReverse {
	public static void main(String[] args) {
		String s="This is a string";
		StringBuffer initailreverse= new StringBuffer(s.replaceAll(" ", ""));
		StringBuffer finalOutput= new StringBuffer(initailreverse.reverse());
		StringBuffer temp= new StringBuffer(finalOutput);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				temp.append(" ");
			}
			else {
				temp.append(temp.charAt(i));
			}
		}
		System.out.print(temp);
	}


}
