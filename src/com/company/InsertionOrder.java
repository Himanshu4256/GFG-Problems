package com.company;

public class InsertionOrder {
    public static void main(String[] args) {
        int[] a = {2,3,9,8,4,7};
        int temp;
       // int[] b = new int[a.length];
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    temp= a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
