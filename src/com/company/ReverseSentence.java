package com.company;

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "i.like.play.cricket";

//        for (int i = s.length()-1; i >= 0; i--) {
//            System.out.print(" "+s.charAt(i));
//        }

        String[] str = s.split("[.]");
        String rev = "";
        for (int i = str.length-1; i >0 ; i--) {
            rev+=str[i]+".";
        }
        rev+=str[0];
        System.out.print(rev);
    }
}
