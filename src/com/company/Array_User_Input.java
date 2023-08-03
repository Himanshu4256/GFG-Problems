package com.company;

import java.util.Scanner;

public class Array_User_Input {
    public static void main(String[] args) {
//        int[] ar = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Values");


//        //yha ham alg-2 5 values lena chahte hai to hm alg-2 code likhne ki wjh hm loop use krenge
//        for (int i = 0; i<ar.length; i++){
//            ar[i]=sc.nextInt();
//        }




        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values.....");
        int num = sc.nextInt(); // ye Array k size k liye hai kitne size ka array hai.
        int[] ar = new int[num]; // jitna size liya hai wo array m store kiya
        System.out.println("Enter values");

        for (int i=0;i< ar.length;i++){
            ar[i] = sc.nextInt(); // yha input ko hme array k index pr store kiya hai means 1st input a[0] pr 2nd a[1] pr....
        }

    }
}