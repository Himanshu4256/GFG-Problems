package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        // int[] ar = {6,8,13,9,3,4};
//        for(int l : a){
//
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array range: ");
        int n=sc.nextInt();
        int [] ar=new int[10];
        System.out.println("enter the element");
        for (int i = 0; i <n ; i++) {
            ar[i]=sc.nextInt();

        }
        int max = ar[0];
        for(int i = 0; i<=ar.length-1; i++){
            if(ar[i]>max){
                max = ar[i];
            }
        }
        System.out.println("maximum no. in the array is :"+max);
    }
}
