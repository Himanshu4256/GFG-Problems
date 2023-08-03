package com.company;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {11,21,13,14};
        int next = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    System.out.println("The next greater element of "+arr[i]+" is :"+arr[j]);
                    break;
                }
                else {
                    System.out.println("Here is no greater element of "+arr[i]+" so :"+next);
                }
            }
        }
    }
}