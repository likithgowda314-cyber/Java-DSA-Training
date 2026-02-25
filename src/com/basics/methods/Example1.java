package com.basics.methods;

public class Example1 {
    static int x = 10;
    static void add(int a , int b) {
        System.out.println(a + b);
        //a,b -> Parameters
        // the variables in a method are called parameters
    }
    public static void main(String[] args) {
        //Example1 obj = new Example1(); // heap memory
        add(1,2); // Method call -> 1,2 (arguments)
        // the actual values passed during method
        // call are argument
        //
        //static can only acessed by static methods
        System.out.println(x);
    }
}
