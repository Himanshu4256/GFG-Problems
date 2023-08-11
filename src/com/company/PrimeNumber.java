package com.company;


import java.util.Scanner;
// Prime Numbers jo khud se divide ho.
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 2; i < a; i++) {
            if (a%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("number is prime");
        }
        else {
            System.out.println("number is not prime");
        }
    }
}