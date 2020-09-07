package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author rajasekhar
 * 
 * Character clauses

1. [abc] --> Either 'a' or 'b' or 'c'
2. [^abc]  --> Except 'a','b' and 'c'
3. [a-z]  --> Any lower case alphabet symbol
4. [A-Z] --> Any upper case alphabet symbol
5. [a-zA-z] --> Any alphabet
6. [0-9] --> Any digit from 0-9
7. [a-zA-z0-9] --> Any alphanumberic character
8. [^a-zA-z0-9] --> Except alphanumberic character i.e special character

 *
 */
public class CharacterClauseDemo {
	public static void main(String args[]){
		Pattern p = Pattern.compile("[abc]");// It means either 'a','b' and 'c'. For reference please find the note.txt file
		Matcher m=p.matcher("ab$1(1ckKA");
		/*
		 * ab$1(1ckKA
		 * 0123456789
		 */
		while(m.find()){
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
