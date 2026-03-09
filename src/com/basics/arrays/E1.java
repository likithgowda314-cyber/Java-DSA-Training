package com.basics.arrays;

public class E1 {
    public static void main(String[] args) {
        // Method 1
        int[] arr;
        arr = new int[5]; // memory allocations [20 Bytes] [4Bytes x 5 blocks]
        System.out.println(arr[4]);
        //if we donot provide any values,
        // the JVM uses " FALLBACK MECHANISM"
        // it uses the default values of that particular data types
        // int -> 0 float->0.0 , String -> null, char -> null
        // Declaration & Memory Allocation in single line
        // Method 2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        // Method 3
        int[] arr3 = {2,8,-1,4,6}; // Assigning custom values
        System.out.println(arr3[4]);
        // Method 4
        int[] arr4 = new int[]{8,0,4,1,3};
        System.out.println(arr4[0]);

    }
}
