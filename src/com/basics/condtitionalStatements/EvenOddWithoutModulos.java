package com.basics.condtitionalStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOddWithoutModulos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        if((n&1)==0) {
            System.out.println(n + " is even " );
        }else{
            System.out.println(n + " is odd ");
        }
    }
}
