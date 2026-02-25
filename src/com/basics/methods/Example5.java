package com.basics.methods;

public class Example5 {
    static int hammingWeight(int n){
        int count = 0;
        while (n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("hw-11:" + hammingWeight(6));
        System.out.println("hw-9:" + hammingWeight(7));
        System.out.println("hw-12:" +hammingWeight(8));

    }
}
