package com.company;

//Not working
public class StringWordReverse {
    public static void main(String[] args) {
//        String s = "i.like.this.program.very.much";
//        String rev = "";
//        String str[] = s.split("");
//        for (int i = 0; i < str.length; i++) {
//            rev = str[i]+rev;
//        }
//        System.out.println(rev);





        String s = "i.like.this.program.very.much";
        String[] str = s.split("\\.");
        StringBuilder reversedString = new StringBuilder();

        for (int i = str.length - 1; i > 0; i--) {
            reversedString.append(str[i]).append(".");
        }
        reversedString.append(str[0]);

        System.out.println(reversedString.toString());
    }
}
// Expected Output = "much.very.program.this.like.i"