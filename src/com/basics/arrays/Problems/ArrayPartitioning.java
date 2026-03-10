package com.basics.arrays.Problems;

import java.util.Arrays;
// even on the the LHS & ODD
public class ArrayPartitioning {
    public static void main(String[] args) {
        int[] arr={3,8,5,1,27,6};
        System.out.println(Arrays.toString(arr));
        int l=0;
        int r=arr.length-1;
        while (l<r){
            if(arr[l]%2==0){
                l++;
            }
            if(arr[r]%2!=0){
                r--;
            }
            if (l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
