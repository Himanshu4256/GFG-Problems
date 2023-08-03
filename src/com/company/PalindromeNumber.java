package com.company;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int temp = num;
        int rev=0,rem;
        while (temp!=0){  //123
            rem=temp%10;
            rev=rev*10+rem; //321
            temp=temp/10;
        }
        if (num==rev){
            System.out.println("is Palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }
    }
}