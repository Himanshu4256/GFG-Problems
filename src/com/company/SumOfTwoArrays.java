package com.company;

public class SumOfTwoArrays {

    public static void main(String[] args) {
        int[] a = {3,1,2,4};
        int[] b = {4,5,3,6};
        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            System.out.print(" "+c[i]);
        }
    }

}
