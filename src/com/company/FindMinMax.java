package com.company;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int a[] = {2,9,4,7,8,3};
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[a.length-1]);
    }
}
