package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionsort(int[] arr){
        for (int i= 1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j --;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={8,2,4,0,9,6,1};
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
