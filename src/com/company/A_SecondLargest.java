package com.company;

public class A_SecondLargest {
    public static void main(String[] args) {
        int a[] = {2,5,4,9,7,6};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {

                //Now Ham Array ko sort krenge.
                if (a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]+" ");
        }
        System.out.println("Second Largest number is :");
        System.out.println(a[1]);
    }
}
