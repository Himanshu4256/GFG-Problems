package com.company;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = s.nextInt();
        int fac = 1;
        for(int i = 1; i <= num ; i++) {
            fac = fac*i;
        }
        System.out.println("Factorial Number of "+num+" is :" +fac);

    }
}
