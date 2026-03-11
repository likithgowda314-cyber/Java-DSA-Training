package com.advanced.collections.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {9,8,1,2,3,4,5,6,2,1,7,8};
        System.out.println(Arrays.toString(arr));
        Set<Integer> uniqueElements = new HashSet<>();
        for(int x : arr){
            uniqueElements.add(x);
        }
        System.out.println("Unique Elements:" + uniqueElements);
        Set<Integer> nonduplicates = new HashSet<>();
        nonduplicates.addAll(Arrays.asList(9,8,1,2,3,4,5,6,2,1,7,8));
        System.out.println(nonduplicates);
    }
}
