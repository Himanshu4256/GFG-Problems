package com.company;
import java.util.Locale;

// agr 1st letter capital h to sari string ko capital bnao aur small hai to complete ko small
public class rgb {
    public static void main(String[] args) {
        String s = "aNB";
        String u = "";
        String l ="";
        if(Character.isUpperCase(s.charAt(0))) {
            u = u + s.toUpperCase();
            System.out.println(u);
        }
        else {
            l = l+s.toLowerCase();
            System.out.println(l);
        }
    }
}