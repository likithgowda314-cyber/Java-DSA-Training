package com.advanced.collections.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Leaderboard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder());
        scores.add(200);
        scores.add(100);
        scores.add(150);
        scores.add(300);
        scores.add(500);
        scores.add(400);
        scores.add(700);
        System.out.println("Board set:"+ scores);
    }
}
