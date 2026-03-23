package com.advanced.dsa.dataStructures.nonLinear.graphs.traversal;

import javax.swing.event.ListDataListener;
import java.net.Inet4Address;
import java.util.*;

class GraphBFS{
    public List<Integer> bfsGraph(int V,List<List<Integer>>adjlist){
        List<Integer>result=new ArrayList<>();
        boolean[] visited = new boolean[V+1];// 0-based index
        Queue<Integer> q = new LinkedList<>();
        // start the bfs from node 1
        visited[1]=true;
        q.add(1);
        while (!q.isEmpty()){
            int node = q.poll();
            result.add(node);
            // travel all of its neighbour
            // if they are not visited ,push all to the queue
            // if visited - skip
            for (int neighbour : adjlist.get(node)){
                if (!visited[neighbour]){ // if not visited
                    visited[neighbour]=true;// mark true
                    q.add(neighbour); // push to queue
                }
            }
        }
        return result; // return the output as a List<Integer>
    }
}
public class GraphBFSTraversal {
    public static void main(String[] args) {
        int V=5;
        List<List<Integer>> adjList= new ArrayList<>();
        for (int i=0;i<=V;i++){
            adjList.add(new ArrayList<>());
        }
        // add the given edges in the undirected graph
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,3);
        addEdge(adjList,3,4);
        addEdge(adjList,4,5);
        addEdge(adjList,2,5);
        GraphBFS obj = new GraphBFS();
        List<Integer> result=obj.bfsGraph(V,adjList);
        printBFS(result);

    }
    public static void addEdge(List<List<Integer>>adjList,int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);

    }
    public static void printBFS(List<Integer> result){
        for (int num : result){
            System.out.print(num+" ");
        }
        System.out.println();
    }

}
