package com.advanced.dsa.algos.sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionsort(int[] arr){
        for (int i =0;i< arr.length-1;i++){
            int midIndex =i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[midIndex]){
                    midIndex=j;
                }
            }
            if (midIndex!=i){
                int temp =arr[i];
                arr[i]=arr[midIndex];
                arr[midIndex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={0,2,4,8,9,6,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
