package com.company;

public class Varargs {
    int addition(int ...array) // it's Varag ye Values ko Array m store krata hai phir ham arrays ki values ka addition kr dete hai.
    {
        int c=0;

        for (int i = 0; i < array.length; i++) {
            c = c+array[i];
        }
        return c;

    }
    public static void main(String[] args) {
        Varargs v = new Varargs();
        System.out.println(v.addition(2,3));
        System.out.println(v.addition(2,3,4));
        System.out.println(v.addition(2,3,4,5));
        System.out.println(v.addition(2,3,4,5,6));
    }
}
