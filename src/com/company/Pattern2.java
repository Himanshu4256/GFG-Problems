package com.company;
public class Pattern2 {
    public static void main(String[] args) {
        int num = 7;
        //int spaces = row-1;

        for (int i = 1; i <= num; i++) {
            for (int k = num; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
