package com.basics.methods;

public class Example4 {
    static int maxpeices(int n){
        return ((n*(n+1))/2)+1;
    }
    static int maxregion(int n){
        return ((n*(n+1))/2)+1;
    }

    public static void main(String[] args) {
        System.out.println("max peices"+ maxpeices(5));
        System.out.println("max region"+ maxregion(4));
    }

}
