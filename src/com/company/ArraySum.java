package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
//        int c =0;
//        for(int b: a){
//            c = b+c;
//        }
//        System.out.println(c);




//        int sum = Arrays.stream(a).sum();
//        System.out.println(sum);



        int sum = IntStream.of(a).sum();
        System.out.println(sum);


    }

}
