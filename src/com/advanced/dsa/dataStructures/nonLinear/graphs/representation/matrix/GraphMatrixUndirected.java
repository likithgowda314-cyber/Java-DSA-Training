package com.advanced.dsa.dataStructures.nonLinear.graphs.representation.matrix;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class GraphMatrixUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n-> number of nodes
        // m -> number of edges
        // we cover all the n nodes to get the matrix
        // time complexity = Big O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        //Undirected graph u <--> v
        // for 0-based index it is better to take n+1,n+1
        int[][] adjacencyMatrix = new int[n+1][n+1];
        // take the input of the edges from the user
        for (int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjacencyMatrix[u][v]=1;
            adjacencyMatrix[v][u]=1;
        }
        // print the  adjacency matrix
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();// close the resource after using it
    }
}
