package com.company;

import com.sun.jdi.Value;

import java.util.ArrayList;

public class ArrayDuplacyRemove {
    public static void main(String[] args) {
        int a[] = {8,7,2,2,4,5};
        ArrayList<Integer> l = new ArrayList<>();

        for(int values:a){
            if(l.contains(values)){
                continue;
            }

            else{
                l.add(values);
            }

        }
        System.out.println(l);


    }
}
