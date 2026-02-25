package com.basics.loopingStatements;

import java.util.Scanner;

public class PrintEvenOddRange {
    public static void main(String[] args) {
        System.out.println("enter the range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<= n){
            if (i%2==0){
                System.out.println(i + " is even ");
            }else{
                System.out.println(i + " is odd ");
            }
            i++;
        }
    }
}
