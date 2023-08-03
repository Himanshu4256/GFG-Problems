package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter String :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = " ";

        for(int i = s.length()-1; i>=0; i--){
            a = a+s.charAt(i);
        }
        System.out.println(a);
    }
}