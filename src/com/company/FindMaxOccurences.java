package com.company;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurences {
    public static void main(String[] args) {
        String s = "hkjaafha";
        Map<Character,Integer> m = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else {
                m.put(s.charAt(i),1);
            }

        }
        int max = 0;
        for (Character c : m.keySet()) {
            char key = c;
            if (max<m.get(key)){
                max = m.get(c);
                System.out.println(c+" = "+m.get(key));
            }

        }
    }
}
