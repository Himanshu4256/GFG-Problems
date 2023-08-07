package com.company;

import java.util.Scanner;

public class ArmstronNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int a = sc.nextInt();
        int c = a;
        int arm = 0;
       while (a>0){
           int s = a%10;
           arm = (s*s*s)+arm;
           a = a/10;
       }
       if (arm==c) System.out.println("Number is Armstrong");

       else System.out.println("Number is not Armstrong");

    }
    }
