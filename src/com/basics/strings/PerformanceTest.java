package com.basics.strings;

public class PerformanceTest {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Java");
        for (int i=1;i<1000000;i++){
            builder.append("DSA");
        }
        System.out.println("Builder Time:"+(System.currentTimeMillis()-starttime)+"ms");
        starttime=System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Java");
        for (int i=1;i<1000000;i++){
            buffer.append("DSA");
        }
        System.out.println("Buffer Time:"+(System.currentTimeMillis()-starttime)+"ms");
        // builder takes less time than buffer
        // builder is better for the larger changes
    }
}
