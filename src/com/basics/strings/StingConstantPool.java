package com.basics.strings;

public class StingConstantPool {
    public static void main(String[] args) {
        // they have the same literal value "java"
        // so they point to the same object in Heap
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1==s2); // compares objects
        String s3 = new String("Java");
        System.out.println(s1==s3); // they are different object
        System.out.println(s1.equals(s3)); // checking values

    }
}
