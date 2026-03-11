package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class APILogs {
    public static void main(String[] args) {
        Map<Integer,String> logs = new LinkedHashMap<>();
        logs.put(2,"signup");
        logs.put(1,"Login");
        logs.put(4,"Browse Insta reels");
        logs.put(3,"scroll up & down ");
        logs.put(5,"logout");
        System.out.println("Api logs:" + logs);
    }
}
