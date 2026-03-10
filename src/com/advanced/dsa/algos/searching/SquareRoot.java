package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class SquareRoot {
    public static int squareroot(int[] arr, int key){
    int s=0;
    int e = arr.length-1;
    // Base case // edge case // corner case
        while(s<=e){
        int mid = s+(e-s)/2;
        if (arr[mid]*arr[mid]==key){
            return arr[mid];
        }
        else if (arr[mid] <key){
            //move to the right
            s = mid+1;
        }else{
            e = mid-1;
        }
    }
        return -1;
}

public static void main(String[] args) {
    int[] arr = {2,3,5,6,7,8,10};
    int key = 100;
    int index= squareroot(arr,key);
    if(index==-1){
        System.out.println(key+"is not present in the array:"+ Arrays.toString(arr));
    }else{
        System.out.println(key+" is square root of " + index + " in the array:" +Arrays.toString(arr));
    }
}
}

