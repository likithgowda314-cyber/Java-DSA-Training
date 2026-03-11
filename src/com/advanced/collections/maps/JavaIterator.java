package com.advanced.collections.maps;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    // remove some values in alist using Iterator
    // the Iterator is an interface in collections library in java
    // it is uded to navigate  & perfrom certain opreations
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(21);
        numbers.add(13);
        numbers.add(15);
        numbers.add(2);
        System.out.println("before"+numbers);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if (i > 10) {
                it.remove();
            }
        }
        System.out.println("after:"+numbers);
    }


}
