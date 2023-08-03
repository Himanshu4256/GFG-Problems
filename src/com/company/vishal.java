package com.company;

public class vishal {
    public static void main(String[] args) {
        int a=0;
        int arr[]={2,5,1,7,4,35,6,98};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    a=arr[i];
//


                }

            }

        }
        System.out.println(a);

    }
}