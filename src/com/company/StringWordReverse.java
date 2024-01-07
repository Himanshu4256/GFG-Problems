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

        // Loop through the array of split strings in reverse order (except the last element)
        for (int i = str.length - 1; i > 0; i--) {
            // Append each word followed by a dot to the StringBuilder
            reversedString.append(str[i]).append(".");
        }
        // Append the last word without a trailing dot
        reversedString.append(str[0]); // loop ko lessthen 0 tak chalaya or [o] index ko allg se add kr diya.

        System.out.println(reversedString.toString());
    }
}
// Expected Output = "much.very.program.this.like.i"