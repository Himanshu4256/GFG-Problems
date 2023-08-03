package com.company;

// swiping of two numbers
public class Main {

    public static void main(String[] args) {
        // write your code here
        int a=10; int b=20;
        System.out.println("Before swaping");
        // Logic 1 - Third Variable
//        int c = a;
//            a=b;
//            b=c;
//        System.out.println("a = "+a+" , b = "+b+"");

        // Logic 2 - same variables
//        a= a+b; //10+20 = 30;
//        b=a-b;  //30-20 = 10; (b)
//        a=a-b;  //30-10 = 20; (a)
//        System.out.println("a = "+a+" , b = "+b+"");

        // Logic 3 - using * and / operator
//        a = a*b; // 200
//        b = a/b; // 10
//        a = a/b;
//        System.out.println("a = "+a+" , b = "+b+"");

        // Logic 4 - bitwise XOR (^)
//        a=a^b;   //a(10)=1010
//        b=a^b;   //b(20)=10100
//        a=a^b;   // a^b = 11110 = 30
//        System.out.println("a = "+a+" , b = "+b+"");


        //Logic5 - Single statement
        b=a+b-(a=b);  //execution from R to L = 30-(20) bracket open in last
        System.out.println("a = "+a+" , b = "+b+"");
    }
}
