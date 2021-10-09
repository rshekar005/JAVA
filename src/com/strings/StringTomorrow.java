package com.strings;

public class StringTomorrow {
	
	public static void main(String[] args) {
		String s= "tomorrow";
		StringBuffer finalOutput= new StringBuffer();
		int count=0;
		for(char c: s.toCharArray()) {
			if(c=='o') {
				count++;
				for(int j=0;j<count;j++) {
					finalOutput.append("#");
				}
			}
			else {
				finalOutput.append(c);
			}
		}
		System.out.println(finalOutput);
	}

}
