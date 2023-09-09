package com.company;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int a[]={7,3,4,5,2,1};
        Arrays.sort(a);
        int size=7;

        for (int i = 0; i < size-1; i++) {
            if(i+1!=a[i]){
                System.out.println(i+1);
                break;
            }
        }
    }
}