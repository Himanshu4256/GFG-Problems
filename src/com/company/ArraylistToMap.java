package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArraylistToMap {
    public static void main(String[] args) {
        ArrayList<Integer> E = new ArrayList();
        E.add(1);
        E.add(2);
        E.add(3);
        E.add(6);
        E.add(8);

        Map<Integer,Integer> map = new HashMap();
        int a = 1;
        for (Integer c: E) {
            map.put(a,c);
            a++;
        }
        System.out.println(map);
    }
}
