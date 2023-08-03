package com.company;

public class ForLoop {
    public static void main(String[] args) {
        int i = 0;
        while(i<10) // Print (0 To 9)
        {
            System.out.println(i++);
        }
        System.out.println("------------------------------");



        int j = 0;
        for(;j<10;) // But Here Print (1 to 10) bcon '0' ko ++ krega '1' mai & '9' ko '10' mai This is the diff
        {
            System.out.println(++j);
        }

    }

}
