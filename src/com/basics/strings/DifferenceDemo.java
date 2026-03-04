package com.basics.strings;

public class DifferenceDemo {
    public static void main(String[] args) {
        String s = "Java";
        // hashcode -> unique id or no given by JVM
        System.out.println("String before:"+s.hashCode());
        s = s+"DSA";
        System.out.println("sTring after:"+s.hashCode());
        // this proves that stings are IMMUTABLE
       //for(int i=0; i<1000; i++) {
          // s = s + "DSA";
     //  }
       //this is bad because it will create 1000 new objects
         //   to do this we have two special MUTABLE Stings
                // StringBuffer & StringBuilder -> java.lang
        StringBuilder builder = new StringBuilder("Java");
        System.out.println("Builder before:"+builder.hashCode());
        System.out.println("Builder after:"+builder.hashCode());



    }
}
