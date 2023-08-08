package com.company;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "Vi@s#ha$l&";
//        String plaindtr = s.replaceAll("[^a-zA-Z)-9]", "");
//        System.out.println("After removing :"+plaindtr);


        String resut="";
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j)>64 && s.charAt(j)<=122)
            {
                resut=resut+s.charAt(j);
            }

//            char ch = s.charAt(j);
//            if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '&'){}
//            else resut = resut+ch;
        }
        System.out.println("After removing :" +resut);
    }
}