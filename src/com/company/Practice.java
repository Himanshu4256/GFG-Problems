package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        System.out.println("Enter name");
        String s = sc.nextLine();
        System.out.println(s+"@gmail.com");

        String[] a = s.split(" ");
        System.out.println(a[0]+"@gmail.com");
        System.out.println(a[1]+"@gmail.com");
        System.out.println(a[1]+" "+a[0]+"@gmail.com");
        System.out.println(s.charAt(0)+"@gmail.com");


        //        char p = s.charAt(0);
        //        System.out.println(p);


    }
}