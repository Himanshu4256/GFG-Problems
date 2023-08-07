package com.company;

public class Array_0s_1s {
    public static void main(String[] args) {
        int a[] = {0,1,0,1,0,0,1};
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[x]==1){
               x++;
            }
            else System.out.println(a[x]);
        }
    }
}
