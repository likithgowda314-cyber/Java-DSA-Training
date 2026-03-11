package com.advanced.collections.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(3,"a");
        map.put(4,"b");
        map.put(2,"c");
        map.put(1,"d");

        System.out.println(map);
    }
}
