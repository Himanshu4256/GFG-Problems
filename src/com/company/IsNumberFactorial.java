package com.company;

import java.util.Scanner;

public class IsNumberFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        boolean match=false;
        int num = sc.nextInt();
        int temp=1;
        int i=1;
        for (i = 1; i < num/2; i++) {
            temp = temp*i;

            if (temp==num){

                match=true;
                break;
            }
            if(temp>num){
                break;
            }

        }
        if(match){
            System.out.println(i+" is factorial of " +num);
        }
        else{
            System.out.println(num+"has no factorial");
        }
    }
}
