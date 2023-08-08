package com.company;

import java.util.*;
;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(2);l.add(4);l.add(3);l.add(6);l.add(2);l.add(7);
        Set<Integer> m = new LinkedHashSet<>(l);
        System.out.println(m);
    }
}
