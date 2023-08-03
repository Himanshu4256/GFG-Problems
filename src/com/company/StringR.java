package com.company;

public class StringR {
    public static void main(String[] args) {
        String s = "Vishal";
        String r = "";
        for (int i = s.length()-1; i >= 0; i--) {
            r = r+s.charAt(i);
        }
        System.out.println(r);
    }
}