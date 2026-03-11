package com.advanced.collections.maps;

import java.util.Map;

public class Hashtable1 {
    public static void main(String[] args) {
        java.util.Hashtable<Integer,String> ht= new java.util.Hashtable<>();
        ht.put(106,"Anushree");
        ht.put(117,"naveen");
        ht.put(128,"meghana");
        ht.put(102,"punith");
        ht.put(100,"sinchana");
        ht.put(99,"kavana");
        ht.put(98,"sheethal");
        System.out.println(ht.getOrDefault(99,"Not Found"));
        System.out.println(ht.getOrDefault(101,"Not found"));
        ht.putIfAbsent(90,"akash");
        System.out.println("Updated Table:"+ht);
        ht.putIfAbsent(102,"surav"); // it wont update
        System.out.println("Updated Table:"+ht);

    }
}
