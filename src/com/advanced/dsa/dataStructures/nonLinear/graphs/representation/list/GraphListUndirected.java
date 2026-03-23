package com.advanced.dsa.dataStructures.nonLinear.graphs.representation.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n-> number of nodes
        // m -> number of edges
        // we cover all the n nodes to get the matrix
        // time complexity = Big O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Adjacency list
        // {{},{},{},{}}; // Without this output will be wrong
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i=0;i<=n;i++){
            adjacencyList.add(new ArrayList<>());

        }
        // Read / input the edges from the user
        for (int i=0;i<m;i++){
            int u =sc.nextInt();
            int v = sc.nextInt();
            //undirected graph u <--> v
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u); // only for undirected
        }
        // print adjacency list
        for (int i=1;i<=n;i++) {
            System.out.print("Node:"+i+"List of Neighbour:");
            for (int neighbour:adjacencyList.get(i)){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
