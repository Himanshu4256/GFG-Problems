package com.company;

public class SecondLargest_Smallest {
    public static void main(String[] args) {
        int arr[]= {2,3,8,7,5,1,9,12,15,14};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.print("Second Largest Number :"+ arr[arr.length-2]);
        System.out.println("Second smallest element :"+ arr[1]);
    }
}
