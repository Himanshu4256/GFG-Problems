package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DelElmntAtSpecificPos {
    public static void main(String[] args) {
        int a[] = {7,3,5,6,8,9,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position where U want to delete the element");
        int pos = sc.nextInt();

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i]==a[pos]){
                System.out.println("Deleted element is "+a[pos]);
                continue;
            }
            else {
                l.add(a[i]);
            }
        }
        System.out.println("After Removing the element");
        System.out.println(l);
    }
}
