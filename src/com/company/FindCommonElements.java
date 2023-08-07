package com.company;

import java.util.ArrayList;

//Q - Find common elements in three SORTED elements.
public class FindCommonElements {
    public static void main(String[] args) {
        int a[] = {1, 5, 10, 20, 40, 80};
        int b[] = {6, 7, 20, 80, 100};
        int c[] = {3, 4, 15, 20, 30, 70, 80, 120};
        int x = 0,y = 0,z = 0;

        ArrayList<Integer> al = new ArrayList<>();
        while (x<a.length && y<b.length && z<c.length){

        if (a[x]==b[y] && b[y]==c[z]){
           al.add(a[x]);
           x++;
           y++;
           z++;
        }
        else if(a[x]<b[y]){
            x++;
        }
        else if (b[y]<c[z]){
               y++;
        }
        else {
            z++;
        }
        }
        System.out.println(al);
    }
}
// Esme Ham chote element ko aage bda rahe hai & first condition ko check kr rahe hai.