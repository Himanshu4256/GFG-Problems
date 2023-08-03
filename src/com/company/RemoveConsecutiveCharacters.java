package com.company;

public class RemoveConsecutiveCharacters {
    public static String removeConsecutiveCharacter(String s){
        String f = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(f.indexOf(c)==-1){
                f += s.charAt(i);
            }

        }
        return f;
    }

    public static void main(String[] args) {
        RemoveConsecutiveCharacters r = new RemoveConsecutiveCharacters();
        System.out.println(r.removeConsecutiveCharacter("aabaa"));

    }
}