package com.advanced.dsa.dataStructures.nonLinear.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity = new PriorityQueue<>();
        // 1 -> high priority
        // 5 -> low priority
        // 3 -> medium priority
        // patient with higher priority shall be operated first
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("patient that gets operated first:"+severity.poll());
        System.out.println("patient in queue:"+ severity);

    }
}
