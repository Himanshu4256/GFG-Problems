package com.company;

import java.util.HashSet;
import java.util.Set;

public class ArrayMinMax {
    public static void main(String[] args) {
        int arr[] = {9,5,8,6};
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max is :"+max);


    }
}