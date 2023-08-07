package com.company;

import java.util.HashMap;
import java.util.Map;

public class CompleteDuplicacyRemove {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,4,3,4};
        Map<Integer,Integer> m = new HashMap<>();
        for (Integer s :arr) {
            if (m.containsKey(s)){
                m.put(s,m.get(s)+1);
            }
            else {
                m.put(s, 1);
            }
        }
        for (Integer key: m.keySet()) {
            if (m.get(key)==1){
                System.out.print(key+" ");
            }
        }
    }
}
