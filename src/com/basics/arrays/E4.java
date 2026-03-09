package com.basics.arrays;

public class E4 {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4,5},
                           {6,7},
                           {8}};
        for (int[]x:numbers){
            for (int n: x){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        char[][] names = {{'a','k','a','s','h'},
                {'l','i','k','i','t','h'},
                {'n','a','v','e','e','n'},
                {'n','i','s','c','h','i'},
                {'r','a','j','u'}};
        for (char[]ch:names){
            for (char c:ch){
                System.out.print(c+ " ");
            }
            System.out.println();
        }
        boolean[][] data = {{true,false,true},
                {false},
                {true,false}};
        for (boolean[]bool : data){
            for (boolean b : bool){
                System.out.println(b+" ");
            }
            System.out.println();
        }
    }
}
