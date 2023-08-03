package com.company;

//Not working
public class StringWordReverse {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String rev = "";
        String str[] = s.split("");
        for (int i = 0; i < str.length; i++) {
            rev = str[i]+rev;
        }
        System.out.println(rev);
    }
}
// Expected Output = "much.very.program.this.like.i"