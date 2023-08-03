package com.company;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "tot";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("Reverse String :"+rev);
        if(s.equals(rev)){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}