package com.company;

import java.util.HashSet;
import java.util.Set;

// Ye logic 2 se jyda baar repeat element k liye ni hai.
public class ArrDplcySet {
    public static void main(String[] args) {

        int arr[] = {2,6,4,5,4,9,3,4};
        Set<Integer> s = new HashSet<>();

        for (int a: arr) {
            if (s.add(a)==false){
                System.out.println(a);
            }
        }
    }
}