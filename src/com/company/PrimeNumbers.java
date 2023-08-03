package com.company;


import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < a-1; i++) {
            if (a%i==0){
                temp = temp+1;
            }
        }
        if (temp==0){
            System.out.println("It's a Prime Number");
        }
        else {
            System.out.println("It's not a prime Number");
        }
    }
}