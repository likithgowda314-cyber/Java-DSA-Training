package com.advanced.dsa.dataStructures.nonLinear.graphs.algorithms.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSortBFSKahnCycleDetection {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj){
        int[] inDegree= new int[V+1];
        // Step 1 calculate the in-Degree of all nodes
        for (int i=0; i<V;i++){
            for (int neighbour : adj.get(i)){
                inDegree[neighbour]++;
            }
        }
        // Step 2 : add all nodes with in-degree 0 into the queue
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<V;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        // Step 3: count the nodes processed in the
        int count=0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            // reduce the in-degree of the adjacent nodes
            // while reducing if in-degree becomes 0,oush the node to queue
            for (int neighbour : adj.get(node)) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    q.add(neighbour);

                }
            }
        }
        return count!=V;
    }

    public static void main(String[] args) {
        int V=5; // 0-based index
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        // we have to initialize with empty arrays
        for (int i =0; i<V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(2);
        TopologicalSortBFSKahnCycleDetection obj = new TopologicalSortBFSKahnCycleDetection();
        boolean ans = obj.isCyclic(V,adj);
        if (ans){
            System.out.println("Cycle Detected" );
        }else{
            System.out.println("No cycle Detected ");
        }
    }
}
