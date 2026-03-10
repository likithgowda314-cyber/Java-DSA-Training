package com.advanced.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>() ;
        // for adding elements [add][strict][offer][lenient]
        orders.add("order101");
        orders.offer("order102");
        orders.offer("order103");
        System.out.println("orders:" + orders);
        orders.remove();
        System.out.println("orders :" + orders);
        orders.poll();
        System.out.println("orders:" + orders);
    }
}
