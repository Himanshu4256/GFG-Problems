package com.company;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {4,6,8,9,3};
        int b[] = {9,5,7,1,8};
        int c_length = a.length+b.length;
        int c[] = new int[c_length];
        for (int i = 0; i < a.length ; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length+j] = b[j];
        }
        for (int k = 0; k < c_length; k++) {
            System.out.print(c[k]+" ");
        }

    }
}
