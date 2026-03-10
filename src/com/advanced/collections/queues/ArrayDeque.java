package com.advanced.collections.queues;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        //Double - ended queue
        Deque<String> actions = new java.util.ArrayDeque<>();
        actions.addLast("user type A");
        actions.addLast("user type B");
        actions.addLast("user type C");
        System.out.println("Initial actions:"+actions);
        System.out.println("Undo action:"+actions.removeLast());
        System.out.println("remaining Actions:"+actions);

    }

}
