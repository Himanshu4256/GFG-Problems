package com.company;

import java.util.Arrays;

class ArraySecondLargest {
    public static int getNumber(int[] a, int total){
        Arrays.sort(a);
        return a[total-2];
    }

    public static void main(String[] args) {
        int a[] = {1,2,5,6,3,2};
        System.out.println("Second Largest :"+getNumber(a,6));
    }
}