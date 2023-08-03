package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayInput {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int [] store = new int[s];
        for(int i=0;i<s;i++){
            store[i]=sc.nextInt();
            System.out.println(i);
        }



    }
}