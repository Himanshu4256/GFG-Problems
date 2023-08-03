package com.company;

public class StringRemoval {
    public static void main(String[] args) {
        String s = "Piyush123";

        String afterremove = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))){
                continue;
            }
            else {
                afterremove = afterremove+s.charAt(i);
            }
        }
        System.out.println(afterremove);
    }
}