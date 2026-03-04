package com.basics.garbageCollection;

public class GCExample {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Python");
        s1 = s2;
        //System.gc();  // We wrote in previous versions
        // Now its is not mandatory
        // Now in the SCP -> "Java" is not available
        // This proves that garbage Collection is Automatic
        // Any unused Data is Cleared = Garbage Collection
        System.out.println(s1);
    }
}
