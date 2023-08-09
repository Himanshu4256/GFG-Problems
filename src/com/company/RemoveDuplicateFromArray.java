package com.company;

import java.util.Arrays;

//remove duplicacy from sorted Array
public class RemoveDuplicateFromArray{
    public static void main(String[] args) {
        int a[] = {9,2,8,2,3,9,5,6};

        int[] temp = new int[a.length];
        Arrays.sort(a);
        int j = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i+1]){
                temp[j] = a[i];
                j++;
            }
        }

        temp[j] = a[a.length-1];  // yha se upr wale logic se Array 8 tk hi print krega to last wale element ko print krane k liye hmne direct last wali value daal di temp mai.
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" "); //esme ye last mai [0 0] dega jo remove hue elements ki jgh hai.
        }
    }
}
