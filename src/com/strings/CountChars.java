package com.strings;

import java.util.HashMap;
import java.util.Map;

public class CountChars {
	public static void main(String[] args) {
		String word="aaabbbbcccccddddde";
		Map<Character, Integer> map= new HashMap<>();
		for(Character c: word.toCharArray()){
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
