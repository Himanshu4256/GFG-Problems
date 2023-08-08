package com.company;

//import com.sun.codemodel.internal.JForLoop;

import java.util.Scanner;

public class TableCreation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        //int a = 2;
        int c = 0;

        for (int i=1;i<=10;i++){
            c = a*i;
            System.out.println(a+"*"+""+i+"="+c);
        }
    }
}