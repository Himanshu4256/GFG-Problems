package com.company;

public class ArrayMinMax {
    public static void main(String[] args) {
        int arr[] = {2,5,8,6};
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max is :"+max);
    }
}
