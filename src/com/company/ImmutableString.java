package com.company;

public class ImmutableString {
    public static void main(String[] args) {
        String s = new String("Java");
        s.concat("Programming");
        System.out.println(s); // Here it print java bcoz of it's immutable



        s = s.concat(" Best Programming");
        System.out.println(s); // yha Complete print krega BUT. New obj k saat.

    }
}
