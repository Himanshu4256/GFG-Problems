package com.company;

import java.util.HashMap;
import java.util.Map;

public class FindMaxOccurences {
    public static void main(String[] args) {
        String s = "hkjaafha";

//        key = "hkjaafha", value = 1,2,3,4

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
            if (max<m.get(key)){   //m.getKey => value ko nikalta hai.
                max = m.get(key);
                System.out.println(key+" = "+m.get(key));
            }

        }
    }
}
