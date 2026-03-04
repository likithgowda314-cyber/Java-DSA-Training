package com.basics.garbageCollection;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj = new GCDemo(); //class
        obj = null;
        System.gc();
        /*
        Now a days the gc() method is automatically
        called after program execution by the object class
        for clutter,garbage collection & removal by the JVM
        ✅ WE don't need to call it explicitly
         */
        System.out.println("GC Requested!");
    }
}
