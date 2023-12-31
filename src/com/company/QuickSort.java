package com.company;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {15,9,7,13,12,16,4,11};

        QuickSort q = new QuickSort();
        q.quickSortRecursion(arr,0,arr.length-1);
        q.printArray(arr);
    }
    int partition(int[] arr, int low, int high){
        int p = arr[(low+high)/2];
        while (low <= high){
            while (arr[low] < p){
                low++;
            }
            while (arr[high] > p){
                high--;
            }
            if (low<=high){
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                low++;
                high--;
            }
        }
        return low;
    }

    void quickSortRecursion(int[] arr, int low, int high) {
        int pi = partition(arr,low,high);
        if (low < pi-1){
            quickSortRecursion(arr,low,pi-1); //this is for left list
        }
        if (pi<high){
            quickSortRecursion(arr,pi,high);   //this is for right list
        }
    }

    void printArray(int[] arr){
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
