package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Test_3 {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,3}; int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(i==j){
                    System.out.println(Arrays.stream(nums).sorted());
                }
                else {
//                    Arrays.sort(nums, Collections.reverseOrder());
//                    System.out.println(Arrays.toString(nums));
//                    temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j] = temp;
//                    System.out.println(nums[j]);
                }
            }
        }
    }
}