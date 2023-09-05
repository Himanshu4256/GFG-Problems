package com.company;

import java.util.HashSet;

// Ye logic 2 se jyda baar repeat element k liye ni hai.
public class ArrDplcyBruteForce {
    public static void main(String[] args) {
        int[] a = {2,1,1,5,6,5,3,1};
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if ((a[i]==a[j])){
                    set.add(a[i]);
//                    System.out.println("Duplicate Values are :"+a[j]);

                }

            }
        }
        for(int i:set){
            System.out.println(i);
        }
    }
}