package com.basics.patterns;

public class PyramidPattern {
    static void pyramidpattern(int n){
        for (int i=1;i<=n;i++){
            //space
            for (int j=1;j<=(n-i);j++){
                    System.out.print("   ");
            }
            for(int k=1;k<=(2*i-1);k++){
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramidpattern(5);
    }

}
