package com.company;

public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Logic 1 Using Third Variable
//        int c = a;
//            a = b;
//            b = c;
//        System.out.println("After Swapping :"+a+" "+b );


        // Logic 1 without using third variable use +&- this also U can perform = "*,/"
//         b = b-a;  // or  - a = a+b;
//         a = b+a;        // b = a-b;
//                         // a = a-b;
//        System.out.println("After Swapping :"+a+" "+b);

        //Logic 2
//        a = a^b; //10^20 = 30
//        b = a^b; // 3^20 = 10
//        a = a^b; //30^10 = 20
//        System.out.println("After Swapping :"+a+" "+b);


        //Logic 04 Single unit
        b = a+b-(a=b);
        System.out.println();
        System.out.println("After Swapping :"+a+" "+b);

    }
}