package Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfFirstCount {
    public static void main(String[] args) {
        String input = "rajashekar";
        for(int i=0;i<input.length();i++){
            boolean flag= true;
            for(int j=0;j<input.length();j++) {
                if (i != j && input.charAt(i) == input.charAt(j)) {
                    flag = false;
                }
            }
            if(flag){
                System.out.println(input.charAt(i));
                break;
            }
        }



        /* Using Collection */
        Map<Character, Integer> m = new LinkedHashMap<>();
        char[] c = input.toCharArray();
        for (char cc : c) {
            if (m.containsKey(cc)) {
                m.put(cc, m.get(cc) + 1);
            } else {
                m.put(cc, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : m.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}

