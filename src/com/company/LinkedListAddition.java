package com.company;

class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListAddition {
    static void show(Node h){
        while(h!=null){
            System.out.print(" "+h.data);
            h = h.next;
        }
    }

    static void specificIndex(Node h, int index){
        for (int i = 1; i < index; i++) {
            h=h.next;
        }
        System.out.println(h.data);
    }

    public static void main(String[] args) {

        // a = prev
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node head=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;

        Node head2=e;
        e.next=f;
        f.next=g;
        g.next=null;

        //show(head2);


        // for Merge these LinkedList
        d.next=e;
        show(head);
        System.out.print("specific index:");
        specificIndex(head,3);
    }
}