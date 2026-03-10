package com.advanced.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart= new ArrayList<>();
        cart.add("M5-Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        // mouse no longer needed
        cart.remove("Mouse"); // it is case sensitive
        System.out.println("Latest cart after removal "+ cart);
        cart.set(1,"mechnical Keyboard"); //set means replace
        System.out.println("Latest cart after update:" + cart);

    }
}
