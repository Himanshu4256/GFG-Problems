package com.company;

import java.util.HashSet;


// Not Completed this program
public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcdab"; //abcd
        longest(str);
    }
    private static String longest(String str){
        HashSet<Character> set = new HashSet<>();
        String l1 = "";
        String l2 = "";

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if (set.contains(c)){
                l2="";
                set.clear();
            }
            set.add(c);
            l2 = l2+c;
            if (l2.length()>l1.length()){
                l1 = l2;
            }

        }

        return l1;
    }

}