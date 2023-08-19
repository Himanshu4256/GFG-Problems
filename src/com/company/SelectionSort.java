package com.company;

public class SelectionSort {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int a[] = {7,8,3,2,1};
        for (int i = 0; i < a.length; i++) {
            int smallest = i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[smallest] > a[j]){ // a[j] - means smallest se ek aage ka. Ex- 8>3 to 3 ko smaller kr do.
                    smallest = j;
                }
            }
            int temp =a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        printArray(a);
    }
}
