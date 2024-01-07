package com.company;
import java.util.Scanner;

public class StringQstn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();

        String[] str = s.split(" ");
        System.out.println(s.length());
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            System.out.println(s.length());
            break;
        }
    }
}
