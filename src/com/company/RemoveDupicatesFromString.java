package com.company;

public class RemoveDupicatesFromString {
    public static void main(String[] args) {
        String s = "rjhbff bhaa";
        String str = "";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if (str.indexOf(ch)<0){
                str += ch;
            }
        }
        System.out.println(str);
    }
}