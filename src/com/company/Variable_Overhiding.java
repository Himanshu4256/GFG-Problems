package com.company;


class First {
    String name = "Ducat";
    void print(){
        System.out.println(name);
    }
}

class Second extends First{
    String name = " ";
    void check(){
        System.out.println(name);
    }
}

public class Variable_Overhiding extends Second{
    public static void main(String[] args) {
        Variable_Overhiding vr = new Variable_Overhiding();
        vr.print();
        vr.check();
    }
}