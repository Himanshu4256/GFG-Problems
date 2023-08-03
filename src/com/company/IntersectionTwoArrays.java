package com.company;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] a = {2,5,4,8,9,1};
        int[] b = {11,3,4,8,7,32};
        for (int i=0; i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[i]==b[j]){
                    System.out.println("Intersection of Two Arrays are :"+b[j]);
                }
            }
        }
    }
}
