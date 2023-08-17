package com.company;

public class ReverseCharacter {

    public static void revChar(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev+str.charAt(i);

        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        String s = "Hello Dynamics ";
        revChar(s);
    }
}
