package com.advanced.collections.base;
import java.util.ArrayList;
import java.util.Collection;
public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveorders = new ArrayList<>();
        liveorders.add("order101");
        liveorders.add("order102");
        liveorders.add("order103");
        // check order
        System.out.println("order101 Available? ExistS? "+ liveorders.contains("order101"));
        // check all the orders
        System.out.println("Live Order:" + liveorders);
        liveorders .remove("order101");
        System.out.println("Live orders:"+ liveorders);
        System.out.println("total live order:"+liveorders.size());
        liveorders.clear();
        System.out.println("current orders:"+liveorders);

    }
}
