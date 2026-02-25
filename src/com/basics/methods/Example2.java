package com.basics.methods;

public class Example2 {
    static int sumOfNTerms(int n) {
        return (n * (n + 1) / 2);
    }
    public static void main(String[] args) {
        // first way is to store into a variable & then print
        // in int we are calling the sum
        int sum = sumOfNTerms(10);

        System.out.println(sum);
        // second way is to directly print it
        System.out.println(sumOfNTerms(100));
    }

}
