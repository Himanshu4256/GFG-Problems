package com.company;

public class FirstLetter {
    public static void main(String[] args) {
        String s = "Get first letter of every word ";
        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            System.out.println(s1.charAt(0));
        }
    }
}
