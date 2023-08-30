package com.company;

public class InsertElementInArray {
    public static void main(String[] args) {
        int a[] = {76,64,39,57,84,62,54};
        int element = 166;
        int pos = 4;
        for (int i = a.length-1; i > pos-1; i--)
        {
            a[i] = a[i-1];  // means piche wala element aage wale ki jgh aa jaega.
        }
        a[pos] = element;
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }
}
