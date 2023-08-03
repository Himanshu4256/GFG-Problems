package com.company;

import java.util.Stack;

public class Stack_ReverseArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        int arr[] = {3,4,9,7,8};
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]= st.pop(); // pop method jis cheez ko delete krta hai use return bhi krta hai.
            System.out.println(arr[i]);
        }
    }
}

// you are also write 2nd loop like this
//    int[] b = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//        b[i] = st.pop(); // pop method jis cheez ko delete krta hai use return bhi krta hai.
//        System.out.println(arr[i]);
//        }