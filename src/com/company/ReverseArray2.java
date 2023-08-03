package com.company;

public class ReverseArray2 {
    public static void main(String[] args) {
        int []arr = {3,4,9,5,2};
        int temp = 0;
        int len = arr.length-1;
        for (int i = 0; i < arr.length/2; i++)
        {
            temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            len--;
            System.out.println(arr[i]);
        }
    }
}