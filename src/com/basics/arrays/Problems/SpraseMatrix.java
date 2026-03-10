package com.basics.arrays.Problems;

public class SpraseMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {0,1,3},
                {1,0,0},
                {4,0,0},
                {8,9,0}};
        int zeors =0;
        int nonzeros=0;
        for (int[] row:matrix){
            for(int col:row){
                if(col==0){
                    zeors++;
                }else{
                    nonzeros++;
                }
            }
        }
        if(zeors>nonzeros) {
            System.out.println("Spares Matrix");
        }else if(zeors==nonzeros){
            System.out.println("Cannot be Detremined");
        }else{
            System.out.println("Not a Sparse Matrix");
        }

    }
}
