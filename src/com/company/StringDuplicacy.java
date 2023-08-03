package com.company;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicacy {
    public static void main(String[] args) {
        Map<Character,Integer> m = new HashMap<>();
        String s = "aaabbbcccdde";
        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if (m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }
            else {
                m.put(ch,1);
            }
        }
        for(char c:m.keySet()){
            if(m.get(c)>1){
                System.out.println("Key="+c+" value="+m.get(c));
            }
        }
    }
}