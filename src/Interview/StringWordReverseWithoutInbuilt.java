package Interview;

import java.util.ArrayList;

public class StringWordReverseWithoutInbuilt {
    public static void main(String[] args) {
        String str = "Hello World Selenium!";
        ArrayList<String> wordList = new ArrayList<>();
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                wordList.add(word);
                word = "";
            }
            if(i==str.length()-1) {
                wordList.add(word);
            }
        }
        for(int i= wordList.size()-1;i>=0;i--){
            System.out.print(wordList.get(i)+ " ");
        }
    }

}
