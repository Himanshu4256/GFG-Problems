package com.company;


import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        boolean result = Pattern.compile(".r").matcher("ar").matches();
        System.out.println(result);


        boolean result2 = Pattern.matches(".r","ar");
        System.out.println(result2);

        System.out.println("------------------------------------------");


        System.out.println(Pattern.matches(".r","ar")); // true (2nd char is r)
        System.out.println(Pattern.matches(".r","ak")); // false (2nd char is not r)
        System.out.println(Pattern.matches(".r","arr"));// false (has more than 2 char)
        System.out.println(Pattern.matches(".r","arrr"));// false (has more than 2 char)
        System.out.println(Pattern.matches("..r","ar")); // true (3rd char is r)

        System.out.println("---------------------------------------------");

        System.out.println("[abc] matches a = " + Pattern.matches("[^abc]","a"));
        System.out.println("[abc] matches b = " + Pattern.matches("[^abc]","b"));
        System.out.println("[abc] matches c = " + Pattern.matches("[^abc]","c"));
        System.out.println("[abc] matches z = " + Pattern.matches("[^abc]","z"));
        System.out.println("[abc] matches aaa = " + Pattern.matches("[^abc]","aa"));
        System.out.println("[abc] matches abc = " + Pattern.matches("[^abc]","abc"));




    }
}