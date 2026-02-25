package com.basics.condtitionalStatements;
import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        //Nesting - Condition Inside Condtion
        /*
        Even -> Whether it is divisible by 4 or not
        Odd ->  Whether it is divisible by 3 or not
         */
        // Object -> CLassName obj = new CLassname();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            if (n % 4 == 0) {
                System.out.println(n + "is div by 4");
            } else {
                System.out.println(n + "is not div by 4");
            }
        } else if (n % 3 == 0) {
            System.out.println(n + "is div by 3");
        } else {
            System.out.println(n + "is not div by 3");
        }

    }
}
