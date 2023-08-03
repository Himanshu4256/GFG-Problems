package com.company;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        int no = 3456;
        int rev =0 ;

        for(int i=0; i<=no;i++){
            rev = no%10;
            System.out.println(rev);
            no = no/10;
        }


//        Scanner st = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int num = st.nextInt();
//        while (num>0){
//            rev = num%10;
//            System.out.print(rev);
//            num = num/10;
//        }


    }
}