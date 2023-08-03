package com.company;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int a[] = {7,1,2,2,6,2,3,4};
        Arrays.sort(a);
        int temp[] = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[a.length-1];

        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);
        }
    }

}
