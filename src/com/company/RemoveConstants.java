package com.company;

import java.util.LinkedList;
import java.util.List;

public class RemoveConstants {
    public static void main(String[] args) {
        String s = "Ducat";
        List<Character> l = new LinkedList();
        String as = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                l.add(c);
            }
        }
        for (Character character : l) {
            System.out.print(character);
        }
    }
}
