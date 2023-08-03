package com.company;

public class StringFrequency {
    public static void main(String[] args) {
        String s = "testsample";
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    System.out.println(count);
                }
                else {
                    System.out.println("-1");
                }
            }
        }
        System.out.println(count);
    }
}