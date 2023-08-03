package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        String s = "vishal,mohit,shubham,prateek";

        String[] str = null;
        str = s.split(",");
        Arrays.sort(str);
        Arrays.toString(str);


        for (String store : str){
            System.out.println(store);
        }



    }
}

