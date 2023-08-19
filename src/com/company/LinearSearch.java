package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {3,2,4,5,9,7,3};
        int number = 9;
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==number){
                pos = i;
                break;
            }
        }
        if (pos>0){
            System.out.println("Element Found at index :"+pos);
        }
        else {
            System.out.println("Element Not Found");
        }
    }
}
