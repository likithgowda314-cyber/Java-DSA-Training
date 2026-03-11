package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.HashSet;

public class FrequencyCount{
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,1,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            // 1=2,2=2,2=3,3=4,4=1,1=4 and so on it counts frequency
            map.put(num,map.getOrDefault(num ,0)+1);
        }
        System.out.println(map);
        System.out.println("Count of 4:"+map.get(4));
        System.out.println();
    }
}
