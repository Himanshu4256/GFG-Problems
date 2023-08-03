package com.company;

public class StringRotation {
    public static void main(String[] args) {
        String s = "abcd";
        String s1 = "dabc";
        String s2 = s+s;
        // for (int i=0;i<s2.length();i++){

        if (s.length()!=s1.length()){
            System.out.println("false");
        }
        else if(s == null || s1 ==  null){
            System.out.println("false");
        }
        else if(s2.contains(s1)){
            System.out.println("true");
//                    break;
        }
        else {
            System.out.println("Your Given String is Not Rotational");
        }

        //  }

    }
}
