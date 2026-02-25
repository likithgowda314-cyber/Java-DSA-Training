package com.basics.loopingStatements;

public class BreakStatement {
    public static void main(String[] args) {
        // break statement end loop & goes out of the loop
        for (int i = 1; i < 10; i++) {
            if(i==11){
                break;
            }
            System.out.println(i + " ");
        }
    }
}
