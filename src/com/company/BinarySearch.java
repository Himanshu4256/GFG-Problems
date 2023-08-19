package com.company;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {9,1,2,8,3,7,4,6};
        int n = 3;
        int s = 0;
        int e = a.length-1;
        int m = (s+e)/2;
        int index = 0;
        Arrays.sort(a);

        while (s<=e) {
            if (a[m] == n) {
                System.out.println("Element "+ a[m] +" found at index :"+m);
                break;
            } else if (n > a[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
            m = (s + e) / 2;
        }
        if (s>e){
            System.out.println("Element not found");
        }





//        while (index<a.length){
//            System.out.print(" "+a[index]);
//            index++;
//        }
    }
}
