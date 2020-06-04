package com.strings;

public class StringCapitalizeFirstWord {

	public static void capitalizeWord(String str)
	{
		String w[]= str.split("\\s");
		String capital="";
		System.out.println("Lenght is "+w.length);
		for(int i=0;i<w.length;i++)
		{
			String first=w[i].substring(0,1); // first character of the word.
			String remaining=w[i].substring(1); //Other than first character
			capital= capital+first.toUpperCase()+remaining+" ";	
		}
		System.out.println(capital);
	}
	public static void main(String[] args) {
		
		capitalizeWord("my name is shekar");

	}

}
