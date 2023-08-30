package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int [] store = new int[s];
//        for(int i=0;i<s;i++){
//            store[i]=sc.nextInt();
//            System.out.println(i);
//        }

        //int[] a = {9,6,8,4,3,2,1};
        int[] a = {1,2,3,4,5,7,8};
        // Arrays.sort(a);
        int expected_no = a.length+1; // 7+1 = 8
        // yha ham 1,2,3,4,5,6,7,8,9 tk elements ka sum nikaal rahe hai. 8*(9)/2 =
        int total = expected_no*(expected_no+1)/2;
        //System.out.println(total);

        int sum =0;
        for (int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println(total-sum);

    }
}