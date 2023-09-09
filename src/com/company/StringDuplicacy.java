package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringDuplicacy {
    public static void main(String[] args) {
//        Map<Character,Integer> m = new HashMap<>();
//        String s = "aaabbbcccdde";
//        for (int i=0; i<s.length();i++){
//            char ch = s.charAt(i);
//            if (m.containsKey(ch)){
//                m.put(ch,m.get(ch)+1);
//            }
//            else {
//                m.put(ch,1);
//            }
//        }
//        for(char c:m.keySet()){
//            if(m.get(c)>1){
//                System.out.println("Key="+c+" value="+m.get(c));
//            }
//        }


        String a = "Hello welcome welcome to our organization";
        String spl[]=a.split(" ");
        Set<String> str=new HashSet<>();
        for (int i = 0; i <=spl.length; i++) {
            for (int j = i+1; j<spl.length; j++) {
                if (spl[i].equals(spl[j])) {
                        continue;
                }
                else {
                    str.add(spl[i]);
                }

            }
        }
        System.out.println(str);
    }
}