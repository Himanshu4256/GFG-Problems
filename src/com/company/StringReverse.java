package com.company;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello String Class";
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
            // System.out.println(s);
        }
    }
}