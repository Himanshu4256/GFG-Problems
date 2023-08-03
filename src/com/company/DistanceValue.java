package com.company;

public class DistanceValue {
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int arr2[] = {10,9,1,8};
        int d = 2;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int c = Math.abs(arr1[i]-arr2[j]);

                if (c<=d) {
                    System.out.println(c);
                }
            }
        }
    }
}