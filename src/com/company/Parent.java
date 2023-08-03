package com.company;

class Parent {
    void show(){
        System.out.println("show");
    }
}
class Child extends Parent{
    void wow(){
        System.out.println("wow");
    }
}

class Casting{
    public static void main(String[] args) {
        Parent p = new Child(); //Upcasting : esme keval parent class k method ko call kar paenge.
        p.show();

        Child c = (Child)p; //Downcasting : Now we call Parent & Child's both methods;
        c.show();
        c.wow();
    }
}
