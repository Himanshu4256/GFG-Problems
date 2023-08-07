package com.company;

//Input - {0,1,0,1,0,0,1}
//Output -  {0,0,0,0,1,1,1}
public class Array_0s_1s {
    public static void main(String[] args) {
        int a[] = {0,1,0,1,0,0,1};
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0){
                a[x] = a[i]; // jha a[i] ki value 0 k equal hai wha se use a[x] m daal do.
                x++;
            }
        }
        while (x<a.length){
            a[x] = 1; // Simple ab jo array ki length bachi hai waha 1 daal do.
            x++;
        }
        // for printing the array
        for (int j = 0; j <a.length; j++) {
            System.out.print(" "+a[j]);
        }
    }
}
