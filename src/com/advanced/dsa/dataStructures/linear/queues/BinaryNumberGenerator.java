package com.advanced.dsa.dataStructures.linear.queues;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    public static void generateBinary1ToN(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while(N--> 0){
            String curr = q.poll();
            System.out.println(curr + " "); //print
            q.offer(curr+"0");
            q.offer(curr+"1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N =5 ;
        generateBinary1ToN(N);
        generateBinary1ToN(6);
        generateBinary1ToN(10);
    }
}
