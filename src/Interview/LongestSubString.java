package Interview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String input ="ABABC";
        char chars[]=input.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
       for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i=map.get(ch);
                map.clear();
            }
       }
        System.out.println(map.keySet().toString());
    }
}
