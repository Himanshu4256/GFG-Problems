package com.company;


//Panagram Means -> String should contains all A to Z Letters.


public class StringPanagram {

    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s1.toLowerCase( ))); // static mtd hai esliye direct call ho gya.


    }

    static boolean isPanagram(String s1){

        if (s1.length()>26 && s1.length()<26){
            return false;
        }
        else {
            for (char ch = 'a'; ch <= 'z' ; ch++) {
                if (s1.indexOf(ch)<0) // agr s1 ka index 0 se chota ho to.
                {
                    return false;
                }
            }
        }
        return true;
    }
}