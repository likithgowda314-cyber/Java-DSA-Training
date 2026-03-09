package com.basics.arrays;

public class E3 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7}; // 1 Dimensional Array
        System.out.println(arr.length);
        // 2D Array or Matrix or [Array of arrays]
        int[][] matrix = {{1, 2, 3},  //0
                {4, 5, 6},  //1
                {7, 8, 9},  //2
                {9, 8, 7}}; //3
        // {{},{},{}} Empty array
        // Total number of rows = length of the matrix
        System.out.println(matrix.length); // Total No of Rows
        System.out.println(matrix[0].length); // Length of 1st Row
        for (int r = 0; r < matrix.length; r++) { // Rows
            for (int c = 0; c < matrix[0].length; c++) { // Cols
                System.out.print(matrix[r][c] + " "); // Cell [r][c]
            }
            System.out.println();

        }
        char[][] languages = {{'k', 'a', 'n', 'n', 'a', 'd', 'a'},
                {'h', 'i', 'n', 'd', 'i'},
                {'t', 'a', 'm', 'i', 'l'},
                {'m', 'a', 'l', 'y', 'a', 'l', 'a', 'm'},
                {'u', 'r', 'd', 'u'}};
        System.out.println(languages[0].length);
        System.out.println(languages[3].length);
        System.out.println(languages[4].length);
        // Traversal in a Jagged Array
        for (int r = 0; r < languages.length; r++) {
            for (int c = 0; c < languages[r].length; c++) {
                System.out.print(languages[r][c] + " ");
            }
            System.out.println();
        }
        int[][] jagged = {{1, 2, 3, 4, 5, 6, 7, 8, 9},
                {1, 2, 3, 4, 5},
                {1}};
        for (int r = 0; r < jagged.length; r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c]+" ");
            }
            System.out.println();
        }

    }
}
