package com.basics.loopingStatements;

public class PrintingMultiplicationTable {
    public static void main(String[] args) {
        int n =10;
        for (int i=1;i<=10; i++){ //rows
            for(int j=1;j<=10; j++){ //colums
                // 1x1=1
                System.out.print(i + "x" + j + "=" + i*j +"\t");
            }
            System.out.println();
        }
    }
}
