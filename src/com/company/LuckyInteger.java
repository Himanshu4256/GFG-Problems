package com.company;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,3,4};
        Map<Integer,Integer> m = new HashMap<>();
        for (int i:arr) {
            if (m.containsKey(i)){
                m.put(i,m.get(i)+1); // agr value map m hai to uski frequency mai ek value put kr do.
            }
            else {
                m.put(i,1); // agr value ni hai to freq 1 kr do
            }
        }

        for (Integer i:m.keySet())  // (key set) hme key nikal kr de rha hai
        {
            if (i.equals(m.get(i))){
                System.out.println(i+ " is Lucky Number");
            }
        }
    }
}
