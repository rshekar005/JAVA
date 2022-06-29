package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCountChars {
    public static void main(String[] args) {
        String str="abcaabbccaaabbbd";
        char ch[]=str.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for(Character c:ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
       for(Map.Entry<Character,Integer> entry : map.entrySet()){
           System.out.print(entry.getKey()+""+entry.getValue());
       }

    }
}
