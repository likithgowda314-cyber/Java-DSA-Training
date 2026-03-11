package com.advanced.collections.maps;

import java.util.Map;

public class Hashtable {
    public static void main(String[] args) {
        java.util.Hashtable<Integer,String> ht= new java.util.Hashtable<>();
        ht.put(106,"Anushree");
        ht.put(117,"naveen");
        ht.put(128,"meghana");
        ht.put(102,"punith");
        ht.put(100,"sinchana");
        ht.put(99,"kavana");
        ht.put(98,"sheethal");
        for (Map.Entry<Integer,String> entry : ht.entrySet()){
            System.out.println(entry.getKey()+"<->"+entry.getValue());

        }
    }
}
