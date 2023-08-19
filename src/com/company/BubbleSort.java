package com.company;

public class BubbleSort {
    public static void printArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {7,8,3,2,1};
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }


                //OR

//            for (int j = 0; j < a.length-i-1; j++) {
//                if (a[j]>a[j+1]){
//                    temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
            }
        }
        printArray(a);
    }
}
