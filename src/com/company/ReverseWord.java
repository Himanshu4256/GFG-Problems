package com.company;

public class ReverseWord {
    String reverse = "";

    String reverseWrd(String str){
        String a[] = str.split(" ");
        for (int i = a.length-1; i >= 0; i--) {
            reverse = reverse+a[i] + " ";
            //System.out.println(reverse);
        }
        return reverse;

    }

    public static void main(String[] args) {
        ReverseWord r = new ReverseWord();
        String str = "This is me";
        System.out.println(r.reverseWrd(str));



//        String s = "This is me";
//        String reverse = "";
//        String ar[] = s.split(" ");
//        for (int i = ar.length-1; i >= 0; i--) {
//            reverse = reverse+ar[i] + " ";
//        }
//        System.out.println( reverse);
    }
}