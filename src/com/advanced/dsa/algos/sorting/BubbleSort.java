package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {
            int[] arr={100,2,7,1,8,99,25,59};
            System.out.println(Arrays.toString(arr));
            bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        }
        public static void bubbleSort(int[] arr){
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j <arr.length-1 ; j++) {//Second last Element
                    if(arr[j]>arr[j+1]){
                        //Swap arr[j] and arr[j+1]
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
}
