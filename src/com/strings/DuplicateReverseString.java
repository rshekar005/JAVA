package com.strings;

public class DuplicateReverseString {
    public static void main(String[] args) {
        String str = "Selenium is an web automation tool";
        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

        String[] word = str.split(" ");
        System.out.println(word.length);
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i] + " ");
        }

    }
}
