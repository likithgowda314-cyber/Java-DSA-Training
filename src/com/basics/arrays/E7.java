package com.basics.arrays;
// Varargs -> Using . . . for an array {it internally uses arrays}
public class E7 {
    public static void display(int... arr){
        for(int n : arr){
            System.out.print(n +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {0,9,8,7,6,5};
        display(array);

    }
}
