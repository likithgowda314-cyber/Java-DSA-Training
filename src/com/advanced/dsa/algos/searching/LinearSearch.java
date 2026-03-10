package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[]arr,int key){
        for (int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
 // if you don't find the key retun an invalid
    public static void main(String[] args) {
        int[] arr ={9,3,4,5,6,7,8};
        int key=8;
        int index = linearSearch(arr,key);
        if(index==-1){
            System.out.println(key+"is not present in the array:"+ Arrays.toString(arr));
        }else{
            System.out.println(key+" is present at index:" + index + " in the array:" +Arrays.toString(arr));

        }
    }
}
