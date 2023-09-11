package com.company;

public class RemoveVowels {
    String rem = "";

    String removeVowels(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' || s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U' ) {
                continue;
            }
            else {
                rem = rem+s1.charAt(i);
            }
        }
        return rem;
    }
    public static void main(String[] args) {
        String s = "Welcome";
        RemoveVowels r = new RemoveVowels();
        System.out.println(r.removeVowels(s));
    }
}
