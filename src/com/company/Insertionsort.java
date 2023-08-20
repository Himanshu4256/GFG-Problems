package com.company;

public class Insertionsort {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = {5,1,6,2,4,3};
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int j = i-1;
            while (j>=0 && current<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        printArray(a);
    }
}
