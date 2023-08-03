package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToArrayList {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

        List a = new ArrayList();
        for (int i=1;i<map.size();i++){
            // a.add(map);
            Map<Integer, String> b = map;
        }
        System.out.println(a);





//        int a = 1;
//        for (int i=1; i<6;i++) {
//            String s = "a";
//            map.put(a,s);
//            a++;
//            System.out.println(map);
//        }
    }
}
