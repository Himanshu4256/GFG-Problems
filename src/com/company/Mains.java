package com.company;

import java.io.*;
import java.util.*;

public class Mains {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //String c = A.length();
        System.out.println(A.length()+B.length());
        if(A.length()<B.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String s1 = A.substring(0, 1).toUpperCase();
        System.out.println(s1);


    }
}
